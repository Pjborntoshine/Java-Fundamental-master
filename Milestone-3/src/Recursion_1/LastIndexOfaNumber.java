package Recursion_1;

public class LastIndexOfaNumber {

	public static int lastIndex(int input[], int x) {
		int lastInt = getLastInd(input,x,input.length-1);
		return lastInt;
	}

	 private static int getLastInd(int[] input, int x, int end) {
			// TODO Auto-generated method stub
			if(input[end] == x) {
				return end;
			}
	        if(end==0) {
				return -1;
			}
			
			int hypothe = getLastInd(input, x, --end);
			
			return hypothe;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {9,8,10,8};
		System.out.println( lastIndex(arr1,9));
	}

}
