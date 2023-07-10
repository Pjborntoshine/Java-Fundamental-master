package DP_2;

public class SmallestSuper_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smallestSuperSequence("abc","gbc");
	}

	public static int smallestSuperSequence(String str1, String str2) {

       int ansR = smallestSuperSequenceREC(str1,str2,0,0);
       
       System.out.println(ansR);
       int [][] dp = new int[str1.length()+1][str2.length()+1];
       for(int i=0;i<dp.length;i++) {
    	   for(int j=0;j<dp[i].length;j++) {
    		   dp[i][j] = -1;
    	   }
       }
       int ansDPR = smallestSuperSequenceDpREC(str1,str2,0,0,dp);
       System.out.println(ansDPR);
       int ansItr = smallestSuperSequenceItrREC(str1,str2);
       System.out.println(ansItr);
       return ansR;
	}
//	itr + dp
	private static int smallestSuperSequenceItrREC(String str1, String str2) {
		 int [][] dp = new int[str1.length()+1][str2.length()+1];
		 int m = dp.length;
		 int n = dp[0].length;
		
		 
		 for(int i=0;i<dp.length;i++) {
//			 dp[i][n-1] =
			 dp[i][n-1] = (m-1)-i;
		 }
		 for(int i=0;i<dp[0].length;i++) {
				dp[m -1][i] = (dp[0].length -1 )-i;
			 }
		 
		 for(int i=0;i<dp.length;i++) {
	    	   for(int j=0;j<dp[i].length;j++) {
	    		   System.out.print(dp[i][j]+" ");
	    	   }
	    	   System.out.println();
	       }
		 System.out.println();
		 
		 for(int i=dp.length-2;i>=0;i--) {
	    	   for(int j=dp[i].length-2;j>=0;j--) {
	    		  
	    		if(str1.charAt(i) == str2.charAt(j)) {
	    			dp[i][j] = 1 + dp[i+1][j+1]; 
	    		}else {
	    			dp[i][j] = 1+ Math.min(dp[i+1][j], dp[i][j+1]);
	    		}
	    	   }
		 }
		 for(int i=0;i<dp.length;i++) {
	    	   for(int j=0;j<dp[i].length;j++) {
	    		   System.out.print(dp[i][j]+" ");
	    	   }
	    	   System.out.println();
	       }
		 System.out.println();
		 return dp[0][0];
	}
	
	private static int smallestSuperSequenceDpREC(String str1, String str2,int i, int j,int [][] dp) {
		if(i==str1.length() ) {
			return str2.length() - j;
		}
		if(j==str2.length()) {
			return str1.length() - i;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int op;
		if(str1.charAt(i) == str2.charAt(j)) {
			
			op = 1+ smallestSuperSequenceREC(str1,str2,i+1,j+1);
		}else {
			int an1 = smallestSuperSequenceREC(str1,str2,i+1,j);
			int an2 =  smallestSuperSequenceREC(str1,str2,i,j+1);
			op =1+ Math.min(an1, an2);
		}
		dp[i][j] = op;
		return op;
	}
	
	private static int smallestSuperSequenceREC(String str1, String str2,int i, int j) {
		// TODO Auto-generated method stub
		if(i==str1.length() ) {
			return str2.length() - j;
		}
		if(j==str2.length()) {
			return str1.length() - i;
		}
		int op;
		if(str1.charAt(i) == str2.charAt(j)) {
			
			op = 1+ smallestSuperSequenceREC(str1,str2,i+1,j+1);
		}else {
			int an1 = smallestSuperSequenceREC(str1,str2,i+1,j);
			int an2 =  smallestSuperSequenceREC(str1,str2,i,j+1);
			op =1+ Math.min(an1, an2);
		}
		
		return op;
	}

}
