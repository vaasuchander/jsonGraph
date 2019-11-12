/**
 * 
 */
package com.learning.model.json;

/**
 * @author vbejjanki
 *
 */
public class Task {

	private Long id;
	
	private String name;
	
	private int executionLevel;
	
	private int executionOrder;
	
	public Task() {
		// TODO Auto-generated constructor stub
	}
	
	public Task(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getExecutionLevel() {
		return executionLevel;
	}

	public void setExecutionLevel(int executionLevel) {
		this.executionLevel = executionLevel;
	}

	public int getExecutionOrder() {
		return executionOrder;
	}

	public void setExecutionOrder(int executionOrder) {
		this.executionOrder = executionOrder;
	}
	
}
