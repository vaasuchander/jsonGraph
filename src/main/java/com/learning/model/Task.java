/**
 * 
 */
package com.learning.model;

/**
 * @author vbejjanki
 *
 */
public class Task {

	private String id;

	private String name;

	private Task parent;

	private Task predecessor;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Task getParent() {
		return parent;
	}

	public void setParent(Task parent) {
		this.parent = parent;
	}

	public Task getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(Task predecessor) {
		this.predecessor = predecessor;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", parent=" + parent + ", predecessor=" + predecessor + "]";
	}
	
	
}
