/**
 * 
 */
package com.learning.model;

/**
 * @author vbejjanki
 *
 */

public class Action {

	private String id;

	private String name;

	private long delay;

	private String timestamp;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getDelay() {
		return delay;
	}

	public void setDelay(long delay) {
		this.delay = delay;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Action [id=" + id + ", name=" + name + ", delay=" + delay + ", timestamp=" + timestamp + "]";
	}

}
