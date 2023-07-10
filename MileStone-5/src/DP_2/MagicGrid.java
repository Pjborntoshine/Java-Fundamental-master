package DP_2;

public class MagicGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] grid = {{0,1,-3},{1,-2,0}};
		int[][] grid = {{0 ,-2, -3, 1},{-1 ,4 ,0 ,-2},{1 ,-2, -3, 0}};
		getMinimumStrength(grid);
	}
	

    public static int getMinimumStrength(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0;i<grid.length;i++) {
        	for(int j=0;j<grid[i].length;j++) {
        		if(i == m-1 && j == n-2) {
        			System.out.println("aaa" + grid[i][j]);
        		
        		}
        		if(i == m-2 && j == n-1) {
        			System.out.println("aaa2" + grid[i][j]);
        		}
        		
        	}
        }
    	int anRE = getMinimumStrengthHelper(grid,0,0,m,n);
    	System.out.println(anRE);
    	int dp[][] = new int[m+1][n+1];
    	for(int i=0;i<dp.length;i++) {
    		for(int j=0;j<dp[i].length;j++) {
    			dp[i][j] = Integer.MIN_VALUE;
    		}
    	}
    	int anREDP = getMinimumStrengthHelperDPREC(grid,0,0,m,n,dp);
    	System.out.println(anREDP);
    	 int ans222 = getMinimumStrengthRec(grid,0,0,m,n);
    	System.out.println("----" + ans222);
    	
    	getMinimumStrengthItrDp(grid,m,n);
    	
    	 return anRE;
    }
    
    
    
    private static int getMinimumStrengthItrDp(int[][] grid, int m, int n) {
    	int [][] dp = new int[m+1][n+1];
    	dp[m][n] = 1;
    	dp[m-1][n] = 1;
    	dp[m][n-1] = 1;
    	
//    	for(int k=0;k<dp.length;k++) {
//    		for(int l=0;l<dp[i].length;l++) {
//    			dp[m][j] = 1;
//    		}
//    		System.out.println();
//    	}
    	
    	for(int i=dp.length-1;i>0;i--) {
    		for(int j=dp[i].length-1;j>=0;j--) {
    			int an1 = grid[i][j] - grid[i+1][j];
    			int an2 = grid[i][j] - grid[i][j+1];
    		}
    	}
    	
    	for(int k=0;k<dp.length;k++) {
    		for(int l=0;l<dp[k].length;l++) {
    			System.out.print(dp[k][l] + " ");
    		}
    		System.out.println();
    	}
    	return 0;
    }
    
    
    
    
    private static int getMinimumStrengthRec(int[][] grid, int i, int j, int m, int n) {
    	if(i>=m || j>=n) {
			return Integer.MAX_VALUE;
		}
    	
    	if(i == m-1 && j == n-1) {
    		if(grid[i][j]<=0) {
    			return Math.abs(grid[i][j]);
    		}
    		return 1;
    	}
    	
    	
    	int an1 = getMinimumStrengthRec(grid,i+1,j,m,n) ;
    	int an2 = getMinimumStrengthRec(grid,i,j+1,m,n) ;
    	int ans =grid[i][j]+ Math.min(an1, an2);
    	
    	ans+=grid[i][j];
    	System.out.println(ans);
    	if(ans<1) {
    		return 1;
    	}
    	
		return ans;
    	
    }
    
    private static int getMinimumStrengthHelperDPREC(int[][] grid, int i, int j, int m, int n,int dp[][]) {
		if(i>=m || j>=n) {
			return Integer.MAX_VALUE;
		}
		if(i == m-1 && j == n-1) {
			if(grid[i][j]<=0) {
				return Math.abs(grid[i][j])+1;
			}
			return 1;
		}
		if(dp[i][j] !=Integer.MIN_VALUE) {
			return dp[i][j];
		}
		int an1 = getMinimumStrengthHelper(grid,i+1,j,m,n);
		int an2 = getMinimumStrengthHelper(grid,i,j+1,m,n);
		int ans =grid[i][j] +  Math.min(an1, an2);
//		System.out.println(ans);
		if(ans<=0) {
			return 1;
		}
		dp[i][j] = ans;
		return ans;
	}

    
    
	private static int getMinimumStrengthHelper(int[][] grid, int i, int j, int m, int n) {
		if(i>=m || j>=n) {
			return Integer.MAX_VALUE;
		}
		if(i == m-1 && j == n-1) {
			if(grid[i][j]<=0) {
				return Math.abs(grid[i][j])+1;
			}
			return 1;
		}
		int an1 = getMinimumStrengthHelper(grid,i+1,j,m,n);
		int an2 = getMinimumStrengthHelper(grid,i,j+1,m,n);
		int ans =grid[i][j] +  Math.min(an1, an2);
//		System.out.println(ans);
		if(ans<=0) {
			return 1;
		}
		return ans;
	}

}
