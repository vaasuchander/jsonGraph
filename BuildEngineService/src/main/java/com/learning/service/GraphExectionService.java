/**

 * 
 */
package com.learning.service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.learning.model.json.GraphModel;

/**
 * @author vbejjanki
 *
 */

@Service
public class GraphExectionService {
	
	@Resource(name = "cached")
	private ExecutorService executorService;
	
	public void exec(GraphModel jsonGraph) {
	
		/*
		 * Map<Long,Task> taskList = jsonGraph.getTasks();
		 * 
		 * 
		 * for(Entry<String, Flow> flow : jsonGraph.getFlows().entrySet()) {
		 * 
		 * List<Edge> edges = flow.getValue().getEdges();
		 * 
		 * edges.stream().map(f -> { return addDependentTask(f.getFromId(),f.getToId());
		 * }).collect(Collectors.toList());
		 * 
		 * }
		 */
		
	}
	
	private CompletableFuture<Long> addDependentTask(Long from, Long to) {
		return CompletableFuture.supplyAsync(() -> from).supplyAsync(() -> to);
	} 

}
