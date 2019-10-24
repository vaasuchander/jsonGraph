package com.learning.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.learning.model.Action;
import com.learning.model.Graph;
import com.learning.model.Node;
import com.learning.model.Task;
import com.learning.model.json.GraphModel;

/**
 * 
 * @author vbejjanki
 *
 */

@Service
public class GraphService {

	@Inject
	private FileService fileService;

	public List<Graph> loadAndProcess() {
		List<GraphModel> graphModelList = fileService.getGraphModels();
		List<Graph> graphList = new ArrayList<>();
		Map<String, Task> tasks = new HashMap<>();
		for (GraphModel graph : graphModelList) {
			final Graph grph = new Graph();
			Map<String, Node> nodes = graph.getConstraints().entrySet().stream().sequential()
					.filter(x -> x.getValue() != null).map(x -> x.getValue().getNodes()).map(x -> {
						return x.stream().filter(Objects::nonNull).map(y -> {
							Node node = null;
							if ("tasks".equals(y.getRef())) {
								node = createTask(tasks, graph, y);
							} else if ("actions".equals(y.getRef())) {
								node = createAction(graph, y);
							}
							return node;
						}).collect(Collectors.toList());
					}).flatMap(List::stream).collect(Collectors.toMap(Node::getId, Function.identity()));
			nodes.entrySet().stream().forEach(x -> grph.addNode(x.getValue()));
			graph.getConstraints().entrySet().stream().map(e -> e.getValue().getEdges()).flatMap(List::stream).forEach(
					e -> grph.addEdge(nodes.get(e.getFrom().getId()), nodes.get(e.getTo().getId()), "directed"));
			graphList.add(grph);
		}
		return graphList;
	}

	/**
	 * @param graph
	 * @param jNode
	 */
	private Node createAction(GraphModel graph, com.learning.model.json.Node jNode) {
		Action action = new Action();
		Node node = null;
		com.learning.model.json.Action jsonAction = graph.getActions().get(jNode.getId());
		if(Objects.nonNull(jsonAction)) {
			action.setDelay(jsonAction.getDelay());
			action.setId(jNode.getId());
			action.setName(jsonAction.getName());
			action.setTimestamp(jsonAction.getTimestamp());
			node = new Node(true, jNode.getId(), action);
		}
		return node;
	}

	/**
	 * @param tasks
	 * @param graph
	 * @param jNode
	 * @return
	 */
	private Node createTask(Map<String, Task> tasks, GraphModel graph, com.learning.model.json.Node jNode) {
		Node node;
		com.learning.model.json.Task jsontask = graph.getTasks().get(jNode.getId());
		Task task = null;
		if (Objects.nonNull(jsontask)) {
			task = new Task();
			task.setName(jsontask.getName());
			task.setId(jNode.getId());
			if (Objects.nonNull(jsontask.getParent()) && tasks.containsKey(jNode.getId())) {
				task.setParent(tasks.get(jNode.getId()));
			}
			if (Objects.nonNull(jsontask.getPredecessor()) && tasks.containsKey(jNode.getId())) {
				task.setPredecessor(tasks.get(jNode.getId()));
			}
		}
		tasks.putIfAbsent(jNode.getId(), task);
		node = new Node(false, jNode.getId(), task);
		return node;
	}

}
