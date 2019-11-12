/**
 * 
 */
package com.learning.model.json;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vbejjanki
 *
 */

public class Flow {

	private List<Edge> edges = new ArrayList<>();

	public List<Edge> getEdges() {
		return edges;
	}

	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}

}
