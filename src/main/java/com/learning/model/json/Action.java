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
public class Action {

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
	
	
	
}
