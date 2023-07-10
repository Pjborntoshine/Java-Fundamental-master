package Graph_1_Assignment;

import java.util.Scanner;

public class CodingNinjas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		int m = s.nextInt();
		int N = 2;
		String graph [] = new String[N];
		String strr1 = "CXDXNXNXNXA";
		String st2 = "XOXIXGXIXJX";
		graph[0] = strr1;
		graph[1] = st2;
		solve(graph,2,11);
	}
static int l=0;
	static int solve(String[] Graph , int N, int M)
	{
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		boolean visited[][] = new boolean[N][M];
		String str = "CODINGNINJA"; 
		Character[][] gp = new Character[N][M];
		String strr1 ="CXDXNXNXNXA";
		String st2 ="XOXIXGXIXJX";
		int k=0;


			for(String st: Graph) {
				System.out.println(st);
				for(int j=0;j<st.length();j++) {
					gp[k][j] = st.charAt(j);
				}
				k++;
			}

//			for(int i=0;i<N;i++) {
//				for(int j=0;j<M;j++) {
//					System.out.print(visited[i][j]+" ");
//				}
//			}
			
//			for(String st: Graph) {
//			System.out.println(st);
//		}
			for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					if(gp[i][j] == str.charAt(0)) {
						
						solveHelper(gp,i,j,N,M,visited,str);
					}
					
					if(l>0) {
						System.out.println("true");
						return 1;
					}
				}
			}
//			System.out.println("l " + l);
			return 0;
	}

	private static void solveHelper(Character [][] graph, int i, int j, int n, int m,boolean visited[][],String str) {
		// TODO Auto-generated method stub
		// base case
		
		if(str.length() == 0) {
			
			l++;
			return ;
		}
		
		if(i<0 || i>=n || j<0 || j>=m) {
		
			return ;
		}
		
		if(visited[i][j]== true) {
		
			return ;
		}
		
		if(str.charAt(0)!=graph[i][j]) {
			
			return ;
		}
		
		if(str.charAt(0)==graph[i][j]) {
			visited[i][j] = true;
			
		}
//		System.out.println("insides 15");
//		System.out.println("teting---" + str.charAt(0));
//		
		
			
			solveHelper(graph,i+1,j,n,m,visited,str.substring(1));
			solveHelper(graph,i,j+1,n,m,visited,str.substring(1));
			solveHelper(graph,i+1,j+1,n,m,visited,str.substring(1));
			solveHelper(graph,i-1,j,n,m,visited,str.substring(1));
			solveHelper(graph,i,j-1,n,m,visited,str.substring(1));
			solveHelper(graph,i-1,j-1,n,m,visited,str.substring(1));
			solveHelper(graph,i-1,j+1,n,m,visited,str.substring(1));
			solveHelper(graph,i+1,j-1,n,m,visited,str.substring(1));
			visited[i][j] =false;
		

	}
}
