/**
 * 
 */
package com.learning.model.json;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author vbejjanki
 *
 */

@JsonInclude(Include.NON_NULL)
public class GraphModel {

	private Map<String, Task> tasks = new HashMap<>();

	private Map<String, Action> actions = new HashMap<>();

	private Map<String, Flow> constraints = new HashMap<>();

	public Map<String, Task> getTasks() {
		return tasks;
	}

	public void setTasks(Map<String, Task> tasks) {
		this.tasks = tasks;
	}

	public Map<String, Action> getActions() {
		return actions;
	}

	public void setActions(Map<String, Action> actions) {
		this.actions = actions;
	}

	public Map<String, Flow> getConstraints() {
		return constraints;
	}

	public void setConstraints(Map<String, Flow> constraints) {
		this.constraints = constraints;
	}

}
