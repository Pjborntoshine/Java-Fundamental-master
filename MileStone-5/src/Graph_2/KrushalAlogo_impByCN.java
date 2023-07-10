package Graph_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KrushalAlogo_impByCN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();

		kshalAlgoByMe(V,E);
	}

	private static void kshalAlgoByMe(int v, int e) {
		// TODO Auto-generated method stub
//		Edge[] edgiList  = new Edge[v];
		ArrayList<Edge> edgeList = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		for(int i=0;i<e;i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			int weight = s.nextInt();
			Edge edg = new Edge(v1, v2, weight);
//			edgiList[i] = edg;
			edgeList.add(edg);
			
		}
		int parent[] = new int[edgeList.size()];
		for(int i=0;i<parent.length;i++) {
			parent[i] = i;
		}
		
		Collections.sort(edgeList);
		int elementSot[] = new int[edgeList.size()];
		for(Edge ed : edgeList) {
			System.out.println(ed.v1 +" - "+" - " + ed.v2 + " -- "+ed.weight);
//			elementSot[i] = ed.weight;
		}
		System.out.println("************" + edgeList.get(1).v1 + " " + edgeList.get(1).v2);
		int count=0;
		ArrayList<Edge> opList = new ArrayList<>();
		while(count != v) {
			Edge currentEdge = edgeList.get(count);
//			System.out.println( currentEdge.v1 + " "+ currentEdge.v2 + " " +currentEdge.weight );
			// union alogrithm
			int v1 = parent[currentEdge.v1];
			int v2 = parent[currentEdge.v2];
			System.out.println(v1 + " " + v2);
			int pv1,pv2;
			
			while(v1 != parent[v1]) {
				v1 = parent[v1];
				
			}
			while(v2 != parent[v2]) {
				v2 = parent[v2];	
			}
			if(v1!=v2) {
				Edge eddd = new Edge(currentEdge.v1,currentEdge.v2,currentEdge.weight);
				opList.add(eddd);
				parent[v1] = v2;
			}
			count++;
		}
		for(Edge ed : opList) {
			System.out.println(ed.v1 +" - "+" - " + ed.v2 + " -- "+ed.weight);
//			elementSot[i] = ed.weight;
		}
		System.out.println("************");
	}


}
