package com.learning.model.json;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Constraints {

	private Map<String, Flow> constraints = new HashMap<>();

	public Map<String, Flow> getConstraints() {
		return constraints;
	}

	public void setConstraints(Map<String, Flow> constraints) {
		this.constraints = constraints;
	}

}
