/**
 * 
 */
package com.learning.model.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author vbejjanki
 *
 */
@JsonInclude(Include.NON_NULL)
public class Task{

	private String name;

	private Parent parent;

	private Predecessor predecessor;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	public Predecessor getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(Predecessor predecessor) {
		this.predecessor = predecessor;
	}

}
