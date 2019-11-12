/**
 * 
 */
package com.learning.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author vbejjanki
 *
 */

@Entity
public class PlayBook {

	@Id
	private String id;

	private String name;

	private String description;

	private boolean isLocked;

	private boolean isDeleted;
	
	@OneToMany(mappedBy="PlayBookTask")
	private List<PlayBookTask> playBookTasksList = new  ArrayList<>(); 

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

	public List<PlayBookTask> getPlayBookTasksList() {
		return playBookTasksList;
	}

	public void setPlayBookTasksList(List<PlayBookTask> playBookTasksList) {
		this.playBookTasksList = playBookTasksList;
	}

}