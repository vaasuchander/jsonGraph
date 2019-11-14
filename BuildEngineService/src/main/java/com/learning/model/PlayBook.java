/**
 * 
 */
package com.learning.model;

import java.util.HashSet;
import java.util.Set;

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
	private Long id;

	private String name;

	private String description;

	private boolean isLocked;

	private boolean isDeleted;
	
	@OneToMany(mappedBy="playBook")
	private Set<PlayBookTask> playBookTasksList = new  HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public Set<PlayBookTask> getPlayBookTasksList() {
		return playBookTasksList;
	}

	public void setPlayBookTasksList(Set<PlayBookTask> playBookTasksList) {
		this.playBookTasksList = playBookTasksList;
	}

}