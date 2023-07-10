package DP_2;

public class MaximumSquareMatrixWithAllZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ip[][] = {{1,1,0},{1,1,1},{1,1,1}};
		 int M[][] = { { 0, 1, 1, 0, 1 }, { 1, 1, 0, 1, 0 },
		                { 0, 1, 1, 1, 0 }, { 1, 1, 1, 1, 0 },
		                { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0 } };
		 int ip2[][] = {{0,0,0},{0,0,0},{0,0,0}};
		 int ip3[][] = {{1,1,1},{1,1,1},{1,1,0}};
		findMaxSquareWithAllZeros(ip2);
	}
	public static int findMaxSquareWithAllZeros(int[][] input){
		int n = input.length;
		int m = input[0].length;
		System.out.println(n);
		
	
		
		int anREC =  findMaxSquareWithAllZerosREC(input,n,m);
		System.out.println(anREC);
		return anREC;
		}
	private static int findMaxSquareWithAllZerosREC(int[][] input,int n,int m) {
		// TODO Auto-generated method stub
	
		int hlp[][] = new int[n][m];
		for(int i=0;i<hlp.length;i++) {
			for(int j=0;j<hlp[i].length;j++) {
				if(i==0) {
					if(input[i][j] ==0) {
						hlp[i][j] = 1;
					}else {
						hlp[i][j] = 0;
					}
				}
				
				else if(j==0) {
					if(input[i][j] ==0) {
						hlp[i][j] = 1;
					}else {
						hlp[i][j] = 0;
					}
				}
//				else {
//					hlp[i][j] = input[i][j];
//				}
				
				
			}
		}
		
		for(int i=0;i<hlp.length;i++) {
			for(int j=0;j<hlp[i].length;j++) {
				System.out.print(hlp[i][j]);
			}System.out.println();
			
		}
		int Max = 0; 
		for(int i=1;i<input.length;i++) {
			for(int j=1;j<input[i].length;j++) {
				if(input[i][j] ==0) {
					System.out.println("asda");
					hlp[i][j] = 1+ Math.min(hlp[i-1][j], Math.min(hlp[i][j-1], hlp[i-1][j-1]));
					Max = Math.max(Max, hlp[i][j]);
				}
			}
		}
		System.out.println();
		for(int i=0;i<hlp.length;i++) {
			for(int j=0;j<hlp[i].length;j++) {
				System.out.print(hlp[i][j]);
			}System.out.println();
			
		}
		
		return Max;
	}

}
