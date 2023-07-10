package Graph_1_Assignment;

import java.io.BufferedReader;

public class ConnectingDots {
   
    
//    public static String[] takeInput(){
//		String[] strNums;
//        strNums = br.readLine().split("\\s");
//
//        int N = Integer.parseInt(strNums[0]);
//        int M = Integer.parseInt(strNums[1]);
//
//		String[] Graph = new String[N];
//		
//        for (int i = 0; i < N; ++i) {
//            Graph[i] = br.readLine();
//        }
//
//        return Graph;
//    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//        String[] Graph = takeInput();
		  String[] Graph = {"AAAA","ABCA","AAAA"};
        if (solve(Graph,Graph.length,Graph[0].length())==1){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
	}

	static boolean findCycle = false;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static int solve(String[] board , int n, int m)
		{

		  boolean visited[][] = new boolean[n][m];
		  // filled with false;
		  for(int i=0;i<n;i++) {
			  for(int j=0;j<m;j++) {
				  if(visited[i][j]==false) {
					  dfs(board,i,j,-1,-1,board[i].charAt(j),n,m,visited);
				  }
				
			  }
		  }
		  System.out.println(findCycle);
		  if(findCycle) {
			  return 1;
		  }
		  return 0;
		}

	private static void dfs(String[] board, int x, int y, int fromX,int fromY ,char needColor,int n, int m,boolean visited[][]) {
		// TODO Auto-generated method stub
		if(x<0 || x>= n || y<0 || y>=m) {
			return;
		}
		if(board[x].charAt(y)!=needColor) {
			return;
		}
		if(visited[x][y]) {
			findCycle = true;
			return;
		}
		visited[x][y] = true;
		for(int  i=0;i<4;i++) {
			int nxtX = x+dx[i];
			int nxtY = y+dy[i];
			if(nxtX == fromX && nxtY == fromY) {
				continue;
			}
			dfs(board, nxtX, nxtY, x, y ,needColor,n,m, visited);
		}
	}

}
