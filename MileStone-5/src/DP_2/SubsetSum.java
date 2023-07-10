package DP_2;

public class SubsetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {4,2,5,6,7};
		int[] arr = {4,3,5,2};
		isSubsetPresent(arr,arr.length-1,13);
	}

	static boolean isSubsetPresent(int[] arr, int n, int sum) {
		
		int[][] dp = new int[arr.length +1][sum+1];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[i].length;j++) {
				dp[i][j] = -1;
			}
		}
		boolean ansRECDp =  isSubsetPresentRecDp(arr,n,sum,0,dp);
		System.out.println(ansRECDp);
		boolean ans = isSubsetPresentRec(arr,n,sum,0);
		System.out.println(ans);
		
		boolean an2 = isSubsetPresentDpItr(arr,n,sum);
		System.out.println(an2);
		return ans;
	}
	
	private static boolean isSubsetPresentDpItr(int[] arr, int n, int sum ) {
		int[][] dp = new int[arr.length+1][sum+1];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[i].length;j++) {
				dp[i][j] = -1;
				if(j==0) {
					dp[i][j] = 1;
				}
			}
		}
		
		for(int i=1;i<dp.length;i++) {
			for(int w=0;w<dp[i].length;w++) {
				boolean ans ;
				if(arr[i-1] > w) {
					dp[i][w] = dp[i-1][w];
				}else {
					int an1 = dp[i-1][w-arr[i-1]];
					int an2 = dp[i-1][w];
					
					if(an1==0 || an2==1) {
//						ans = true;
						dp[i][w] = 1;
					}else {
//						ans = false;
						dp[i][w] = 0;
						
					}
					
				}
			}
		}
		
		
		
//		for(int i=0;i<dp.length;i++) {
//			for(int j=0;j<dp[i].length;j++) {
//				System.out.print(dp[i][j] + " ");
//			}
//			System.out.println();
//		}
		if(dp[dp.length-1][dp[0].length-1]==1) {
			return true;
		}
		return false;
	}
	
	// memo
	private static boolean isSubsetPresentRecDp(int[] arr, int n, int sum, int i,int[][] dp) {
		
		if(i == arr.length) {
			if(sum ==0) {
				return true;
			}
			return false;
		}
		if(sum<0) {
			return false;
		}
		
		if(dp[i][sum]!=-1) {
			if(dp[i][sum] == 1) {
				return true;
			}
			return false;
		}
		
		boolean op1 = isSubsetPresentRecDp(arr,n,sum-arr[i],i+1,dp);
		boolean op2 = isSubsetPresentRecDp(arr,n,sum,i+1,dp);
		boolean ans = false;
		if(op1 || op2) {
			ans = true;
			dp[i][sum] = 1;
		}else {
			ans = false;
			dp[i][sum] = 0;
			
		}
		
		return ans;
		
	}
	
	// rec
	private static boolean isSubsetPresentRec(int[] arr, int n, int sum, int i) {
		// TODO Auto-generated method stub
		if(i == arr.length) {
			if(sum ==0) {
				return true;
			}
			return false;
		}
		boolean op1 = isSubsetPresentRec(arr,n,sum-arr[i],i+1);
		boolean op2 = isSubsetPresentRec(arr,n,sum,i+1);
		boolean ans = false;
		if(op1 || op2) {
			ans = true;
		}else {
			ans = false;
		}
		return ans;
	}
	
}
