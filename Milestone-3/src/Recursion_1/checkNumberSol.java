package Recursion_1;

public class checkNumberSol {

	public static boolean checkNumber(int input[], int x) {
		if(input[0] ==x) {
			return true;
		}
		if(input.length==1) {
			if(input[input.length-1] == x) {
				return true;
			}
			return false;
		}
		int[] arr2 = new int[input.length-1];
		for(int i=1;i<input.length;i++) {
			arr2[i-1] = input[i];
		}
		
		boolean smallAns = checkNumber(arr2, x);
		//System.out.println(smallAns);
		return smallAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = {9,8,10};
		System.out.println(checkNumber(arr2,15));
	}

}
