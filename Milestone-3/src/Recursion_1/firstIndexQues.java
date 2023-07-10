package Recursion_1;

public class firstIndexQues {

	public static int firstIndex(int input[], int x) {
			int ans = IndexDataVal(input, x,0);
			return ans;
	}
	
	private static int IndexDataVal(int[] input, int x, int startInd) {
		// TODO Auto-generated method stub
		if(startInd == input.length) {
			return -1;
		}
		if(input[startInd] == x) {
			return startInd;
		}
		int smallhyp = IndexDataVal(input, x, startInd+1);
		return smallhyp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {9,8,10,8};
		System.out.println( firstIndex(arr1,15));
	}

}
