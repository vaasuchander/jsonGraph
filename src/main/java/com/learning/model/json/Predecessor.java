/**
 * 
 */
package com.learning.model.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author vbejjanki
 *
 */
@JsonInclude(Include.NON_NULL)
public class Predecessor {

	@JsonProperty("$ref")
	private String ref;

	@JsonProperty("$id")
	private String id;

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
