package timeComplexity;

import java.util.Arrays;

public class RotateArray {

//	public static void rotate(int[] arr, int d) {
//    	//Your code goes here
//		int arr2[] = new int[arr.length];
//		int arr3[] = new int[arr.length];
//		int k=0;
//		for(int i=arr.length-1;i>=0;i--) {
//			arr2[k] = arr[i];
//			k++;
//		}
//		
////		for(int j=0;j<arr2.length;j++) {
////			System.out.print(arr2[j] + " ");
////		}
////		System.out.println();
////		
//		
//		int l1 = (arr.length-d)-1;
////		System.out.println(l1);
//		int m=0;
//		for(int i=l1;i>=0;i--) {
//			arr3[m] = arr2[i];m++;
//		}
//		int o = l1+1;
//		for(int j=arr2.length-1;j>l1;j--) {
////			System.out.print(arr2[j] + " ");
//			arr3[o] = arr2[j];o++;
//		}
////	System.out.println();
//
//		for(int j=0;j<arr3.length;j++) {
//		System.out.print(arr3[j] + " ");
//	}
//	System.out.println();
//		
//	}

	
	public static void rotate(int[] arr, int d) {
//		System.out.println(((arr.length-1)-d)+1);
		int ind = ((arr.length-1)-d)+1;
		arr = reverseArr(arr,0,arr.length-1);
		arr = reverseArr(arr, 0, (arr.length-1)-d);
		arr = reverseArr(arr, ind, arr.length-1);
	}

	
	
	private static int[] reverseArr(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		int i=si,j=ei;
		while(i<j) {
			// swapping elements
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;j--;
		}
//		for(int l=0;l<arr.length;l++) {
//			System.out.print(arr[l] + " ");
//		}
//		System.out.println();
		
		
		return arr;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1 ,2, 3, 4, 5, 6, 7};
		rotate(arr, 2);
	}

}
