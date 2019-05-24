package impl;

import graph.*;

public class TestDirectedGraph{

	public static void main (String[] args){

		DirectedGraph g = new DirectedGraph(10,10);

		g.addVertex(new Vertex("w"));
		g.addVertex(new Vertex("w"));
		g.addVertex(new Vertex("w"));

		g.addEdge(new DirectedEdge(g.getVertexById(0), g.getVertexById(1), g.getVertexById(0), g.getVertexById(1)));
		g.addEdge(new DirectedEdge(g.getVertexById(0), g.getVertexById(2), g.getVertexById(0), g.getVertexById(2)));


		System.out.println("Test reussi ");

	}
}