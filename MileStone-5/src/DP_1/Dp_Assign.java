package DP_1;

import java.util.HashMap;

public class Dp_Assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
//		System.out.println(bytelandian(8));
		int[] ip = {5,5,10,100,10,5};
//		int[] ip = {2,3,1000,2000};
//		System.out.println(maxMoneyLooted(ip));
		System.out.println(findWinner(10,6,5));
	}
	
	 
	public static String findWinner(int n, int x, int y) {
		int baris=1;
		int wish =0;
		boolean ans = findWinner(n,x,y,baris);
		System.out.println(ans);
		if(ans){
			return "wish";
		}else {
			return "baris";
		}
	}
	
	private static boolean findWinner(int n, int x, int y, int player) {
		if(n==0) {
			return false;
		}
		player = 1 - player;
		boolean ans  = false;
		if(n>=x) {
			ans = findWinner(n-x, x, y, player);
			if(!ans) {
				ans = true;
			}
		}
		if(n>=y) {
			ans = findWinner(n-y, x, y, player);
			if(!ans) {
				ans = true;
			}
		}
		
		if(n>=1) {
			ans = findWinner(n-1, x,y , player);
			if(!ans) {
				ans = true;
			}
		}
		
		return ans;
	}
//	private static int findWinner(int n, int x, int y, int player) {
//		// TODO Auto-generated method stub
//		if(n<=0) {
//			return player;
//		}
//		int opp = 1-player; // for alternating the players
//		int winner = opp;
//		if(n>=1) {
//		winner = findWinner(n-1,x,y,opp);
//		}
//		if(winner !=player && n>=x) {
//			winner = findWinner(n-x, x, y, opp);
//		}
//		if(winner!=player && n>=y) {
//			winner = findWinner(n-y, x, y, opp);
//		}
//		return winner;
//	}


	//
	public static int maxMoneyLooted(int[] houses) {
		//Your code goes here
		int dp[] = new int[houses.length+1];
		for(int i=0;i<dp.length;i++) {
			dp[i] = -1;
		}
//		return maxMoneyLooted(houses,0);
//		 return maxMoneyLootedHelper(houses,houses.length -1);
		return maxMoneyLootedHelperDPREC(houses,houses.length-1,dp);
	}
	//rec +dp
	//2,3,1000,2000
	private static int maxMoneyLootedHelperDPREC(int[] houses, int n,int dp[]) {
		// TODO Auto-generated method stub
//		System.out.println("---" + houses[n]);
		if(n<0) {
			return 0;
		}
		if(n==0) {
			dp[0] = houses[0];
			System.out.println(houses[0]);
			return houses[0];
		}
		int ch1;
		if(n-2>=0) {
			if(dp[n-2]==-1) {
				 ch1 = houses[n] + maxMoneyLootedHelperDPREC(houses,n-2,dp);
//				 System.out.println("ch1" + ch1);
				 dp[n-2] = ch1;
			}else {
				ch1 = dp[n-2];
			}
		}else {
			ch1 = houses[n];
		}
		
		int ch2 ;
	
			if(dp[n-1] ==-1) {
				 ch2 = maxMoneyLootedHelperDPREC(houses,n-1,dp);
				 dp[n-1] = ch2;
			}else {
				ch2 = dp[n-1];
			}
		return Math.max(ch1, ch2);
	}
	
	//rec sol
	private static int maxMoneyLootedHelper(int[] houses, int n) {
		// TODO Auto-generated method stub
		if(n<0) {
			return 0;
		}
		if(n==0) {
			return houses[0];
		}
		
		int ch1 = houses[n] + maxMoneyLootedHelper(houses,n-2);
		int ch2 = maxMoneyLootedHelper(houses,n-1);
		return Math.max(ch1, ch2);
	}
	private static int maxMoneyLooted(int[] houses, int si) {
		// TODO Auto-generated method stub
		if(si>=houses.length) {
			System.out.println("si" + si);
			return 0;
		}
		int MaxSum = Integer.MIN_VALUE;
		for(int i=si;i<houses.length;i++) {
			int smallOp = maxMoneyLooted(houses,si+2);
			smallOp+=houses[si];
			if(MaxSum<smallOp) {
				MaxSum = smallOp;
			}
			
		}
	
		int mAns = MaxSum;
		System.out.println(mAns);
		return mAns;
	}
	
	
	public static long bytelandian(long n) {
        // Write your code here
//		long[] dp = new long[n+1];
//		for(int i=0;i<dp.length;i++) {
//			dp[i] = -1;
//		}
		HashMap<Long, Long> dp = new HashMap();
		for(long i=0;i<n+1;i++) {
			dp.put(i, (long) -1);
		}
//		for(long key: dp.keySet()) {
//			
//			System.out.println(key + " "+dp.get(key));
//		}
//		return bytelandianRecDp(n,dp);
		return bytelandianDpItr(n,dp);
	}
	
	// itr+dp
	private static long bytelandianDpItr(long n,HashMap<Long, Long> dp) {
		long zro = 0;
		long one = 1;
		long tw = 2;
		long tree = 3;
		dp.put(zro,zro);
		dp.put(one,one);		
		dp.put(tw,tw);
		dp.put(tree,tree);
		
		for(long key: dp.keySet()) {
			
			System.out.println(key + " "+dp.get(key));
		}
		
	for(long i=4;i<dp.size();i++) {
		double sum1 = Math.floor(i/2) +Math.floor(i/3) + Math.floor(i/4);
		if(sum1<i) {
			sum1 = i;
		}
		System.out.println(sum1);
		long San1 = dp.get((long) Math.floor(i/2));
		long San2 = dp.get((long) Math.floor(i/3));
		long San3 = dp.get((long) Math.floor(i/4));
		double Smlsum = San1 +San2 + San3; 
		double sAns = Math.max(sum1, Smlsum);
		dp.put(i, (long) sAns);
	}
	return dp.get(n);
	}
	
	// rec+dp
	private static long bytelandianRecDp(long n,HashMap<Long, Long> dp) {
		
		if(n==1 || n==2 || n==3) {
			return n;
		}
		
		if(n<=0) {
			return 0;
		}
		double sum1 = Math.floor(n/2) +Math.floor(n/3) + Math.floor(n/4);
		
		long San1,San2,San3;
		if(dp.get(Math.floor(n/2))== null) {
			San1 =bytelandianRecDp(n/2,dp);
			dp.put((long) Math.floor(n/2), San1);
		}else {
			San1 = dp.get(Math.floor(n/2));
		}
	
		if(dp.get(Math.floor(n/3))== null) {
			San2 =bytelandianRecDp(n/3,dp);
			dp.put((long) Math.floor(n/3), San1);
		}else {
			San2 = dp.get(Math.floor(n/3));
		}
		
		
		if(dp.get(Math.floor(n/4))== null) {
			San3 =bytelandianRecDp(n/4,dp);
			dp.put((long) Math.floor(n/4), San3);
		}else {
			San3 = dp.get(Math.floor(n/4));
		}
		
		double Smlsum = San1 +San2 + San3; 
		double sAns = Math.max(sum1, Smlsum);
		long ans = (long) sAns;
		return ans;  
	}
	
	// rec
	private static long bytelandianREC(long n) {
		// TODO Auto-generated method stub
		if(n==1 || n==2 || n==3) {
			return n;
		}
		
		if(n<=0) {
			return 0;
		}
		
		double sum1 = Math.floor(n/2) +Math.floor(n/3) + Math.floor(n/4);  
		long San1 =bytelandianREC(n/2);
		long San2 =bytelandianREC(n/3);
		long San3 =bytelandianREC(n/4);
		double Smlsum = Math.floor(San1) +Math.floor(San2) + Math.floor(San3);  
		double sAns = Math.max(sum1, Smlsum);
		long ans = (long) sAns;
//	
//		System.out.println(ans);
		return ans;
	}
}
