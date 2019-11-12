/**
 * 
 */
package com.learning.service;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.learning.model.json.Edge;
import com.learning.model.json.Flow;
import com.learning.model.json.JsonGraph;
import com.learning.model.json.Task;

/**
 * @author vbejjanki
 *
 */

@Service
public class GraphExectionService {
	
	@Resource(name = "cached")
	private ExecutorService executorService;
	
	public void exec(JsonGraph jsonGraph) {
	
		Map<Long,Task> taskList = jsonGraph.getTasks();
		
		
		for(Entry<String, Flow> flow : jsonGraph.getFlows().entrySet()) {
			
			List<Edge> edges = flow.getValue().getEdges();
			
			edges.stream().map(f -> {
			return addDependentTask(f.getFromId(),f.getToId()); 	
			}).collect(Collectors.toList());
			
		}
		
	}
	
	private CompletableFuture<Long> addDependentTask(Long from, Long to) {
		return CompletableFuture.supplyAsync(() -> from).supplyAsync(() -> to);
	} 

}
