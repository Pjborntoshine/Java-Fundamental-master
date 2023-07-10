package Graph_1_Assignment;

import java.util.Scanner;

public class Islands {

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
		System.out.println(numConnected(adjMatrix,n));
	}
	
	public static int numConnected(int[][] edges, int n) {
      int ans =0;
      boolean[] visited = new boolean[edges.length];
      for(int i=0;i<edges.length;i++) {
    	  if(visited[i]==false) {
    		  defRec(edges,i,visited);
        	  ans++;
        	  
    	  }
    	 
      }
      
	return ans;
	}
//tc o(n+m) ->o(m)-10^6
	private static void defRec(int[][] edges, int cueVtx, boolean[] visited) {
		// TODO Auto-generated method stub
		visited[cueVtx] = true;
		for(int i=0;i<edges.length;i++) {
			if(edges[cueVtx][i] == 1 && visited[i]==false) {
				defRec(edges, i, visited);
			}
		}
		
	}
}
