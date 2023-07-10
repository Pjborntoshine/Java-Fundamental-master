package Graph_1;

import java.util.Scanner;

public class HasPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); // vertex
		int e = s.nextInt();
		
//		if(n==0 ){
//			return;
//		}
//		if(e==0){
//			for(int i=0;i<n;i++){
//				System.out.print(i + " ");
//			}
//			return;
//		}
		int adjMatrix[][] = new int[n+1][n+1];
		for(int i=0;i<e;i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			System.out.print(v1 + " " + v2);
			adjMatrix[v1][v2] = 1;
			adjMatrix[v2][v1] = 1;
		}
		
		int source = s.nextInt();
		int target = s.nextInt();
		
		System.out.println(hasPathRec(adjMatrix,source,target));
	}
	
	public static boolean hasPathRec(int adjMatrix[][],int v1,int v2) {
		boolean visited[] =new boolean[adjMatrix.length]; 
		return hasPathRecHelper(adjMatrix,v1,visited,v1,v2);
	}

	private static boolean hasPathRecHelper(int[][] adjMatrix, int currInd, boolean[] visited,int v1,int v2) {
		
		// TODO Auto-generated method stub
		visited[currInd] = true;
//		System.out.println(currInd+" ");
		boolean ans = false;
//		System.out.println("v2v2--- " + v2);
		if(visited[v2]) {
			System.out.println(" here " + v2);
			return true;
		}
		if(!visited[v2]) {
			for(int i=0;i<adjMatrix.length;i++) {
				if(adjMatrix[currInd][i] == 1 && visited[i]== false) {
				ans=hasPathRecHelper(adjMatrix,i,visited,v1,v2);
				}
			}
		}
		return ans;
		
	}

}

/*
 * 	public static void main(String[] args) throws NumberFormatException, IOException {
    
		 Scanner s = new Scanner(System.in);
		int n = s.nextInt(); // vertex
		int e = s.nextInt();
		int srx = s.nextInt();
		int t = s.nextInt();
	int adjMatrix[][] = new int[n][n];
		for(int i=0;i<e;i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			adjMatrix[v1][v2] = 1;
			adjMatrix[v2][v1] = 1;
		}
		
		System.out.println(hasPathRec(adjMatrix,srx,t));
	}

	public static boolean hasPathRec(int adjMatrix[][],int v1,int v2) {
		boolean visited[] =new boolean[adjMatrix.length]; 
		return hasPathRecHelper(adjMatrix,v1,visited,v1,v2);
	}

	private static boolean hasPathRecHelper(int[][] adjMatrix, int currInd, boolean[] visited,int v1,int v2) {
		// TODO Auto-generated method stub
		visited[currInd] = true;
//		System.out.println(currInd+" ");
		boolean ans = false;
		if(visited[v2]) {
			return true;
		}
		if(!visited[v2]) {
			for(int i=0;i<adjMatrix.length;i++) {
				if(adjMatrix[currInd][i] == 1 && visited[i]== false) {
				ans=hasPathRecHelper(adjMatrix,i,visited,v1,v2);
				}
			}
		}
		return ans;
		
	}

}
 * 
 * 
 * 
 */

