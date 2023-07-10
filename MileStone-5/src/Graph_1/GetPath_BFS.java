package Graph_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class GetPath_BFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); // vertex
		int e = s.nextInt();
		int adjMatrix[][] = new int[n][n];
		for(int i=0;i<e;i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			adjMatrix[v1][v2] = 1;
			adjMatrix[v2][v1] = 1;
		}
		int srx = s.nextInt();
		int t = s.nextInt();
		ArrayList<Integer> ans= GetPathBfsCnSol(adjMatrix,srx,t);
		for(Integer t1:ans) {
			System.out.print(t1 + " ");
		}
	}
	
	public static ArrayList<Integer> GetPathBfsCnSol(int adjMatrix[][],int s,int t) {
		Queue<Integer> pendingVertex = new LinkedList<>();
		
		HashMap<Integer, Integer> map = new HashMap<>();
		boolean visited[] = new boolean[adjMatrix.length];
//		System.out.println(pendingVertex.poll());
		pendingVertex.add(s);
		visited[s] = true;
		map.put(s, -1);
		boolean pathFound = false;
		while(!pendingVertex.isEmpty()) {
			int currVertex = pendingVertex.poll();
//			System.out.print(currVertex + " ");
			
			for(int i=0;i<adjMatrix.length;i++) {
				if(adjMatrix[currVertex][i] == 1 && visited[i]==false) {
//					System.out.println(adjMatrix[i][currVertex] + " " +i);
					pendingVertex.add(i);
					visited[i]=true;
					map.put(i, currVertex);
					if(i==t) {
						// path found
						pathFound=true;
						break;
					}
				}
				
			}
			
		}
		if(pathFound) {
			ArrayList<Integer>path = new ArrayList<Integer>();
			int currentVertex=t;
			while(currentVertex != -1) {
				path.add(currentVertex);
				int parent = map.get(currentVertex);
				currentVertex =parent;
			}
		return path;
		}else {
			return null;
		}
	}
	
	public static void GetPathBfs(int adjMatrix[][],int s,int t) {
		boolean visited[] = new boolean[adjMatrix.length];
		Queue<Integer> pq = new LinkedList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<>();
		pq.add(s);
		visited[s] = true;
		map.put(s, -1);
		int la=0;
		int pala=0;
		while(!pq.isEmpty()) {
			int Curvrtx = pq.poll();
//			System.out.print( Curvrtx + " ");
			
			for(int i=0;i<adjMatrix.length;i++) {
				if(adjMatrix[Curvrtx][i]==1 && visited[i]==false) {
					pq.add(i);
					visited[i] = true;
					if(i==t) {
						map.put(i, Curvrtx);
						la=i;
						pala = Curvrtx;
						break;
					}
					map.put(i, Curvrtx);
				}
			}
		}
//		Set<Integer> keys= map.keySet();
//		for(Integer saa:keys) {
//			System.out.println(saa + " == "+ map.get(saa));
//		}
//		System.out.println(la);
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ans.add(la);
		while(pala!=-1) {
			if(pala==-1) {
//				ans.add(pala);
				break;
			}
			ans.add(pala);
			if(map.get(pala) !=null) {
				pala = map.get(pala);
			}else {
				break;
			}
		}
//		System.out.println("----" + ans.size());
		if(ans.size() <=2 && ans.get(0)==0 && ans.get(0)==0) {
			return;
		}
		if(ans.size()>0) {
			for(Integer aa:ans) {
				System.out.print(aa+" ");
			}
		}
	}

}
