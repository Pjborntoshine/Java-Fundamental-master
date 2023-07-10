package DP_1;

import java.util.Scanner;
// Very imporatn point for itr+dp
//1. filled base case or initial ansof rec sol to storage[]
//2. apply recression realtion witj ith term	
public class fibonnacie {
	public static void fibbi(int n, int dp[]) {
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		int[] dp = new int[n+1];
//		for(int i=0;i<dp.length;i++) {
//			dp[i] = -1;
//		}
//		int ans = fib(n,dp);
//		System.out.println(ans);
//		System.out.println(staircase(10));
		System.out.println(countMinStepsToOne(10));
	}
	// Start Min Steps To One
	public static int countMinStepsToOne(int n) {
		//Your code goes here
		int dp[] = new int[n+1];
		for(int i=0;i<dp.length;i++) {
			dp[i] = -1;
		}
//		return countMinStepsToOneDpHplr(n,dp);
//		return  countMinStepsToOneHelper(n,dp);
//		return countMinStepsToOneDpHplrITrSol1(n,dp);
//		return minStepTo1(n,dp);
		return minStepTo1itrDp(n,dp);
	}
	//  way itr+ dp
	private static int minStepTo1itrDp(int n,int dp[]) {
		dp[1] = 0;
		
		for(int i=2;i<dp.length;i++) {
			int a1 = Integer.MAX_VALUE,a2=Integer.MAX_VALUE,a3 = Integer.MAX_VALUE;
			a1 = dp[i-1];// 0
			if(i%2==0) {
				a2 = dp[i/2]; // 0
			}
			if(i%3==0) {
				a3 = dp[i/3];
			}
//			System.out.println(i + " " + dp[i]);
			dp[i] = Math.min(a1, Math.min(a2, a3));
			dp[i]+=1;
//			System.out.println(i + " " + dp[i]);
		}
//		System.out.println("" + dp[n]);
		return dp[n]; 
		
	}
	
	// sir;s way rec+ dp
	private static int minStepTo1(int n,int dp[]) {
		if(n==1) {
			return 0;
		}
		int ans11;
		if(dp[n-1]==-1) {
			ans11= minStepTo1(n-1,dp);
			dp[n-1] = ans11;
		}else {
			ans11 = dp[n-1];
		}
	
		int ans2 = Integer.MAX_VALUE;
		if(n%2==0) {
			if(dp[n/2] == -1) {
				ans2 = minStepTo1(n/2,dp);
				dp[n/2] = ans2;
			}else {
				ans2 = dp[n/2];
			}
			
		}
		int ans3 = Integer.MAX_VALUE;
		if(n%3==0) {
			if(dp[n/3]==-1) {
				ans3 = minStepTo1(n/3,dp);
				dp[n/3] = ans3;
			}else {
				ans3 = dp[n/3];
			}
			
		}
		int myANs = Math.min(ans11, Math.min(ans2, ans3))+1;
		return myANs;
	}
	// dp ising Iterative sol
	private static int countMinStepsToOneDpHplrITrSol(int n, int[] dp) {
		dp[0] = 1;
		dp[1] = 0;
		dp[2] = 1;
		dp[3] = 1;
		int a1 =Integer.MAX_VALUE,a2 = Integer.MAX_VALUE,a3 = Integer.MAX_VALUE;
		int temp = n;
		for(int i=4;i<dp.length;i++) {
			if(n%2==0) {
				a2 = temp/2; 
			}
			if(n%3==0) {
				a3 = temp/3;
			}
			a3 = temp-1;
			int ans  = Math.min(a2, Math.min(a2, a3));
			dp[i] = ans;
			temp = temp-1;
		}
		System.out.println(n+"==="+dp[n]);
		return dp[n];
	}
	// using rec + dp
	
	// dp ising Iterative sol
	private static int countMinStepsToOneDpHplrITrSol1(int n, int[] dp) {
        if(n==1){
            return 0;
        }
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        int temp = n;
        int c=0;
        for(int i=3;i<dp.length;i++) {
        	
        	if(temp%2==0) {
        		temp = temp/2;
        		c +=dp[1]; 
        	}
        	else if(temp%3==0) {
        		temp = temp/3;
        		c +=dp[2];
        	}
        	else {
        		temp = temp-1;
        		c+=dp[0];
        	}
        	
        	if(temp==1 || temp==0) {
        		
        		dp[n] = c;
        		break;
        	}
        	
        }
		for(int i=0;i<dp.length;i++) {
			System.out.println(dp[i]);
		}
//		System.out.println(n+"==="+dp[n]);
		return dp[n];
	}
	
	
	
