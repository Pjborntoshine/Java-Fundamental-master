package Graph_2;

import java.util.Scanner;

public class PrismAlogrithmMe {
	// revise properly VVI and remember it T>C (V*2)
	private static int findMinVertex(boolean[] visited, int[] weight) {

			int minVertex = -1; 
			for(int i = 0; i < visited.length; i++){ 
				if(!visited[i] && (minVertex ==-1 || weight[i] < weight[minVertex])){
					minVertex = i;
				}
			}
			return minVertex;
		}
	public static void prims(int adjMatrix[][]){
		int n = adjMatrix.length; 
		boolean[] visited = new boolean[n]; 
		int parent[] = new int[n]; 
		int weight[] = new int[n]; 
		// source - vertex 0 
		parent[0] = -1; 
		weight[0] = 0; 
		for(int i = 1; i <n; i++){
			weight[i] = Integer.MAX_VALUE;
		}
		for(int i = 0; i<n; i++){
			int minVertex = findMinVertex(visited, weight); 
			visited[minVertex] = true; 
			// Explore neighbors of min vertx 
			for(int j = 0; j<n; j++){ 
				if(adjMatrix[minVertex][j] != 0 && !visited[j]){ 
					if(weight[j] > adjMatrix[minVertex][j]){
			// update values 
						weight[j] = adjMatrix[minVertex][j]; 
						parent[j] = minVertex;
					}
				}
			}
		}
		// Print MST 
		for(int i = 1; i <n; i++){ 
			if(i < parent[i]){
				System.out.println(i + " " + parent[i] +" " + weight[i]); 
			}else{
				System.out.println(parent[i] + " " + i +" " + weight[i]);
				}
			}
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int e = sc.nextInt();
		int[][] adjencyMatrix = new int[n][n];
		for(int i=0;i<e;i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int weight = sc.nextInt();
			adjencyMatrix[v1][v2] = weight;
			adjencyMatrix[v2][v1] = weight;
		}
//	 prismAlogrithnMe(adjencyMatrix,n);
		prims(adjencyMatrix);
		
	}
// done by me
	private static int[] prismAlogrithnMe(int[][] adjencyMatrix, int n) {
		// TODO Auto-generated method stub
		boolean visited[] = new boolean[n];
		int parent[] = new int[n];
		
		parent[0] = -1;
		int weight[] = new int[n];
		for(int i=0;i<parent.length;i++) {
			weight[i] = Integer.MAX_VALUE;
		}
		weight[0] = 0;
		for(int i=0;i<n;i++) {
			int minVertex = i;
			visited[minVertex] = true;
			for(int j=0;j<n;j++) {
				if(!visited[j] && adjencyMatrix[j][minVertex]!=0) {
					if(adjencyMatrix[j][minVertex]< weight[j]) {
						weight[j] = adjencyMatrix[j][minVertex];
						parent[j] = minVertex;
					}
				}
			}
		}
		for(int i=1;i<parent.length;i++) {
			if(i<parent[i]) {
				System.out.println(i+" " + parent[i] +" "+ weight[i]);
			}else {
				System.out.println(parent[i]+" " + i +" "+ weight[i]);
			}
		}
		
		return parent;
	}




}
