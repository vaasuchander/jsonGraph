/**
 * 
 */
package com.learning.model.json;

import javax.persistence.Id;

/**
 * @author vbejjanki
 *
 */

public class PredecessorConstarintJson {

	private int id;

	private int lag;

	private PlayBookTaskJson playBookTask;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLag() {
		return lag;
	}

	public void setLag(int lag) {
		this.lag = lag;
	}

	public PlayBookTaskJson getPlayBookTask() {
		return playBookTask;
	}

	public void setPlayBookTask(PlayBookTaskJson playBookTask) {
		this.playBookTask = playBookTask;
	}

}
