package DP_2;

public class lcsDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lcs("adebc","dcadb"));
	}
	public static int lcs(String s, String t) {
		//Your code goes here
		int dp[][] = new int[s.length()+1][t.length()+1];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				dp[i][j] = -1;
			}
		}
		System.out.println(lcsItrprDP(s,t));
		
		return lcsReclpr(s, t,0,0);
    }

	// sitr way dp+itr

	public static int IcsI(String str1, String str2) {

		int m = str1.length();
		int n = str2.length();

		int[][] dp = new int[m+1][n+1];

		for(int i=m-1; i>=0; i--) {
		for(int j=n-1; j>=0; j--) {

		int ans;
		if(str1.charAt(i) == str2.charAt(j)) {
		ans = 1 + dp[i+1] [j+1];
		}else {
		int ans1 = dp[i][j+1]; 
		int ans2 = dp[i+1][j];
		ans = Math.max(ans1,ans2);
		}
		dp[i][j] = ans;
		}
		}
		return dp[0][0];
		}

	
	// dp+itr
	private static int lcsItrprDP(String s, String t) {
		int dp[][] = new int[s.length()+1][t.length()+1];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				if(i==dp.length-1 || j == dp[0].length-1) {
					dp[i][j] = 0;
				}else {
					dp[i][j] =-1;
				}
				
			}
		}
		
//		for(int i=0;i<dp.length;i++) {
//			for(int j=0;j<dp[0].length;j++) {
//				System.out.print(dp[i][j]+" ") ;
//			}
//			System.out.println();
//		}
		
		int m = s.length();
		int n = t.length();
		for(int i=m-1;i>=0;i--) {
			for(int j=n-1;j>=0;j--) {
			
				int ans;
				if(s.charAt(i) == t.charAt(j)) {
					int an1 = 1+dp[i+1][j+1];
					ans = an1;
				}else {
					
					int an2,an3;
					an2 = dp[i+1][j];
					an3 = dp[i][j+1];
					ans = Math.max(an2, an3);
				}
				dp[i][j] = ans;
				
			}
		}
//		System.out.println();
//		for(int i=0;i<dp.length;i++) {
//			for(int j=0;j<dp[0].length;j++) {
//				System.out.print(dp[i][j]+" ") ;
//			}
//			System.out.println();
//		}
		
		return dp[0][0];
	}
	private static int lcsReclprDP(String s, String t, int i, int j,int dp[][]) {
		// TODO Auto-generated method stub
		
		if(i==s.length() || j==t.length()) {
			return 0;
		}
		
		int ans;
		if(s.charAt(i) == t.charAt(j)) {
			if(dp[i+1][j+1] == -1) {
				int smallop = lcsReclprDP(s,t,i+1,j+1,dp);
				ans = smallop+1;
				dp[i+1][j+1] = ans;
			}else {
				ans = dp[i+1][j+1]+1;
			}
		}
		else {
			int an2,an3;
			if(dp[i+1][j] == -1) {
				an2 = lcsReclprDP(s,t,i+1,j,dp);
				dp[i+1][j] = an2;
			}
			else {
				an2 = dp[i+1][j];
			}
			if(dp[i][j+1] == -1) {
				an3 = lcsReclprDP(s,t,i,j+1,dp);
				dp[i][j+1] = an3;
			}else {
				an3 = dp[i][j+1]; 
			}
		
			ans = Math.max(an2, an3);
		}
		
		return ans;
	}
	
	
	private static int lcsReclpr(String s, String t, int i, int j) {
		// TODO Auto-generated method stub
		
		if(i==s.length() || j==t.length()) {
			return 0;
		}
		
		int ans;
		if(s.charAt(i) == t.charAt(j)) {
			ans = 1 + lcsReclpr(s, t, i+1, j+1);
		}else {
			int an2 = lcsReclpr(s, t, i+1, j);
			int an3 = lcsReclpr(s, t, i, j+1);
			ans = Math.max(an2, an3);
		}
		
		return ans;
	}
}
