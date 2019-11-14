/**

 * 
 */
package com.learning.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.learning.model.Graph;
import com.learning.model.json.Edge;
import com.learning.model.json.GraphModel;
import com.learning.model.json.PlayBookTaskJson;
import com.learning.model.json.PredecessorConstarintJson;

/**
 * @author vbejjanki
 *
 */

@Service
public class GraphExectionService {

	private static Logger log = Logger.getLogger(GraphExectionService.class.getName());

	@Resource(name = "cached")
	private ExecutorService executor;

	@Inject
	private JsonService jsonService;

	@Inject
	private ObjectMapper objMapper;

	public void exec(final Long id) {

		Optional<Graph> grphOp = jsonService.getGraph(id);

		if (grphOp.isPresent()) {

			Graph grph = grphOp.get();

			try {

				GraphModel grphModel = objMapper.readValue(grph.getJson(), GraphModel.class);

				List<Edge> edges = grphModel.getEdges();
				final Map<Long, PlayBookTaskJson> tasks = grphModel.getTasks();

				List<String> list = edges.stream().map(e -> process(e, tasks)).map(CompletableFuture::join)
						.collect(Collectors.toList());

				log.info("The Result:" + list.toString());

			} catch (JsonProcessingException e) {
			}
		}
	}

	private CompletableFuture<String> process(Edge edge, Map<Long, PlayBookTaskJson> tasks) {
		CompletableFuture<String> future = new CompletableFuture<>();
		if (Objects.nonNull(edge)) {
			PlayBookTaskJson taskFrom = tasks.get(edge.getFromId());
			PlayBookTaskJson taskTo = tasks.get(edge.getToId());
			if (Objects.nonNull(taskFrom)) {
				PredecessorConstarintJson pcjfrom = taskFrom.getPredConstant();
				if (pcjfrom != null) {
					PlayBookTaskJson preTask = tasks.get(pcjfrom.getId());
					future = future.supplyAsync(() -> excecTask(preTask), executor);
					if (pcjfrom.getLag() > 0) {
						future = future.supplyAsync(() -> delay(pcjfrom.getLag()));
					}
				}
				future = future.supplyAsync(() -> excecTask(taskFrom), executor);
			}
			if (Objects.nonNull(taskTo)) {
				PredecessorConstarintJson pcjTo = taskFrom.getPredConstant();
				if (pcjTo != null) {
					PlayBookTaskJson preTask = tasks.get(pcjTo.getId());
					future = future.supplyAsync(() -> excecTask(preTask), executor);
				}
				if (pcjTo.getLag() > 0) {
					future = future.supplyAsync(() -> delay(pcjTo.getLag()));
				}
				future = future.supplyAsync(() -> excecTask(taskTo), executor);
			}
		}
		return future;
	}

	private String excecTask(final PlayBookTaskJson task) {

		task.setActualStartDateandTime(LocalDateTime.now());

		log.info("Task Executed." + Thread.currentThread());

		task.setActualEndDateandTime(LocalDateTime.now());

		return "Done";

	}

	private String delay(int lag) {

		try {
			TimeUnit.MILLISECONDS.sleep(lag);
		} catch (InterruptedException e) {

			log.warning("delay method Failed");

		}

		return "Done";
	}

}
