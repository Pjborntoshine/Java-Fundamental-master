package Recursion21Day;

public class QuickSort1DayRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {2 ,3, 1, 6, 3, 6, 2};
		int arr[] = {3,4,5,1,2,9,8,7};
		quickSort(arr,0,arr.length-1);
	}

	private static void quickSort(int[] arr, int i, int j) {
		if(i>=j) {
			return;
		}
		// TODO Auto-generated method stub
		int pivot = partation(arr,i,j);
		quickSort(arr, i, pivot-1);
		quickSort(arr, pivot+1, j);
	
	}

	private static int partation(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		// calculating all emlement less the arr[0]
		int elem = arr[si];
		int p=si;
		for(int i=si+1;i<=ei;i++) {
			if(elem>arr[i]) {
				p++;
			}
		}
		
		System.out.println(p);
		// swaping  to correct pos
		int temp = arr[p];
		arr[p] = arr[si];
		arr[si] = temp;
	// using pivot arranging the elements
		int i=si,j=ei;
		while(i<j) {
			if(arr[i]>=elem) {
				if(arr[j]<elem) {
					// swap
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}else {
					j--;
				}
			}else {
				i++;
			}
		}
		
		for(int l=0;l<arr.length;l++) {
			System.out.print(arr[l] + " ");
		}
		System.out.println();
		
		return p;
	}

}
