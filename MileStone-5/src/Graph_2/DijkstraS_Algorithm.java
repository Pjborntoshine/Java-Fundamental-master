package Graph_2;

import java.util.Scanner;

public class DijkstraS_Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();
		int adjMAtrix[][] = new int[V][V];
		for(int i=0;i<E;i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			int distance = s.nextInt();
			adjMAtrix[v1][v2] = distance;
			adjMAtrix[v2][v1] = distance;
		}
		
//		for(int i=0;i<V;i++) {
//			for(int j=0;j<V;j++) {
//				System.out.print(adjMAtrix[i][j]);
//			}
//			System.out.println();
//		}
		DijkstraAlgoByMe(adjMAtrix);
		
	}

	private static void DijkstraAlgoByMe(int[][] adjMAtrix) {
		// TODO Auto-generated method stub'
		int n = adjMAtrix.length;
		boolean visited[] = new boolean[n];
		int distance[] = new int[n];
		distance[0] = 0;
		for(int i=1;i<distance.length;i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		for(int i=0;i<n-1;i++) {
			int v = findMinVertex(visited,distance);// vertex with minimum distance
			visited[v] = true;
			for(int j=0;j<n;j++) {
				if(!visited[j] && adjMAtrix[v][j]!=0 && adjMAtrix[v][j]<Integer.MAX_VALUE) {
					int distViaMv = distance[v] + adjMAtrix[v][j];
					if(distViaMv<distance[j]) {
						distance[j] = distViaMv;
					}
				}
				
			}
		}
		
		for(int i = 0; i <n; i++){ 
			
				System.out.println(i +" "+ distance[i]); 
			
			}
		
		
	}

	private static int findMinVertex(boolean[] visited, int[] weight) {
//		weight ==  distance
		int minVertex = -1; 
		for(int i = 0; i < visited.length; i++){ 
			if(!visited[i] && (minVertex ==-1 || weight[i] < weight[minVertex])){
				minVertex = i;
			}
		}
		return minVertex;
	}


}
