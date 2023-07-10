package Graph_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AllConnectedComponents {

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
		
		ArrayList<ArrayList<Integer>> isConnArrList= allConnectedComp(adjMatrix);
		for(int i=0;i<isConnArrList.size();i++) {
//			System.out.println(isConnArrList.get(i));
			for(Integer a : isConnArrList.get(i)) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}
	public static ArrayList<ArrayList<Integer>> allConnectedComp(int adjMatrix[][]) {
		boolean visited [] = new boolean[adjMatrix.length];
		ArrayList<ArrayList<Integer>> isConnArrList = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<adjMatrix.length;i++) {
			if(!visited[i]) {
				ArrayList<Integer> retLi = new ArrayList<Integer>();
				retLi.add(i);
				 retLi= allConnectedCompHeper(adjMatrix,i,visited,new ArrayList<Integer>());
				 Collections.sort(retLi) ;
				for(Integer r : retLi) {
					System.out.print( r + " ");
				}
				System.out.println();
				
				isConnArrList.add(retLi);
			}
		}
		return isConnArrList;
	}
	private static ArrayList<Integer> allConnectedCompHeper(int[][] adjMatrix, int currInd, boolean[] visited,ArrayList<Integer> arli) {
		// TODO Auto-generated method stub
		visited[currInd] = true;
		arli.add(currInd);
//		System.out.print(currInd + " ");
		for(int i=0;i<adjMatrix.length;i++) {
			if(adjMatrix[currInd][i]==1 && visited[i] == false) {	
				allConnectedCompHeper(adjMatrix,i,visited,arli);
//				return arli;
			}
		}
		return arli;
	}
}
