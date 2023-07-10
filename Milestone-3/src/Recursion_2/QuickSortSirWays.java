package Recursion_2;

public class QuickSortSirWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {10, 30, 40, 50, 70, 90, 80};
		//int arr[] = {3,4,5,1,2,9,8,7};
		//int arr[] = {2 ,6, 8, 5, 4, 3};
		int arr[] = {2 ,3, 1, 6, 3, 6, 2};
		quickSort(arr,0,arr.length-1);
	}

	private static void quickSort(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		if(i>=j) {
			return;
		}
		int pi = partation(arr,i,j);
		System.out.println("pi" + pi);
		quickSort(arr,i,pi-1);
		quickSort(arr,pi+1,j);
	}

	private static int partation(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		int pielem= arr[si];
		int c=si;
		for(int i=si+1;i<=ei;i++) {
			if(arr[si]>arr[i]) {
				System.out.println(arr[i]+" "+arr[si]);
				c++;
			}
		}
		System.out.println("=-=>"+arr[c]);
		// swap elem
		int temp = arr[si];
		arr[si] = arr[c];
		arr[c] = temp;
		System.out.println(arr[c]);
		int i=si;
		int j=ei;
		while(i<j) {
			if(arr[i]>=pielem) {
				if(arr[j]<pielem) {
					// swap
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]  =temp;
					i++;
				}else {
					j--;
				}
			}else {
				i++;
			}
		}
		for(int l=0;l<arr.length;l++) {
			System.out.print(arr[l]+" ");
		}
		System.out.println();
		return c;
	}

}
