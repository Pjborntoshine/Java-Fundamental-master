package timeComplexity;

public class FindtheUniqueElement {
	public static int findUnique(int[] arr) {
		//Your code goes here
		// sorting element using merge sort
		int [] arr2 = QuickSort(arr,0,arr.length-1);
//		for(int k=0;k<arr2.length;k++) {
//			System.out.print(arr2[k]+" ");
//		}
//		System.out.println();
		int i=0;
		while(i<arr.length-1) {
			if(arr[0]!=arr[1]) {
				return arr[0];
			}
			if(arr[i] == arr[i+1] ) {
				i++;
			}
			if(arr[i] != arr[i+1]) {
				if(arr[i] != arr[i-1]) {
					return arr[i];
				}
				i++;
		}
			if((i)==arr.length-1) {
				System.out.println(arr[i]);
				return arr[i];
				
			}
		}
		return 1;
	}
	
	private static int [] QuickSort(int[] arr,int l,int h) {
		// TODO Auto-generated method stub
		if(l>=h) {
			return arr;
		}
		int partation = partationInd(arr,l,h);
		QuickSort(arr, l, partation-1);
		QuickSort(arr,partation+1,h);
		return arr;
	}

	private static int partationInd(int[] arr, int l, int h) {
		// TODO Auto-generated method stub
		int pi = l;
		// counting largets elems
		for(int i=l+1;i<=h;i++) {
			if(arr[l]>arr[i]) {
				
				pi++;
			}
		}
//		System.out.println(arr[pi]);
		int temp = arr[pi];
		arr[pi]=arr[l];
		arr[l] = temp;
		int i = 0;
		int j = h;
		while(i<j) {
			if(arr[i]>=arr[pi]) {
				if(arr[j]<arr[pi]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					i++;
				}else {
					j--;
				}
			}else {
				i++;
			}
		}
//		System.out.println(arr[pi]);
//	for(int k=0;k<arr.length;k++) {
//		System.out.print(arr[k]+" ");
//	}
//	System.out.println();
	return pi;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {1 ,3, 1, 6, 3, 6, 2};
//		int arr[] = {2 ,4, 7, 2, 7};
		int arr[] = {1, 3, 1, 3, 6, 6, 7, 10, 7};
		System.out.println(arr.length);
//		int arr[] = {3,4,5,1,2,9,8,7};
//		int arr[] = {2 ,6, 8, 5, 4, 3};
		System.out.println( findUnique(arr));
	}

}
