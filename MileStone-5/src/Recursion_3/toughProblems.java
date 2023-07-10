package Recursion_3;

public class toughProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,12,3,17,1,18,15,3,17 };
//		subsetsSumK(arr,6);
		int[][] jaggex1 =  {{2,5,1}, {2,6}};
		int[][] jaggex2 =  {{5}, {1,4}};
		int[][] op = new int[jaggex1.length + jaggex2.length][];
//		for(int i=0;i<jaggex1.length;j++) {
//			for(int j=0;j<jaggex1[0].length)
//		}
		int l=0;
		int[][] as = new int[2*jaggex1.length][];
		for(int i=0;i<jaggex1.length;i++) {
			as[i] = new int[jaggex1[i].length];
			for(int j=0;j<jaggex1[i].length;j++) {
				as[l][j] = jaggex1[i][j];
				System.out.print(as[l][j] + " ");
			}
		}
		int ind=0;
//		for(int i=0;i<jaggex1.length;i++) {
//			op[i] = new int[jaggex1[i].length];
//			System.out.println(op[i] + " == "+ jaggex1[i].length);
//			for(int j=0;j<jaggex1[i].length;j++) {
//				op[ind][j] = jaggex1[i][j];
//				System.out.println(op[ind][j]);
//			}
//			ind++;
//		}
//		
		
	}
	public static int[][] subsetsSumK(int input[], int k) {
		return subsetsSumKhelper(input,k,0);
	}
	private static int[][] subsetsSumKhelper(int[] input, int k, int si) {
		// TODO Auto-generated method stub
		if(si == input.length) { // when we traves to last index
			if(k==0) {
				// need to return sing arr;
				return new int[1][0];
			}else {
				return new int[0][0];
			}
		}
		// calling recursion 
		int [][] smallop1= subsetsSumKhelper(input, k-input[si], si+1);
		int [][] smallop2= subsetsSumKhelper(input, k, si+1);
		int[][]  output = new int[smallop1.length + smallop2.length][];
		int index =0; // for taking row value
		// looping over smallop2 Asper hint
		for(int i=0;i<smallop1.length;i++) {
			output[i]  = new int[smallop1[i].length]; // here if {{2,5,1}, {2,6}}; like this and i=0 then will refer to {2,5,1} and 1 then ->{2,6}
			for(int j=0;j<output[i].length;j++) {
				output[index][j] = smallop1[i][j];
			}
			index++;
		}
		
		for(int i=0;i<smallop2.length;i++) {
			output[index+i] = new int[smallop2[i].length]; //@ index if index 3 then @ index+i 
			output[index+i][0] = input[si];// addinf si element @ zero position
			for(int j=1;j<=smallop2.length;j++) {
				output[index+i][j] = smallop2[i][j];
			}	
		}
		return output;
	}
}
