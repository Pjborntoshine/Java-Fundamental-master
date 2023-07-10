package DP_1;

public class MinSqreProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = minCount(12);
		System.out.println(m);
		int n = minCountMain(12);
		System.out.println(n);
	}
	
	
	
	public static int minCountMain(int n) {
		int[] dp = new int[n+1];
		for(int i=0;i<dp.length;i++) {
			dp[i] = -1;
		}
//		return minCountDpREC(n,dp);
//		return minCountDpRECME(n,dp);
		return minCountDpITR(n,dp);
	}
	// dp+itr
	private static int minCountDpITR(int n, int[] dp) {
//		if(n==0) {
//			
//			dp[n] = 0;
//			return dp[n];
//		}
		dp[0] = 0;
		for(int i=1;i<dp.length;i++) {
			int minAns = Integer.MAX_VALUE;
			for(int j=1;(j*j)<=i;j++) {
				int cAns = dp[i-(j*j)];
				if(minAns>cAns) {
					minAns = cAns;
				}
				
				
			}
			dp[i] = 1+minAns;
		}
		return dp[n];
	}
	
	private static int minCountDpRECME(int n, int[] dp) {
		if(n==0) {
			return 0;
		}
		
		int minAns = Integer.MAX_VALUE;
		for(int i=1;i*i<=n;i++) {
			int cAns;
			if(dp[n-(i*i)]==-1) {
				cAns = minCountDpRECME(n-(i*i),dp);
				dp[n-(i*i)] = cAns;
			}else {
				cAns = dp[n-(i*i)];
			}
			
			if(minAns>cAns) {
				minAns = cAns;
			}
		}
//		System.out.println(minAns+1);
		return minAns+1;
	}
	// dp+rec
	private static int minCountDpREC(int n, int[] dp) {
		if(n==0) {
			
			dp[n] = 0;
			return dp[n];
		}
		
		int minCnt = Integer.MAX_VALUE;
		for(int i=1;i*i<=n;i++) {
			int cAns;
			if(dp[n-(i*i)] == -1) {
				cAns = minCountDpREC(n-(i*i), dp);
			}else {
				cAns = dp[n-(i*i)];
			}
			if(minCnt>cAns) {
				minCnt = cAns;
			}
		}
	int mAns = 1+minCnt;
	return mAns;
	
	
    
    
//  if(n==0) {
		
//		dp[n] = 0;
//		return dp[n];
//	}
	
//	int minCnt = Integer.MAX_VALUE;
//	for(int i=1;i*i<=n;i++) {
//		int cAns;
//		if(dp[n-(i*i)] == -1) {
//			cAns = minCountDpREC(n-(i*i), dp);
//		}else {
//			cAns = dp[n-(i*i)];
//		}
//		if(minCnt>cAns) {
//			minCnt = cAns;
//		}
//	}
//int mAns = 1+minCnt;
//return mAns;
	
	
	
	}
	
	public static int minCount(int n) {
		//Your code goes here
		if(n==0) {
			return 0;
		}
//		System.out.println(n);
		int minAns = Integer.MAX_VALUE;
		for(int i=1;i*i<=n;i++) {
			int currAns =  minCount(n-(i*i));
			if(minAns>currAns) {
				minAns = currAns;	
			}
		
		}
		int myAns = minAns+1;
		return myAns;
	}
}
