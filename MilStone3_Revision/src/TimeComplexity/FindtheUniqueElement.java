package TimeComplexity;

public class FindtheUniqueElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {1 ,3, 1, 6, 3, 6, 2};

//		int arr[] = {2 ,4, 7, 2, 7};
//		int arr[] = {1, 3, 1, 3, 6, 6, 7, 10, 7};
//		System.out.println("asda"+ arr.length);
//		int arr[] = {3,4,5,1,2,9,8,7};
		int arr[] = {1 ,7, 1, 3, 7 };
		System.out.println( findUnique(arr));
	}

	private static int findUnique(int[] arr) {
		// TODO Auto-generated method stub
		// calling merge sort 1 week rev
		arr = mergeSort(arr);
		int i=0,j=1;
		while(i<arr.length-1 && j<arr.length-1) {
			if(arr[i] == arr[j]) {
				// element id dupliate
				i=i+2;
				j=j+2;
			}
			else if(arr[i]!=arr[j]) {
				System.out.println(arr[i]);
				return arr[i];
			}
			if(i==arr.length-1) {
				System.out.println("i=>" + arr[i]);
				return arr[i];
			}
			
			
		}
		return 1;
	}

	private static int[] mergeSort(int[] arr) {
		// TODO Auto-generated method stub
		if(arr.length == 1) {
			return arr;
		}
		int mid = arr.length/2;
		int f1[] = new int[mid];
		int[] f2 = new int[arr.length-mid];
		for(int i=0;i<f1.length;i++) {
			f1[i] = arr[i];
		}
		int k=0;
		for(int i=mid;i<arr.length;i++) {
			f2[k] = arr[i];k++;
		}
//		for(int i=0;i<f1.length;i++) {
//			System.out.print(f1[i] + " ");
//		}
//		System.out.println();
//		for(int i=0;i<f2.length;i++) {
//			System.out.print(f2[i] + " ");
//		}
		mergeSort(f1);
		mergeSort(f2);
	int[] arr2=	merge(f1,f2,arr);
		return arr2;
	}

	private static int[] merge(int[] f1, int[] f2, int[] arr) {
		// TODO Auto-generated method stub
		int i=0,j=0,k=0;
		while(i<f1.length && j<f2.length) {
			if(f1[i]<=f2[j]) {
				arr[k] = f1[i];i++;k++;
			}else if(f2[j]<f1[i]) {
				arr[k] = f2[j];j++;k++;
			}
		}
	if(i<f1.length) {
		while(i<f1.length) {
			arr[k] = f1[i];i++;k++;
		}
	}
	if(j<f2.length) {
		while(j<f2.length) {
			arr[k] = f2[j];j++;k++;
		}
	}
		
	for(int l=0;l<arr.length;l++) {
		System.out.print(arr[l] + " ");
	}
	System.out.println();
	return arr;
	}

}
