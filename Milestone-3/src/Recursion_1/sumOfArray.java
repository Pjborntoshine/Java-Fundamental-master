package Recursion_1;

public class sumOfArray {
	public static int sum(int input[]) {
		int ans  = helper(input,input[0]);
		return ans;
	}
	private static int helper(int[] input,int a) {
	if(input.length ==2) {
			
			return input[input.length-1] +a;
		}
		int[] arr2 = new int[input.length-1];
		
		for(int i=1;i<input.length;i++) {
			arr2[i-1] = input[i];
		}
		
		System.out.println();
		int elem1 = arr2[0];
		int smallVal  =  helper(arr2,a);
		//System.out.println("smallVal" + arr2[0] + smallVal);
		int sumVal =smallVal + arr2[0];
		//System.out.println(sumVal);
		return sumVal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = {3,2,3,4,5};
		int[] arr23 = {4,2,1};
		System.out.println("dasa"+sum(arr23));
	}

}
