package timeComplexity;

public class ArrInteraction {
	public static void intersection(int[] arr1, int[] arr2) {
	    //Your code goes here
		// Need to sort only smaller array 
//		for(int l=0;l<arr1.length;l++) {
//			System.out.print(arr1[l] + " ");
//		}
//			System.out.println();
//			for(int m=0;m<arr2.length;m++) {
//				System.out.print(arr2[m] + " ");
//			}
			int i=0,j=0;
			while(i<arr1.length && j<arr2.length) {
				if(arr1[i]<arr2[j]) {
					i++;
				}
				else if(arr2[j]<arr1[i]) {
					j++;
				}else if(arr1[i]== arr2[j]) {
					System.out.println(arr1[i]);i++;j++;
				}
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {2 ,6 ,8 ,5 ,4 ,3};
//		int arr2[] ={2 ,1, 5, 2, 3};
		int arr[] = {};
		int arr2[] ={};
		int[] arrRet=mergeSort(arr2);
		intersection(arr,arr2);
	}

	private static int[] mergeSort(int[] arr) {
		if(arr.length==1) {
			return arr;
		}
		int midelem = arr.length/2;
		int f1[] = new int[midelem];
		int f2[] = new int[arr.length-midelem];
		System.out.println(f1.length +" "+ f2.length);
		for(int i=0;i<f1.length;i++) {
			f1[i] = arr[i];
		}
		int k=0;
		for(int j=midelem;j<arr.length;j++) {
			f2[k] = arr[j];k++;
		}
		// calling merger sort using recrsioln
		mergeSort(f1);
		mergeSort(f2);
		int[] arrRet = merger(f1, f2, arr);
		return	arrRet;
	
		
	}
	public static int [] merger(int[] firstHalf,int[] secHalf,int[] arr) {
		int i = 0;
		int j=0;
		int k=0;
		while(i<firstHalf.length && j<secHalf.length) {
			if(firstHalf[i]<=secHalf[j]) {
				arr[k] = firstHalf[i];i++;k++;
			}else {
				arr[k] = secHalf[j];j++;k++;
			}
			
		}
		if(i<firstHalf.length) {
			while(i<firstHalf.length) {
				arr[k] = firstHalf[i];i++;k++;
			}
		}else if(j<secHalf.length) {
			while(j<secHalf.length) {
				arr[k] = secHalf[j];j++;k++;
			}
		}
//		for(int l=0;l<arr.length;l++) {
//			System.out.print(arr[l] + " ");
//		}
//			System.out.println();
	return arr;
	}
}
