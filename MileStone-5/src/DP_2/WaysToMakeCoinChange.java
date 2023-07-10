package DP_2;

public class WaysToMakeCoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6};
		countWaysToMakeChange(arr,250);
	}
	
	public static int countWaysToMakeChange(int denominations[], int value){
        // Write your code here
		
	int ans =countWaysToMakeChangeREC(denominations,value,0);
		System.out.println(ans);
		int n = denominations.length+1;
		int dp[][] = new int[n][value+1];
		for(int i=0;i<dp.length;i++)
		{
			for(int j=0;j<dp[i].length;j++) {
				dp[i][j] = -1;
			}
		}
		
		for(int i=0;i<dp.length;i++)
		{
			for(int j=0;j<dp[i].length;j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
			}
		int ans2 =countWaysToMakeChangeDpREC(denominations,value,0,dp);
		System.out.println(ans2);
		int ans4 = countWaysToMakeChangeitrREC(denominations,value,0);
		System.out.println("dp ans -- " + ans4);
		return ans;
	}
	private static int countWaysToMakeChangeitrREC(int[] denominations, int value, int si) {
		int n = denominations.length+1;
		int [][] dp = new int[n][value+1];
		
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
//				System.out.print(dp[i][0] + " ");
				dp[i][0] = 1;
			}
//			System.out.println();
		}
		
		for(int i=1;i<dp.length;i++) {
			int temp = value;
			for(int w=0;w<dp[0].length;w++) {
				if(denominations[i-1] > w) {
					dp[i][w] = dp[i-1][w];
//					System.out.println("asda" + denominations[i-1]);
				}else {
					dp[i][w] = dp[i-1][w] + dp[i][w -i];
				}
			}
		}
		
//		for(int i=0;i<dp.length;i++) {
//			for(int j=0;j<dp[0].length;j++) {
//				System.out.print(dp[i][j] + " ");
//			}
//			System.out.println();
//		}
		
	return dp[dp.length-1][dp[0].length-1];
	}
	private static int countWaysToMakeChangeDpREC(int[] denominations, int value, int si,int [][] dp) {
//		System.out.println("asdas");
		if(si == denominations.length) {
			return 0;
		}
		if(value == 0) {
			
			return 1;
		}
		if(value<0) {
			
			return 0;
		}
		if(dp[si][value]!=-1) {
//			System.out.println(si + "   " + value + " test" + dp[si][value] + " " + value);
			return dp[si][value];
		}
		
		int an1 = countWaysToMakeChangeDpREC(denominations,value - denominations[si],si,dp);
		int an2 = countWaysToMakeChangeDpREC(denominations,value ,si+1,dp);
		int op = an1+an2;
		
		dp[si][value] =an1+an2; 
		return an1+an2;
	}
	
	private static int countWaysToMakeChangeREC(int[] denominations, int value, int si) {
		// TODO Auto-generated method stub
		if(si == denominations.length) {
			return 0;
		}
		if(value == 0) {
			return 1;
		}
		if(value<0) {
			return 0;
		}
		
		int an1 = countWaysToMakeChangeREC(denominations,value - denominations[si],si);
		int an2 = countWaysToMakeChangeREC(denominations,value ,si+1);
		return an1+an2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	private static int countWaysToMakeChangeREC(int[] denominations, int value, int si) {
//		// TODO Auto-generated method stub
//		
//		if(si == denominations.length) {
//			return 0;
//		}
//		if(value == 0) {
//			return 1;
//		}
//		if(value < 0) {
//			return 0;
//		}
//		int ans;
//
//		int an1 = countWaysToMakeChangeREC(denominations,value,si+1);
//		int an2 = countWaysToMakeChangeREC(denominations,value - denominations[si],si);
//		ans = an1+an2;
//		return ans;
//	}
}
