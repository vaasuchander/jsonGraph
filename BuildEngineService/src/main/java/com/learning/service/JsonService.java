/**
 * 
 */
package com.learning.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.learning.model.PlayBookTask;
import com.learning.model.json.Edge;
import com.learning.model.json.Flow;
import com.learning.model.json.JsonGraph;

/**
 * @author vbejjanki
 *
 */
@Service
public class JsonService {

	@Inject
	private TaskService taskService;

	private AtomicInteger order = new AtomicInteger(0);

	public JsonGraph buildJsonGraph() {

		JsonGraph jsonGraph = new JsonGraph();

		List<PlayBookTask> taskList = taskService.getTasks();

		Comparator<PlayBookTask> taskComp = (t1, t2) -> t1.getId().compareTo(t2.getId());

		Collections.sort(taskList, taskComp);

		Map<String, Flow> flows = new HashMap<>();

		Map<Long, com.learning.model.json.Task> tasks = taskList.stream()
				.map(s -> new com.learning.model.json.Task(s.getId(), s.getName()))
				.collect(Collectors.toMap(com.learning.model.json.Task::getId, Function.identity()));

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

		jsonGraph.setTasks(tasks);
		jsonGraph.setFlows(flows);

		return jsonGraph;
	}

	private void setTaskOrder(PlayBookTask task, Map<Long, com.learning.model.json.Task> tasksMap) {

		com.learning.model.json.Task jTask = new com.learning.model.json.Task();

	}

}
