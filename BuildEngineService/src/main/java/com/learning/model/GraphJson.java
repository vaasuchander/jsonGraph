/**
 * 
 */
package com.learning.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 * @author vbejjanki
 *
 */

@Entity
public class GraphJson {

	@Id
	private Long id;

	private Long playBookId;

	@Lob
	private String json;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPlayBookId() {
		return playBookId;
	}

	public void setPlayBookId(Long playBookId) {
		this.playBookId = playBookId;
	}

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}

}
