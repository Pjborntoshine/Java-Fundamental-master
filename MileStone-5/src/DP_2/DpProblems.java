package DP_2;

public class DpProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ip[][] = {{3,4,1,2},{2,1,8,9},{4,7,8,1}};
		System.out.println(minCostPath(ip));
	}
	
	
	
	
	public static int minCostPath(int[][] input) {
		//Your code goes here
		
		
//		return minCostPathHelRec(input,0,0);
		int[][] dp = new int[input.length+1][input[0].length+1];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				dp[i][j] = Integer.MIN_VALUE;
			}
		}
		System.out.println( minCostPathHelItrDp(input));
		return minCostPathHelRecDp(input,0,0,dp);
		
	}
	
	
	// usinf ITR+dp try by me
	private static int minCostPathHelItrDp(int[][] cost){
		int m = cost.length;
		int n = cost[0].length;
		int dp[][] = new int[cost.length+1][cost[0].length+1];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[i].length;j++) {
					dp[i][j] = Integer.MAX_VALUE;
			}	
		}
		
		for(int i=m-1;i>=0;i--) {
			for(int j=n-1;j>=0;j--) {
				
				if(i==m-1 && j==n-1) {
					dp[i][j] = cost[i][j];
					continue;
				}
//				if()
				int ans =  Math.min(dp[i+1][j+1],Math.min(dp[i+1][j], dp[i][j+1]));
				dp[i][j] = cost[i][j] + ans;
			}
		}
		
//		for(int i=0;i<dp.length;i++) {
//			for(int j=0;j<dp[0].length;j++) {
//				System.out.print(dp[i][j]+" ");
//			}
//			System.out.println();
//		}
	return dp[0][0];
	}
	
	// using Rec + dp
	private static int minCostPathHelRecDp(int[][] input, int i, int j,int dp[][]) {
		if(i== input.length-1 && j == input[0].length-1) {
			return input[i][j];
		}
		if(i>=input.length || j>=input[0].length) {
			return Integer.MAX_VALUE;
		}
		
		int ans1,ans2,ans3;
		if(dp[i+1][j] == Integer.MIN_VALUE) {
			ans1 = minCostPathHelRecDp(input,i+1,j,dp);
			dp[i+1][j] = ans1;
		}else {
			ans1 = dp[i+1][j];
		}
		
		if(dp[i][j+1] == Integer.MIN_VALUE) {
			ans2 = minCostPathHelRecDp(input,i,j+1,dp);
			dp[i][j+1] = ans2;
		}else {
			ans2 = dp[i][j+1];
		}
		
		if(dp[i+1][j+1] == Integer.MIN_VALUE) {
			ans3 = minCostPathHelRecDp(input,i+1,j+1,dp);
			dp[i+1][j+1] = ans3;
		}else {
			ans3 = dp[i+1][j+1];
		}
		
		int ans = input[i][j] + Math.min(ans1,Math.min(ans2, ans3));
		return ans;
	}
	// using Recursion
	private static int minCostPathHelRec(int[][] input, int i, int j) {
		// TODO Auto-generated method stub
		// special case
		if(i ==input.length-1 && j==input[0].length-1) {
			return input[i][j];
		}
		// base case
		if(i>=input.length || j>=input[0].length) {
			return Integer.MAX_VALUE;
		}
		
		int m1 = minCostPathHelRec(input,i+1,j);
		int m2 = minCostPathHelRec(input,i,j+1);
		int m3 = minCostPathHelRec(input,i+1,j+1);
		int ans = input[i][j] + Math.min(m1,Math.min(m2, m3));
		return ans;
	}
}
