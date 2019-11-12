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

	private Long fromId;

	private Long toId;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getFromId() {
		return fromId;
	}

	public void setFromId(Long fromId) {
		this.fromId = fromId;
	}

	public Long getToId() {
		return toId;
	}

	public void setToId(Long toId) {
		this.toId = toId;
	}

}
