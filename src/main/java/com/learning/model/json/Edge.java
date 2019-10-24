/**
 * 
 */
package com.learning.model.json;

/**
 * @author vbejjanki
 *
 */
public class Edge {

	private String type;

	private Node from;

	private Node to;


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Node getFrom() {
		return from;
	}

	public void setFrom(Node from) {
		this.from = from;
	}

	public Node getTo() {
		return to;
	}

	public void setTo(Node to) {
		this.to = to;
	}

}
