package DP_2;

public class editDistanceDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(editDistance("whgtdwhgtdg","aswcfg"));
	}
	
	public static int editDistance(String s, String t) {
		//Your code goes here
		
		//return editDistanceHlprREC(s,t,0,0);
//		return editDistanceHlprRECREDO(s,t,0,0);
		int dp[][] = new int[s.length()+1][t.length()+1];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				dp[i][j] = -1;
			}
		}
		int ans = editDistanceHlprItrDP(s,t);
		System.out.println(ans);
		return editDistanceHlprRECDP(s,t,dp);
	}
	
	// itr + dp
		private static int editDistanceHlprItrDP(String s, String t) {
			int dp[][]= new int[s.length()+1][t.length()+1];
			int m = dp.length;
			int n = dp[0].length;
			for(int i=dp.length-1;i>=0;i--) {
//				System.out.print(m-1);
				dp[i][n-1] = m-i-1;
			}
			for(int j=dp[0].length-1;j>=0;j--) {
				dp[m-1][j] = n-j-1;
			}
			
//			for(int i=0;i<dp.length;i++) {
//				for(int j=0;j<dp[0].length;j++) {
//					System.out.print(dp[i][j]+" ");
//				}System.out.println();
//			}
			

			for(int i=m-2;i>=0;i--) {
				for(int j=n-2;j>=0;j--) {
//					System.out.print(s.charAt(i)+" ");
					if(s.charAt(i) == t.charAt(j)) {
						dp[i][j] = dp[i+1][j+1];
					}else {
						dp[i][j] =1+ Math.min(dp[i+1][j],Math.min(dp[i][j+1],dp[i+1][j+1]));
					}
				}
			}
			
			return dp[0][0];
		}
	// rec + dp
	private static int editDistanceHlprRECDP(String s, String t,int storage[][]) {
		int m = s.length();
		int n = t.length();
		if(storage[m][n] != -1){
			return storage[m][n];
		}
		
		if(m == 0){
			storage[m][n] = n;
			return storage[m][n];
		}
		if(n == 0){
			storage[m][n] = m;
			return storage[m][n];
		}
		if(s.charAt(0) == t.charAt(0)){
			storage[m][n] = editDistanceHlprRECDP(s.substring(1), t.substring(1), storage);
		}else{
			// insert
			int op1 = editDistanceHlprRECDP(s, t.substring(1), storage);
			// delete 
			int op2 = editDistanceHlprRECDP(s.substring(1), t, storage);
			//substitute
			int op3 = editDistanceHlprRECDP(s.substring(1), t.substring(1), storage);
			storage[m][n] = 1 + Math.min(op1, Math.min(op2, op3));
		}
		return storage[m][n];
		
	}
	
	private static int editDistanceHlprRECREDO(String s, String t, int i, int j) {
		// TODO Auto-generated method stub
		if(s.length() ==0) {
			return t.length();
		}
		if(t.length() ==0) {
			return s.length();
		}	
		
		int ans;
		if(s.charAt(0) == t.charAt(0)) {
			ans = editDistanceHlprRECREDO(s.substring(1),t.substring(1),i+1,j+1);
		}else {
			int an1 =  editDistanceHlprRECREDO(s.substring(1),t.substring(1),i+1,j+1);
			int an2 = editDistanceHlprRECREDO(s.substring(1),t,i+1,j);
			int an3 =  editDistanceHlprRECREDO(s,t.substring(1),i,j+1);
			ans = 1+ Math.min(an1,Math.min(an2, an3));
			
		}
		return ans;
	}

	private static int editDistanceHlprREC(String s, String t, int i, int j) {
		// TODO Auto-generated method stub
		if(s.length() ==0) {
			return t.length();
		}
		if(t.length() ==0) {
			return s.length();
		}
		if(i==s.length() || j ==t.length()) {
			return 0;
		}
		
		
		int ans;
		if(s.charAt(i) == t.charAt(j)) {
			ans = editDistanceHlprREC(s,t,i+1,j+1);
		}else {
			int an1 =  editDistanceHlprREC(s,t,i+1,j+1);
			int an2 = editDistanceHlprREC(s,t,i+1,j);
			int an3 =  editDistanceHlprREC(s,t,i,j+1);
			ans = 1+ Math.min(an1,Math.min(an2, an3));
			
		}
		return ans;
	}
	
	
	

}

/*
 * 
 * public static int editDistance(String s, String t){
		if(s.length() == 0){
			return t.length();
		}
		if(t.length() == 0){
			return s.length();
		}
		
		if(s.charAt(0) == t.charAt(0)){
			return editDistance(s.substring(1), t.substring(1));
		}else{
			// insert
			int op1 = editDistance(s, t.substring(1));
			// delete 
			int op2 = editDistance(s.substring(1), t);
			//substitute
			int op3 = editDistance(s.substring(1), t.substring(1));
			return 1 + Math.min(op1, Math.min(op2, op3));
		}
	}
 */