	// using rec + dp
	private static int countMinStepsToOneDpHplrRecDP(int n, int[] dp) {
		if(n == 1) {
			dp[n] = 0;
			return 0;
		}
		int an1=Integer.MAX_VALUE,an2 = Integer.MAX_VALUE,an3 = Integer.MAX_VALUE;
		an1 =  countMinStepsToOneDpHplrRecDP(n-1,dp);
		if(n%2==0) {
			if(dp[n] ==-1 ) {
				an2 =  countMinStepsToOneDpHplrRecDP(n/2,dp);
				dp[n] = an2;
			}else {
				an2 = dp[n];
			}
		}
		
		if(n%3==0) {
			if(dp[n] ==-1 ) {
				an3 =  countMinStepsToOneDpHplrRecDP(n/3,dp);
				dp[n] = an3;
			}else {
				an3 = dp[n];
			}
		}
		dp[n] = Math.min(an1,Math.min(an2, an3));
		return dp[n]+1;
	}

	
	
	// using Rec
private static int countMinStepsToOneHelper(int n, int[] dp) {
		// TODO Auto-generated method stub
//		if(n<=0 ) {
//			return 0;
//		}
		if(n==1) {
			return 0;
		}
		int an1 =Integer.MAX_VALUE,an2 = Integer.MAX_VALUE,an3 = Integer.MAX_VALUE;
		an1= countMinStepsToOneHelper(n-1,dp);
		if(n%2==0) {
			an2=countMinStepsToOneHelper(n/2,dp);
		}
		if(n%3 ==0) {
			an3=countMinStepsToOneHelper(n/3,dp);
		}
		int ans = Math.min(an1, Math.min(an2, an3));
		System.out.println(ans);
		return ans+1;
	}
	//	Stop Min Steps To One
//	Stair Case
	public static long staircase(int n) {
		//Your code goes here
		long arr[]  = new long[n+1];
		for(int i=0;i<arr.length;i++) {
			arr[i]=-1;
		}
//		return staircaseM(n,arr);
//		return staircaseMIte(n,arr);
		return staircaseHelepr(n,arr);
	}
	
	 public static long staircaseM(int n , long storage[]) {
	        //when the n = 0 we will store that value to the storage array 
	        if(n == 0){
	            storage[n] = 1;
	            return storage[n];
	        }
	        if(n == 1 || n == 2){
	            //store that value in the storage array so as to use it when redundency occur
	            storage[n] = n;
	            return storage[n];
	        }
	        //if the value of n is already calculated than we will use that value instead of calling recursion overt that valu e again
	        if(storage[n] != -1){
	            return storage[n];
	        }
	        storage[n] = staircaseM(n-1 , storage) + staircaseM(n-2 , storage) + staircaseM(n-3 , storage);
	        return storage[n];
	    }
	
//	  iterative DP
	 public static long staircaseMIte(int n , long dp[]) {
		 if(n==1) {
			 return 1;
		 }
		 if(n<0) {
			 return 0;
		 }
		 dp[0] = 1;
		 dp[1] = 1;
		 dp[2] = 2;
		 for(int i=3;i<=n;i++) {
			 dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
			
		 }
		 System.out.println("dp" + dp[n]);
		 return dp[n];
	 }
	 //ToDO Need to DO
	private static long staircaseHelepr(int n,long[] arr) {
		// TODO Auto-generated method stub
		
		if(n==1) {
			arr[n] = 1;
			return 1;
		}
		if(n<=0) {
			return 0;
		}
		long ans1,ans2,ans3;
		
		if(arr[n-1] == -1) {
			ans1 = staircaseHelepr(n-1,arr);
			arr[n-1] = ans1;
		}else {
			ans1 = arr[n-1];
		}
		
		if(n>=2) {
			if(arr[n-2] == -1) {
				ans2 = staircaseHelepr(n-2,arr);
				arr[n-2] = ans2;
			}else {
				ans2 = arr[n-2];
			}
			
		}else {
			ans2 = 1;
		}
		if(n>=3) {
			if(n >=3 && arr[n-3] == -1) {
				ans3 = staircaseHelepr(n-3,arr);
				arr[n-3] = ans3;
			}else {
				ans3 = arr[n-3];
			}
		}else {
			ans3 = 2;
		}
		arr[n] =ans1+ans2+ans3; 
		return arr[n];
	}
	
	// Recursive + DP code
	private static int fib(int n, int[] dp) {
		if(n==0 || n==1) {
			return n;
		}
		int ans1,ans2;
		if(dp[n-1] ==-1) {
			// ans is not present
			ans1 = fib(n-1, dp);
			dp[n-1] = ans1;
		}else {
			ans1 = dp[n-1];
		}
		
		
		if(dp[n-2] ==-1) {
			ans2 = fib(n-2, dp);
			dp[n-2] = ans2;
		}else {
			ans2 = dp[n-2];
		}
		
		int myans = ans1+ans2;
		return myans;
	}

}
