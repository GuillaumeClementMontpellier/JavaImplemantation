package impl;

import graph.*;

public class UndirectedGraph implements Graph{

	private UndirectedEdge[] edges;
	private Vertex[] vertices;

	private int nbMaxEdge;
	private int nbMaxVertex;
	private int nbEdge;
	private int nbVertex;

	public UndirectedGraph(int nbMaxEdge, int nbMaxVertex){

		this.edges = new UndirectedEdge[nbMaxEdge];
		this.vertices = new Vertex[nbMaxVertex];

		this.nbEdge = 0;
		this.nbVertex = 0;

		this.nbMaxVertex = nbMaxVertex;
		this.nbMaxEdge = nbMaxEdge;

	}

	public void addEdge(Edge e){

		if((nbEdge < nbMaxEdge) && (e instanceof UndirectedEdge)){

			this.edges[this.nbEdge] = (UndirectedEdge) e;

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
			} else if ( e == this.edges[i]){
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
			} else if ( v == this.vertices[i] ){
				deleted = true;
			}

		}

		if(deleted){
			this.nbVertex -= 1;
		}

	}

	public Vertex getVertexById(int id){

		return this.vertices[id];

	}

	public UndirectedEdge getEdgeById(int id){

		return this.edges[id];

	}

	public boolean connected(Vertex v1, Vertex v2){
		boolean connected = false;

		for (int i = 0; i < this.nbEdge; i++){

			if( (v1 == this.edges[i] && v2 == this.edges[i] )  || 
				(v1 == this.edges[i] && v2 == this.edges[i] ) ){

				connected = true;

			}
		}

	}

	public Vertex[] getNeighbours(int id){

		//Chercher le nbr de voisin
		int nbr = 0;

		Vertex cible = this.getVertexById(id);

		for (int j = 0; j < this.nbVertex; j++) {

			if( connected(cible, this.vertices[j])){
				nbr++;
			}
			
		}	

		//mettre les voisins dans le tab
		Vertex[] result = new Vertex[nbr];
		nbr = 0;


		for (int j = 0; j < this.nbVertex; j++) {

			if( connected(cible, this.vertices[j])){
				result[nbr] = this.vertices[j];
				nbr++;
			}
			
		}	

	}

	public int getNbMaxVertex(){
		return this.nbMaxVertex;
	}

	public int getNbMaxEdge(){
		return this.nbMaxEdge;
	}

	public int getNbVertex(){
		return this.nbVertex;
	}

	public int getNbEdge(){
		return this.nbEdge;
	}


}