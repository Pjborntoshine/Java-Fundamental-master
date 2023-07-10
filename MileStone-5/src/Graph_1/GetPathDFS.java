package Graph_1;

import java.util.Scanner;
import java.util.*;
public class GetPathDFS {

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
				boolean visited[] =new boolean[adjMatrix.length]; 
				ArrayList<Integer> li= getPathDFS(adjMatrix,srx,t,visited);
				if(li!=null){
						for(Integer k: li) {
						System.out.print(k +" ");
					}
				}
	}
	
	public static ArrayList<Integer> getPathDFS(int adjMatrix[][],int srx,int  t,boolean[] visited){
		visited[srx] = true;
		if(srx == t){
//			System.out.println("sdasda" + srx + " " + t);
			 ArrayList<Integer> li = new  ArrayList<Integer>();
			 li.add(srx);
			 return li;
		}
		for(int i=0;i<adjMatrix.length;i++){
				if(adjMatrix[srx][i] == 1 && visited[i]== false) {
				ArrayList<Integer> smlLi=	getPathDFS(adjMatrix,i,t,visited);
				
					if(smlLi!=null){
//						System.out.println();
						smlLi.add(srx);
						return smlLi;
					}
				}
		}
		return null;
	}



}
