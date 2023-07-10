package Graph_1;

import java.util.Scanner;

public class isConnected {

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
		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print(adjMatrix[i][j] + " ");
//			}
//			System.out.println();
//		}
		boolean visited[] = new boolean[adjMatrix.length];
		boolean ans[] =  isConnected(adjMatrix,0,visited);
		boolean check = false;
		for(boolean bt : ans) {
			if(bt==false) {
				check = false;
				break;
			}
			check = bt;
		}
		System.out.println(check);
	}
	
	private static boolean[] isConnected(int[][] adjMatrix, int currentVertex, boolean[] visited) {
		// TODO Auto-generated method stub
		visited[currentVertex] = true;
//		System.out.print(currentVertex + " ");
		for(int i=0;i<adjMatrix.length;i++) {
			if(adjMatrix[currentVertex][i] ==1 && visited[i] == false) {
				isConnected(adjMatrix, i, visited);
			}
		}
	return visited;
	}

}
