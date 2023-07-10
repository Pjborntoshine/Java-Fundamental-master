package DP_2;

public class knapsackPeoblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 	4
			1 2 4 5
			5 4 8 6
			5
		 * 
		 * ***/
		
		int[] weights = {1,2,4,5};
		int[] values = {5,4,8,6};
		int ans = knapsack(weights,values,4,5);
		System.out.println(ans);
	}
	public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
		//Your code goes here
		int dp[][] = new int[maxWeight+1][n+1];
		for(int i=0;i<maxWeight+1;i++) {
			for(int j=0;j<n+1;j++) {
				dp[i][j] = -1;
			}
			
			
		}
		
		
		int ans = knapsackRecDP(weights,values,n,maxWeight,0,dp);
		System.out.println(ans);
		System.out.println(knapsackItrDP(weights,values,n,maxWeight));
		System.out.println(knapsackI(maxWeight,values,weights));
		return knapsackRec(weights,values,n,maxWeight,0);
	}
	// itr + dp

public static int knapsackI(int W, int val[], int wt[])  {

		int n = val.length;
		int[][] dp = new int[n+1][W+1];
		
		for(int i=n-1; i>=0; i--) {
		for(int w=0;w<=W;w++) {
		
		int ans;
		if(wt[i] <= w) {
		int ans1 = val[i] + dp[i+1][w-wt[i]];
		int ans2 = dp[i+1][w];
		ans = Math.max(ans1, ans2);
		}else{
		ans = dp[i+1][w];
		}
		dp[i][w] = ans;
}
		}
		return dp[0][W];
}

	
	
	private static int knapsackItrDP(int[] weights, int[] values, int n, int maxWeight) {
		int m = values.length;
		int[][] dp = new int[m+1][maxWeight+1];
		
		for(int i=m-1;i>=0;i--) {
			for(int w=0;w<=maxWeight;w++) {
				int ans;
				if(weights[i]<=w) {
					 int an1 = values[i] + dp[i+1][w-weights[i]];
					 int an2 = dp[i+1][w];
					 ans = Math.max(an1, an2);
					
				}else {
					ans = dp[i+1][w];
				}
				dp[i][w] = ans;
			}
		
		}
		
		
		
		return dp[0][maxWeight];
	}
	
	// rec + dp
	private static int knapsackRecDP(int[] weights, int[] values, int n, int maxWeight, int si,int[][] dp) {
		
		if(si == weights.length) {	
			return 0;
		}
		if (dp[maxWeight][si] != -1)
	        return dp[maxWeight][si];  
		int ans;
		
		if(weights[si] > maxWeight) {
			ans = knapsackRec(weights,values,n,maxWeight,si+1);
		}else {
			int an1 = values[si]+ knapsackRec(weights,values,n,maxWeight - weights[si],si+1); // inc ith item
			int an2 = knapsackRec(weights,values,n,maxWeight,si+1); // not inc ith item
			ans = Math.max(an1, an2);
		}
		dp[maxWeight][si] = ans;
		return ans;
		
//		
//		if(si == weights.length) {	
//			return 0;
//		}
//		
//		int ans;
//		if(weights[si] > maxWeight) {
//			if(dp[maxWeight][si]==-1) {
//				ans = knapsackRec(weights,values,n,maxWeight,si+1);
//				dp[maxWeight][si]= ans;
//			}else {
//				ans = dp[maxWeight][si];
//			}
//			
//			
//		}else {
//			int an1,an2;
//			if(dp[maxWeight][si]==-1) {
//				 an1 = values[si]+ knapsackRec(weights,values,n,maxWeight - weights[si],si+1); // inc ith item
//				 dp[maxWeight][si] = an1;
//			}else {
//				an1 = dp[maxWeight][si];
//			}
//			if(dp[maxWeight][si]==-1) {
//				an2 = knapsackRec(weights,values,n,maxWeight,si+1); // not inc ith item
//				dp[maxWeight][si]=an2;
//			}else {
//				an2 = dp[maxWeight][si];
//			}
//			 
//			ans = Math.max(an1, an2);
//		}
//		
//		return ans;
		
	}

	
	// rec
	private static int knapsackRec(int[] weights, int[] values, int n, int maxWeight, int si) {
		// TODO Auto-generated method stub
		if(si == weights.length) {
			
			return 0;
		}
		
		
		int ans;
		if(weights[si] > maxWeight) {
			ans = knapsackRec(weights,values,n,maxWeight,si+1);
		}else {
			int an1 = values[si]+ knapsackRec(weights,values,n,maxWeight - weights[si],si+1); // inc ith item
			int an2 = knapsackRec(weights,values,n,maxWeight,si+1); // not inc ith item
			ans = Math.max(an1, an2);
		}
		return ans;
	}
	
//	// rec
//	private static int knapsackRec(int[] weights, int[] values, int n, int maxWeight, int si) {
//		// TODO Auto-generated method stub
//		if(si == weights.length) {
//			
//			return 0;
//		}
//		
//		
//		int ans;
//		if(weights[si] > maxWeight) {
//			ans = knapsackRec(weights,values,n,maxWeight,si+1);
//		}else {
//			int an1 = values[si]+ knapsackRec(weights,values,n,maxWeight - weights[si],si+1); // inc ith item
//			int an2 = knapsackRec(weights,values,n,maxWeight,si+1); // not inc ith item
//			ans = Math.max(an1, an2);
//		}
//		return ans;
//	}
}
