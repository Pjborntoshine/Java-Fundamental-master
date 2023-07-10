package timeComplexity;

public class pairSum {

	public static int pairSum(int[] arr, int num) {
		if(arr.length == 0) {
			return 0;
		}
		//Your code goes here
		arr  =  mergeSort(arr);
		for(int l=0;l<arr.length;l++) {
			System.out.print(arr[l] +" ");
		}
		System.out.println();
        int i=0,j = arr.length-1;
        int c=0;

        while(i<j) {
        	System.out.println("i" + i);
        	int sum =0;
        	sum=arr[i] + arr[j];
//        	System.out.println("sum->" + arr[i]+" "+j+"=>" +sum);
        	if(sum>num) {
        		j--;
        	}else if(sum<num) {
        		i++;
        	}else {
        		//System.out.println(i + " " + j +" ="+arr[i]+ " c->" + c);
        		c++;  	
        		
        		i++;j--;
//        		
//        		if(i>0 && i<arr.length-1 && i<j) {
//        			int k=i;
//        			while(arr[k-1]==arr[k] && k<arr.length-1) {
//        				System.out.println(c);
//        				c++;
//        				k++;
//        			}
////        		
//        		}
//        	
        	}
        }
        return c;
	}
	private static int[] mergeSort(int[] arr) {
		if(arr.length==1) {
			return arr;
		}
		// TODO Auto-generated method stub
		int mid = arr.length/2;
		int a1[] = new int[mid];
		int a2[] = new int[arr.length-mid];
		for(int i=0;i<a1.length;i++) {
			a1[i] = arr[i];
		}
		int k=0;
		for(int i=mid;i<arr.length;i++) {
			a2[k] = arr[i];k++;
		}
//		for(int i=0;i<a1.length;i++) {
//			System.out.print(a1[i] + " ");
//		}
//		System.out.println();
//		for(int i=0;i<a2.length;i++) {
//			System.out.print(a2[i] + " ");
//		}
//		System.out.println();
		mergeSort(a1);
		mergeSort(a2);
	int retArr[]=mergeArr(a1,a2,arr);
	return retArr;
	}
	private static int [] mergeArr(int[] a1, int[] a2, int[] arr) {
		// TODO Auto-generated method stub
	// sorting
		int i=0,j=0,k=0;
		while(i<a1.length && j<a2.length) {
			if(a1[i]<=a2[j]) {
				arr[k] = a1[i];i++;k++;
			}else if(a2[j]<a1[i]) {
				arr[k] = a2[j];j++;k++;
			}
		}
		if(i<a1.length) {
			while(i<a1.length) {
				arr[k] = a1[i];i++;k++;
			}
		}
		if(j<a2.length) {
			while(j<a2.length) {
				arr[k] = a2[j];j++;k++;
			}
		}
		return arr;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	int arr[]= {1 ,3, 6, 2, 5, 4, 3, 2, 4};
//		int arr[]= {2 ,8, 10, 5, -2, 5};
//		int arr2[] = {0};
	//	int arr[] = {0, 6, 0, 0};
	int arr2[] = {3,3,3,3,3};
	
//	System.out.println(pairSum(arr, 6));	
	System.out.println(pairSum(arr2, 6));	
	}

}
