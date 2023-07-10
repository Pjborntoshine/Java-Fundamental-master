package MileStone2Array1Revision;

public class SecondLargestinarray1D {
	 public static int secondLargestElement(int[] arr) {
	    	//Your code goes here
		 	int largeELem = Integer.MIN_VALUE;
		 	int secLarg = Integer.MIN_VALUE;
		 	
		 	for(int i=0;i<arr.length;i++) {
		 		if(arr[i]>largeELem) {
		 			secLarg = largeELem;
		 			largeELem = arr[i];
		 		
		 		}else if(arr[i]>secLarg && arr[i]!=largeELem) {
		 			secLarg = arr[i];
		 		}
		 		
		 	}
		 	return secLarg;
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,7,14,0,9,4,18,18,2,4,5 };
		System.out.println(secondLargestElement(arr));
	}

}
