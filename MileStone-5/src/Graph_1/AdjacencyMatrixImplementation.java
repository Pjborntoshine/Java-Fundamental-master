package Graph_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AdjacencyMatrixImplementation {
//	T.C = O(v*v) v square
	public static void dfsTraversal(int adjMatrix[][]) {
		boolean visitedMat[][] =new boolean[adjMatrix.length][adjMatrix.length];
		for(int i=0;i<visitedMat.length;i++) {
			for(int j=0;j<visitedMat[0].length;j++) {
				visitedMat[i][j] = false;
				System.out.print(visitedMat[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i=0;i<adjMatrix.length;i++) {
			for(int j=0;j<adjMatrix[0].length;j++) {
				if(!visitedMat[i][j]) {
					if(adjMatrix[i][j] ==1 ) {
						
						visitedMat[i][j] =true;
						visitedMat[j][i] =true;
						System.out.println(i + " " + j);

					}
				}
				
			}
			
		}
		for(int i=0;i<visitedMat.length;i++) {
			for(int j=0;j<visitedMat[0].length;j++) {
				
				System.out.print(visitedMat[i][j] + " ");
			}
			System.out.println();
		}
		
	}
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
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(adjMatrix[i][j] + " ");
			}
			System.out.println();
		}
		
//		dfsTraversalRec(adjMatrix);
//		dfsTraversal(adjMatrix);
		
//		int[][] adjMatri  = new int[n][n];
//		for(int i=0;i<e;i++) {
//			System.out.println("Enter");
//			int vertex1 = s.nextInt();
//			int vertex2 = s.nextInt();
//			adjMatri[vertex1][vertex2] = 1;
//			adjMatri[vertex2][vertex1] = 1;
//		}
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print(adjMatri[i][j] + " ");
//			}
//			System.out.println();
//		}
		bfsTraversalRec(adjMatrix);
		
	}
	// traversing can be inproved by using adjency vertex and here TC will be 2E overvall O(V + 2E)
	// BFS //	T.C = O(v*v) v square
	public static void bfsTraversalRec(int adjMatrix[][]) {
		Queue<Integer> pendingVertex = new LinkedList<>();
		boolean visited[] = new boolean[adjMatrix.length];
//		System.out.println(pendingVertex.poll());
		pendingVertex.add(0);
		visited[0] = true;
		while(!pendingVertex.isEmpty()) {
			int currVertex = pendingVertex.poll();
			System.out.print(currVertex + " ");
			
			for(int i=0;i<adjMatrix.length;i++) {
				if(adjMatrix[currVertex][i] == 1 && visited[i]==false) {
//					System.out.println(adjMatrix[i][currVertex] + " " +i);
					pendingVertex.add(i);
					visited[i]=true;
				}
				
			}
			
		}
	}
	
	// DFS //	T.C = O(v*v) v square 
	public static void dfsTraversalRec(int adjMatrix[][]) {
		boolean visited[] = new boolean[adjMatrix.length];
		dfsTraversalRecHelper(adjMatrix,0,visited);
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
	
	
	/*
	 * BFS
	 		
import java.util.Scanner;
import java.util.Queue;
import java.util.*;
public class Solution {

	public static void printHelper(int edges[][], int sv,boolean visited[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(sv);
        while(q.size()!=0){
            int firstelem = q.remove();
            System.out.print(firstelem+" ");
            visited[sv] = true;
            for(int i=0; i<edges[0].length; i++){
                if(edges[firstelem][i]==1 && !visited[i]){
                    q.add(i);
                    visited[i]=true;
                }       
            }
        }   
    }
    
    public static void print(int edges[][]){
        boolean visited[] = new boolean[edges.length];
        for(int i=0; i< edges.length; i++){
            if(!visited[i]){
                printHelper(edges, i, visited);   
            }
        }
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();
        int edges[][] = new int[V][V];
        for(int i =0; i< E; i++){
            int fv = s.nextInt();
            int sv = s.nextInt();
            edges[fv][sv] = 1;   
            edges[sv][fv] =1;
        }
        print(edges);
	}

}
	 */
	

}
