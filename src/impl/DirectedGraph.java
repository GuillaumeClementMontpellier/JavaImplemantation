package impl;

import graph.*;

public class DirectedGraph implements Graph{

	private Vertex[] vertices;
	private DirectedEdge[] edges;

	private int maxEdge;
	private int nbEdge;
	private int maxVertex;
	private int nbVertex;

	public DirectedGraph(int maxEdge, int maxVertex){
		this.nbEdge=0;
		this.nbEdge=0;

		this.vertices = new Vertex[maxVertex];
		this.edges = new DirectedEdge[maxEdge];

		this.maxEdge=maxEdge;
		this.maxVertex=maxVertex;
	}

	public int getNbEdge(){
		return this.nbEdge;
	}

	public int getNbVertex(){
		return this.nbVertex;
	}

	public int getMaxVertex(){
		return this.maxVertex;
	}

	public int getMaxEdge(){
		return this.maxEdge;
	}

	public void addEdge(Edge e){
		if (this.getNbEdge()<maxEdge && (e instanceof DirectedEdge)) {
			this.edges[this.getNbEdge()]= (DirectedEdge) e;
			this.nbEdge+=1;
		}
		else System.out.println("already max edge");
	}

	public void addVertex(Vertex vertex){
		if (getNbVertex()<maxVertex) {
			this.vertices[this.getNbVertex()]=vertex;
			this.nbVertex+=1;
		}
		else System.out.println("already max vertex");
	}

	public void deleteEdge(Edge e){
		boolean find = false;
		for (int i=0; i<this.getNbEdge();i++) {
			if(find){
				this.edges[i]=this.edges[i-1];
				nbEdge-=1;
			} else if (this.edges[i]== e){
				find=true;
			}
		}
	}

	public void deleteVertex(Vertex v){
		boolean find = false;
		for (int i=0; i<this.getNbVertex();i++) {
			if(find){
				this.vertices[i]=this.vertices[i-1];
				nbVertex-=1;
			} else if (this.vertices[i]==v){
				find=true;
			}
		}
	}

	public Edge	getEdgeById(int id){
		return this.edges[id];
	}

	public Vertex getVertexById(int id){
		return this.vertices[id];
	}

	private boolean connected(Vertex start, Vertex end){
		Boolean connected = false;
		for (int i=0; i<getNbEdge();i++) 	
		{
			if (start==this.edges[i].getDirectionFrom() && end==this.edges[i].getDirectionTo()) {
				connected=true;
			}
		}
		return connected;
	}

	public Vertex[]	getNeighbours(int id){
		Vertex the_vertex = getVertexById(id);
		int compteur =0; //on compte le nombre de neighbours

		for (int i=0; i<this.getNbVertex();i++) {
			if (connected(the_vertex,this.vertices[i])){
				compteur++;
			}
		}

		Vertex[] neighbours = new Vertex[compteur]; 
		compteur=0;

		for (int i=0; i<this.getNbVertex();i++) {
			if (connected(the_vertex,this.vertices[i])){
				neighbours[compteur]=this.vertices[i];
				compteur++;
			}
		}
		return neighbours;
	}

}