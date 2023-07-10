package timeComplexity;

public class DuplicateInArray {
	public static int findDuplicate(int[] arr) {
		//Your code goes here
		// calling mergsort
		arr = mergrSort(arr);
		for(int l=0;l<arr.length;l++) {
			if((l+1)!=arr.length&&arr[l]==arr[l+1]) {
				System.out.println(arr[l]);
			}
		}
		System.out.println();
		return 0;
	}
	
	private static int[] mergrSort(int[] arr) {
		if(arr.length==1) {
			return arr;
		}
		// TODO Auto-generated method stub
		int mid = arr.length/2;
		int[] arr1 = new int[mid];
		int[] arr2 = new int[arr.length-mid];
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = arr[i];
		}
		int k=0;
		for(int j=mid;j<arr.length;j++) {
			arr2[k] = arr[j];k++;
		}

		
		mergrSort(arr1);
		mergrSort(arr2);
		int retarr[] = merge(arr1,arr2,arr);
		return retarr;
	}

	private static int[] merge(int[] arr1,int[] arr2,int[] arr) {

		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<=arr2[j]) {
				arr[k] = arr1[i];i++;k++;
			}else if(arr2[j]<arr1[i]) {
				arr[k] = arr2[j];j++;k++;
			}
		}
		if(i<arr1.length) {
			while(i<arr1.length) {
				arr[k] = arr1[i];i++;k++;
			}
		}
		if(j<arr2.length) {
			while (j<arr2.length) {
				arr[k] = arr2[j];j++;k++;
			}
		}
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0 ,7, 2, 5, 4, 7, 1, 3, 6};
//		int arr[] = {0 ,3, 1, 5, 4, 3, 2};
		findDuplicate(arr);
	}

}
