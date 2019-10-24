/**
 * 
 */
package com.learning.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author vbejjanki
 *
 */
public class Graph {
	
	private Map<Node, List<Node>> graph = new HashMap<>();
	
	public void addNode(Node value) {
		getGraph().putIfAbsent(value, new ArrayList<>());
	}
	
	public List<Node> getAdjNodes(Node node) {
	    return graph.get(node);
	}
	
	public void addEdge(Node to, Node from, String type) {
		if ("directed".equalsIgnoreCase(type))
			getGraph().get(to).add(from);
		else if ("undirected".equalsIgnoreCase(type)) {
			getGraph().get(to).add(from);
			getGraph().get(from).add(to);
		}
	}

	public Map<Node, List<Node>> getGraph() {
		return graph;
	}

	public void setGraph(Map<Node, List<Node>> graph) {
		this.graph = graph;
	}

	@Override
	public String toString() {
		return "Graph [graph=" + graph + "]";
	}
}
