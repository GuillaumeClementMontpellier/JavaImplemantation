package impl;

import graph.*;

public class UndirectedGraph implements Graph{

	private Edge[] edges;
	private Vertex[] vertices;

	private int nbMaxEdge;
	private int nbMaxVertex;
	private int nbEdge;
	private int nbVertex;

	public UndirectedGraph(int nbMaxEdge, int nbMaxVertex){

		this.edges = new Edge[nbMaxEdge];
		this.vertices = new Vertex[nbMaxVertex];

		this.nbEdge = 0;
		this.nbVertex = 0;

		this.nbMaxVertex = nbMaxVertex;
		this.nbMaxEdge = nbMaxEdge;

	}

	public void addEdge(Edge e){

		if(nbEdge < nbMaxEdge){

			this.edges[this.nbEdge] = e;

			this.nbEdge += 1;

		} 
	}
	
	public void addVertex(Vertex vertex){

		if(nbVertex < nbMaxVertex){

			this.vertices[this.nbVertex] = vertex;

			this.nbVertex += 1;
			
		} 

	}

	public void deleteEdge(Edge e){

		boolean deleted = false;

		for ( int i = 0; i < this.nbEdge; i++){

			if (deleted){
				this.edges[i] = this.edges[i-1];
			}

			if ( !deleted && e == this.edges[i]){
				deleted = true;
			}

		}

		if(deleted){
			this.nbEdge -= 1;
		}

	}

	public void deleteVertex(Vertex v){

		boolean deleted = false;

		for ( int i = 0; i < this.nbVertex; i++){

			if (deleted){
				this.vertices[i] = this.vertices[i-1];
			}

			if ( !deleted && v == this.vertices[i]){
				deleted = true;
			}

		}

		if(deleted){
			this.nbVertex -= 1;
		}

	}

	public Vertex getVertexById(int id){

		return this.vertices[i];

	}

	public Edge getEdgeById(int id){

		return this.edges[i];

	}

	public Vertex[] getNeighbours(int id){

		//Chercher le nbr de voisin
		int nbr = 0;

		for (int j = 0; j < this.nbVertex; j++) {

			for (int k = 0; k < this.nbEdge; k++){

			}
			
		}

		

		//mettre les voisins

	}


}