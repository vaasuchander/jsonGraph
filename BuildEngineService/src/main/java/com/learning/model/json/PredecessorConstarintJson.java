/**
 * 
 */
package com.learning.model.json;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author vbejjanki
 *
 */

@Entity
public class PredecessorConstarintJson {

	@Id
	private int id;

	private int lag;

	@OneToOne(mappedBy = "predConstant")
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

}
