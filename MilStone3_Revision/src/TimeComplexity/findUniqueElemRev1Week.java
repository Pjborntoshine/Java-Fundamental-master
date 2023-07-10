package TimeComplexity;

import java.util.Arrays;

public class findUniqueElemRev1Week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {1 ,3, 1, 6, 3, 6, 2};

//		int arr[] = {2 ,4, 7, 2, 7};
//		int arr[] = {1, 3, 1, 3, 6, 6, 7, 10, 7};
//		System.out.println("asda"+ arr.length);
//		int arr[] = {3,4,5,1,2,9,8,7};
		int arr[] = {1 ,7, 1, 3, 7 };
		System.out.println( "dasd"+findUnique(arr));
	}
	private static int findUnique(int[] arr) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		int i=0,j=1;
		while(i<arr.length-1&& j<arr.length-1) {
			if(arr[i] ==arr[j]) {
				i=i+2;
				j=j+2;
			}
			else if(arr[i] !=arr[j]) {
				System.out.println(arr[i]);
				return arr[i];
			}else {
				return arr[i];
			}
			
		}
		return 1;
	}

}
