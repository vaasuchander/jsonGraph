/**
 * 
 */
package com.learning.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.learning.model.Graph;
import com.learning.model.PlayBook;
import com.learning.model.PlayBookTask;
import com.learning.model.json.Edge;
import com.learning.model.json.GraphModel;
import com.learning.model.json.PlayBookTaskJson;
import com.learning.repository.JsonRepository;

/**
 * @author vbejjanki
 *
 */
@Service
public class JsonService {

	@Inject
	private TaskService taskService;

	@Inject
	private ObjectMapper objMapper;

	@Inject
	private JsonRepository jsonRepository;

	@Inject
	private PlayBookService playBookService;

	public void saveJson(final Long id) {

		Optional<PlayBook> playBookOp = playBookService.playBook(id);

		PlayBook playBook = null;

		if (playBookOp.isPresent()) {
			try {
				playBook = playBookOp.get();

				Set<PlayBookTask> tasks = playBook.getPlayBookTasksList();

				GraphModel grph = new GraphModel();

				grph.setPlayBookId(playBook.getId());

				Map<Long, PlayBookTaskJson> tasksMap = tasks.stream().map(s -> {
					PlayBookTaskJson pJson = new PlayBookTaskJson();
					BeanUtils.copyProperties(s, pJson);
					return pJson;
				}).collect(Collectors.toMap(PlayBookTaskJson::getId, Function.identity()));

				grph.setTasks(tasksMap);

				String json = objMapper.writeValueAsString(grph);

				Graph jsonGraph = new Graph();
				jsonGraph.setPlayBookId(id);
				jsonGraph.setJson(json);
				jsonRepository.save(jsonGraph);

			} catch (JsonProcessingException e) {

			}
		}
	}

	public GraphModel buildJsonGraph() {

		GraphModel jsonGraph = new GraphModel();

		List<PlayBookTask> taskList = taskService.getTasks();

		Comparator<PlayBookTask> taskComp = (t1, t2) -> t1.getId().compareTo(t2.getId());

		Collections.sort(taskList, taskComp);

		// Map<String, Flow> flows = new HashMap<>();

		// Map<Long, com.learning.model.json.Task> tasks = taskList.stream()
		// .map(s -> new com.learning.model.json.Task(s.getId(), s.getName()))
		// .collect(Collectors.toMap(com.learning.model.json.Task::getId,
		// Function.identity()));

		// Map<Long, List> grph = new HashMap<>();

		/*
		 * for (Task task : taskList) {
		 * 
		 * grph.put(task.getId(), Collections.EMPTY_LIST);
		 * 
		 * if (task.getParentId() != 0) {
		 * grph.get(task.getParentId()).add(task.getId()); }
		 * 
		 * if (task.getPredecessorId() != 0) {
		 * grph.get(task.getPredecessorId()).add(task.getId()); } }
		 */

		List<Edge> edges;

		// jsonGraph.setTasks(tasks);
		// jsonGraph.setFlows(flows);

		return jsonGraph;
	}

	/*
	 * private void setTaskOrder(PlayBookTask task, Map<Long,
	 * com.learning.model.json.Task> tasksMap) {
	 * 
	 * com.learning.model.json.Task jTask = new com.learning.model.json.Task();
	 * 
	 * }
	 */

}
