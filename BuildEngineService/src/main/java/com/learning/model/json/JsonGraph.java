/**
 * 
 */
package com.learning.model.json;

import java.util.HashMap;
import java.util.Map;

/**
 * @author vbejjanki
 *
 */

public class JsonGraph {

	private Map<Long, Task> tasks = new HashMap<>();
	
	private Map<String, Flow> flows = new HashMap<>();

	public Map<Long, Task> getTasks() {
		return tasks;
	}

	public void setTasks(Map<Long, Task> tasks) {
		this.tasks = tasks;
	}

	public Map<String, Flow> getFlows() {
		return flows;
	}

	public void setFlows(Map<String, Flow> flows) {
		this.flows = flows;
	}

}
