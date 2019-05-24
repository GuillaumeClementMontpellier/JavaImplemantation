package impl;

import graph.*;

public class TestUndirectedGraph{

	public static void main (String[] args){

		UndirectedGraph g = new UndirectedGraph(10,10);

		g.addVertex(new Vertex("w"));
		g.addVertex(new Vertex("w"));
		g.addVertex(new Vertex("w"));

		g.addEdge(new UndirectedEdge(g.getVertexById(0), g.getVertexById(1)));
		g.addEdge(new UndirectedEdge(g.getVertexById(0), g.getVertexById(2)));


		System.out.println("Test reussi ");

	}
}