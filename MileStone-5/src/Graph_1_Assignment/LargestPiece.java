package Graph_1_Assignment;

public class LargestPiece {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ar1 = {"100","010","010"};
		dfs(ar1,ar1.length-1);
	}
//	 static int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
		static int[] dx = {1,-1,0,0};
		static int[] dy = {0,0,1,-1};
	
		public static int dfs(String[] edge, int n) {
			
			int maxVal = Integer.MIN_VALUE;
			boolean visited[][] = new boolean[n][n];
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					visited[i][j] = false;
				}
				}
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					
					if(!visited[i][j] && edge[i].charAt(j)=='1') {
//						System.out.println("adasda" + edge[i].charAt(j));
						int retVal = dfsHelper(edge,i,j,-1,-1,visited,n);
						System.out.println("retVal" + retVal);
						maxVal=maxVal>retVal?maxVal:retVal;
					}
					
				}
			}
			System.out.println(maxVal);
			return maxVal;
	}
		
		private static int dfsHelper(String[] edge, int x, int y,int frmX,int frmY, boolean[][] visited, int n) {
			if(visited[x][y]) {
				return 0;
			}
			visited[x][y] = true;
			int count=1;
			
			for(int i=0;i<4;i++) {
				int nxtX = x+dx[i];
				int nxtY = y+dy[i];
//				System.out.println(nxtX + " nxt" + nxtY);
				if(nxtX>=0 && nxtX<n && nxtY>=0 && nxtY<n 
						&& edge[nxtX].charAt(nxtY)=='1' 
						&& visited[nxtX][nxtY] == false) {
					count=count+ dfsHelper(edge,nxtX,nxtY,x,y,visited,n);
					//System.out.println("count" + count);
				}
			
			}
			return count;
		}
}
