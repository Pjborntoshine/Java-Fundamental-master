package Recursion21Day;

public class MergeSort1DayRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] ={6,5,4,3,2,1};
		int arr[] = {2 ,6 ,8 ,5 ,4 ,3};
		mergeSort(arr);
	}

	private static void mergeSort(int[] arr) {
		// TODO Auto-generated method stub
		// base case
		if(arr.length <=1) {
			return;
		}
		int mid = arr.length/2;
		int[] s1 =new int[mid];
		int[] s2 = new int[arr.length-mid];
		int k=0;
		// appending into elements
		for(int i=0;i<s1.length;i++) {
			s1[i] = arr[i];
		}

		for(int i=mid;i<arr.length;i++) {
			s2[k] = arr[i];k++;
		}
		
		mergeSort(s1);
		mergeSort(s2);
		merge(s1,s2,arr);
	}
	public static void merge(int[] s1,int[] s2,int arr[]) {
//		for(int i=0;i<s1.length;i++) {
//			System.out.print(s1[i]+" ");
//		}
//		System.out.println();
//		for(int i=0;i<s2.length;i++) {
//			System.out.print(s2[i]+" ");
//		}
		System.out.println();
		int i=0,j=0,k=0;
		while(i<s1.length && j<s2.length) {
			if(s1[i]<=s2[j]) {
				arr[k] = s1[i];i++;k++;
			}else {
				arr[k] = s2[j];j++;k++;
			}
		}
		if(i<s1.length) {
			while(i<s1.length) {
				arr[k] = s1[i];i++;k++;
			}
		}
		if(j<s2.length) {
			while(j<s2.length) {
				arr[k] = s2[j];j++;k++;
			}
		}
		for(int l=0;l<arr.length;l++) {
			System.out.print(arr[l]+" ");
		}
		System.out.println();
	
	}
}
