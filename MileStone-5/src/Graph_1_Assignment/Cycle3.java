package Graph_1_Assignment;

import java.util.Scanner;

public class Cycle3 {

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
		dfsTraversalRec(adjMatrix);
	}
	public static void dfsTraversalRec(int adjMatrix[][]) {
		boolean visited[] = new boolean[adjMatrix.length];
		int ans=0;
//		for(int i=0;i<adjMatrix.length;i++) {
//			if(!visited[i]) {
//				int retVal = dfsTraversalRecHelp(adjMatrix,i,visited);
//				System.out.println("retVal" + retVal);
//				ans+=retVal;
//				
//			}
//		}
//		System.out.println("ans---"+ans);
		
		for(int i=0;i<adjMatrix.length-2;i++) {
			for(int j=i+1;j<adjMatrix.length-1;j++) {
				for(int k=j+1;k<adjMatrix.length;k++) {
					if(adjMatrix[i][j]==1 && adjMatrix[j][k]==1 && adjMatrix[k][i]==1) {
						ans+=1;
					}
				}
			}
		}
		System.out.println(ans);
		
	}
	private static int dfsTraversalRecHelp(int[][] adjMatrix, int currvtx, boolean[] visited) {
		// TODO Auto-generated method stub
		if(visited[currvtx]) {
			System.out.println("ansnsns---");
			return 1;
		}
		int ret=0;
		visited[currvtx] = true;
		System.out.println(currvtx);
	
		for(int i=0;i<adjMatrix.length;i++) {
			ret =  dfsTraversalRecHelp(adjMatrix,i,visited);
		}
//		sSystem.out.println("ret" + ret);
		return ret;
	}
}
