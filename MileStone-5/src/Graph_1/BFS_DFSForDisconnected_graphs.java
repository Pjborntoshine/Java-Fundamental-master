package Graph_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BFS_DFSForDisconnected_graphs {

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
		
//		dfsTraversalRec(adjMatrix);
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print(adjMatrix[i][j] + " ");
//			}
//			System.out.println();
//		}
		bfsTraversalRec(adjMatrix,n);
	}
	
	
	public static void bfsTraversalRec(int adjMatrix[][],int v) {
		boolean visited[] = new boolean[adjMatrix.length];
		for(int j=0;j<v;j++) {
			if(visited[j]==false) {
				Queue<Integer> pendingVertex = new LinkedList<>();
			
//				System.out.println(pendingVertex.poll());
				pendingVertex.add(j);
				visited[j] = true;
				while(!pendingVertex.isEmpty()) {
					int currVertex = pendingVertex.poll();
					System.out.print(currVertex + " ");
					
					for(int i=0;i<adjMatrix.length;i++) {
						if(adjMatrix[currVertex][i] == 1 && visited[i]==false) {
//							System.out.println(adjMatrix[i][currVertex] + " " +i);
							pendingVertex.add(i);
							visited[i]=true;
						}
						
					}
					
				}
				System.out.println();
			}
		
		}
	
	}
	
	
	
	public static void dfsTraversalRec(int adjMatrix[][]) {
		boolean visited[] = new boolean[adjMatrix.length];
		for(int i=0;i<adjMatrix.length;i++) {
			if(!visited[i]) {
				dfsTraversalRecHelper(adjMatrix,i,visited);
				System.out.println();
			}
			
		}
	}
	
	private static void dfsTraversalRecHelper(int[][] adjMatrix, int currentVertex, boolean[] visited) {
		// TODO Auto-generated method stub
		visited[currentVertex] = true;
		System.out.print(currentVertex + " ");
		for(int i=0;i<adjMatrix.length;i++) {
			if(adjMatrix[currentVertex][i] ==1 && visited[i] == false) {
				dfsTraversalRecHelper(adjMatrix, i, visited);
			}
		}
	}
	
	
	

	
}
