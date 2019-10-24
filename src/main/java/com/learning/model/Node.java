/**
 * 
 */
package com.learning.model;

/**
 * @author vbejjanki
 *
 */
public class Node {

	private boolean isActionNode;

	private String id;

	private Task task;

	private Action action;

	public Node() {
		// TODO Auto-generated constructor stub
	}

	public Node(boolean isActionNode, String id, Task task) {
		super();
		this.isActionNode = isActionNode;
		this.id = id;
		this.task = task;
	}

	public Node(boolean isActionNode, String id, Action action) {
		super();
		this.isActionNode = isActionNode;
		this.id = id;
		this.action = action;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	public boolean isActionNode() {
		return isActionNode;
	}

	public void setActionNode(boolean isActionNode) {
		this.isActionNode = isActionNode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Node [isActionNode=" + isActionNode + ", id=" + id + ", task=" + task + ", action=" + action + "]";
	}

}
