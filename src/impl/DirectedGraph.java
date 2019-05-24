package impl;

public class DirectedGraph implements Graph{

	private Vertex[] vertices = new Vertex[maxVertex];
	private DirectedEdge[] edges = new DirectedEdge[maxEdge];

	private int maxEdge;
	private int nbEdge;
	private int maxVertex;
	private int nbEdge;

	public DirectedGraph(int maxEdge, int maxVertex){
		this.nbEdge=0;
		this.nbEdge=0;

		this.maxEdge=maxEdge;
		this.maxVertex=maxVertex;
	}

	public void addEdge(Edge e){
		if (nbEdge<maxEdge && (e instanceof DirectedEdge)) {
			this.edges[this.nbEdge]=e;
			this.nbEdge+=1;
		}
		else System.out.println("already max edge");
	}

	public void addVertex(Vertex vertex){
		if (nbVertex<maxVertex) {
			this.vertices[this.nbVertex]=vertex;
			this.nbVertex+=1;
		}
		else System.out.println("already max vertex");
	}

	public void deleteEdge(Edge e){
		boolean find = false;
		for (int i=0; i<this.nbEdge;i++) {
			if(find){
				this.edges[i]=this.edges[i-1];
				nbEdge-=1
			} else if (this.edges[i]== e){
				find=true;
			}
		}
	}

	public void deleteVertex(Vertex v){
		boolean find = false;
		for (int i=0; i<this.nbVertex;i++) {
			if(find){
				this.vertices[i]=this.vertices[i-1];
				nbVertex-=1
			} else if (this.vertices[i]== e){
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

	public Vertex[]	getNeighbours(int id){

	}

}