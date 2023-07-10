package Graph_2;

public class Edge implements Comparable<Edge>{
	int v1;
	int v2;
	int weight;
	public Edge(int v1, int v2, int weight) {
		super();
		this.v1 = v1;
		this.v2 = v2;
		this.weight = weight;
	}
	public Edge() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Edge o) {
		// TODO Auto-generated method stub
		return this.weight - o.weight;
		
	}
	
	
}
