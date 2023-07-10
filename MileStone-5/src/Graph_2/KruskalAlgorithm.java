package Graph_2;

import java.util.Scanner;

public class KruskalAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub using adjency matrix
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		
//		int adjMatrix [][] = new int[v][v];
//		for(int i=0;i<e;i++) {
//			for(int j=0;j<e;j++) {
//				
//				
//				if(adjMatrix[i][j]==0) {
//					System.out.println("enter " + i +" - " + j );
//					int weight = sc.nextInt();
//					adjMatrix[i][j] = weight;
//					adjMatrix[j][i] = weight;
//				}else {
//					continue;
//				}
//				
//			}
//		}
		
//		for(int i=0;i<e;i++) {
//			for(int j=0;j<e;j++) {
//				System.out.print(adjMatrix[i][j]);
//			}System.out.println();
//		}
		
//		int adjMatrix1 [][] = {{0,3,0,5},{3,0,1,0},{0,1,0,8},{5,0,8,0}};
		int adjMatrix1 [][] = {{0,1,3},{0,3,5},{1,2,1},{2,3,8}};
		KruskalAlgorithmUsingAdjMat(adjMatrix1,v);
	}

	private static void KruskalAlgorithmUsingAdjMat(int[][] adjMatrix,int n) {
		// TODO Auto-generated method stub
		int matrix[][] = new int[adjMatrix.length][adjMatrix[0].length];
		boolean checkMt[][] = new boolean[adjMatrix.length][adjMatrix[0].length];
	
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++)
			{
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
			
		
		
	}



}
