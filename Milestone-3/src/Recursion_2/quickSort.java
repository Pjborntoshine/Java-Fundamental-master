package Recursion_2;

public class quickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {2 ,6 ,8 ,5 ,4 ,3};
		int arr[] = {10, 30, 40, 50, 70, 90, 80};
		quickSort(arr,0,arr.length-1);
	}

	private static void quickSort(int[] arr,int low,int high) {
		System.out.println(low+" "+high);
		
		// TODO Auto-generated method stub
		if(low>=high) {
			return;
		}
		int pi = partationInd(arr,low,high);
		System.out.println("piv" + pi);
		//quickSort(arr,low,pi-1);
		quickSort(arr, pi+1, high);
	}

	private static int partationInd(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int pivElem = arr[high];
		int i= (low-1);
		
		for(int j=low;j<high-1;j++) {
			if(arr[j]<pivElem) {
				i++;
				// swap
				int temp=arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		for(int l=0;l<arr.length;l++) {
			System.out.print(arr[l]+" ");
		}
		System.out.println("i->" +arr[i]);
		return i+1; // returning pivot value
	}

}
