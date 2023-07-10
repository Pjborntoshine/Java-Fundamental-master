package Recursion_1;

public class ArraySortedOrNot {

	public static boolean checkArraySSorted(int arr[]) {
		if(arr.length == 1) {
			return true;
		}
		if(arr[0]>arr[1]) {
			return false;
		}
		int[] smallArray = new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			smallArray[i-1] = arr[i];
		}
		boolean isSorted = checkArraySSorted(smallArray);
		return isSorted;
		
		
	}
	public static boolean checkArraySSortedOptimized(int arr[]){
		boolean ans  = checkArraySSortedOptimized(arr,0);return ans;
	}
	private static boolean checkArraySSortedOptimized(int[] arr, int start) {
		// TODO Auto-generated method stub
		if(start == arr.length-1) {
			return true;
		}
		if(arr[start]>arr[start +1]) {
			return false;
		}
		boolean isSitred = checkArraySSortedOptimized(arr,start+1);
		//System.out.println(isSitred);
		return isSitred;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,4,3,5};
//		System.out.println(checkArraySSorted(arr2));
		System.out.println(checkArraySSortedOptimized(arr1));
		System.out.println(checkArraySSortedOptimized(arr2));
	}

}
