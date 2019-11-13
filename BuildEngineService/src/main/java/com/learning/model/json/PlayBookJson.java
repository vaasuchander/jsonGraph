/**
 * 
 */
package com.learning.model.json;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.OneToMany;

/**
 * @author vbejjanki
 *
 */

public class PlayBookJson {

	private String id;

	private String name;

	private String description;

	private boolean isLocked;

	private boolean isDeleted;
	
	@OneToMany(mappedBy="playBook")
	private Set<PlayBookTaskJson> playBookTasksList = new  HashSet<>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isLocked() {
		return isLocked;
	}

	public void setLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Set<PlayBookTaskJson> getPlayBookTasksList() {
		return playBookTasksList;
	}

	public void setPlayBookTasksList(Set<PlayBookTaskJson> playBookTasksList) {
		this.playBookTasksList = playBookTasksList;
	}

}