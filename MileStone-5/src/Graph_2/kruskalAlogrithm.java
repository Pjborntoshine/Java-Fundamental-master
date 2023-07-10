package Graph_2;

import java.util.Arrays;
import java.util.Scanner;

class Edgev implements Comparable<Edgev>{
	int v1;
	int v2;
	int weight;
	public Edgev(int v1, int v2, int weight) {
		super();
		this.v1 = v1;
		this.v2 = v2;
		this.weight = weight;
	}
	@Override
	public int compareTo(Edgev o) {
		// TODO Auto-generated method stub
		return this.weight - o.weight;
	}
	
	
}


public class kruskalAlogrithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int e = sc.nextInt();
		Edgev edges[] = new Edgev[e];
		for(int i=0;i<e;i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int weight = sc.nextInt();
			Edgev edge = new Edgev(v1,v2,weight);
			edges[i] = edge;
		}
		Edgev mst [] = kruskalAlogrithm(edges,n);
		for(int i=0;i<mst.length;i++) {
			if(mst[i].v1<mst[i].v2) {
				System.out.println(mst[i].v1 + " "+ mst[i].v2 + " " + mst[i].weight);
			}else {
				System.out.println(mst[i].v2 + " "+ mst[i].v1 + " " + mst[i].weight);
			}
		}
		
	}

	private static Edgev[] kruskalAlogrithm(Edgev[] edges,int n) {
		// TODO Auto-generated method stub
		Arrays.sort(edges);
		Edgev mst[] = new Edgev[n-1];
		int parent[] = new int[n];
		for(int j=0;j<n;j++) {
			parent[j] = j;
		}
		int count=0,i=0;
		while(count!=n-1) {
			Edgev currentEdge = edges[i++];
			int v1Parent = findParent(currentEdge.v1,parent);
			int v2Parent = findParent(currentEdge.v2,parent);
			if(v1Parent!=v2Parent) {
				// includein current edge
				mst[count] = currentEdge;
				count++;
				parent[v1Parent] = v2Parent;
			}
		}
		return mst;
	}

	private static int findParent(int v, int[] parent) {
		// TODO Auto-generated method stub
		if(v == parent[v]) {
			return v;
		}
		return findParent(parent[v], parent);
	}

	

}
