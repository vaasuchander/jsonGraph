/**
 * 
 */
package com.learning.model.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author vbejjanki
 *
 */

public class GraphModel {

	private Long playBookId;
	
	private Map<Long, PlayBookTaskJson> tasks = new HashMap<>();
	
	private List<Edge> edges = new ArrayList<>();
	
	public Map<Long, PlayBookTaskJson> getTasks() {
		return tasks;
	}

	public void setTasks(Map<Long, PlayBookTaskJson> tasks) {
		this.tasks = tasks;
	}

	public Long getPlayBookId() {
		return playBookId;
	}

	public void setPlayBookId(Long playBookId) {
		this.playBookId = playBookId;
	}

	public List<Edge> getEdges() {
		return edges;
	}

	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}

}
