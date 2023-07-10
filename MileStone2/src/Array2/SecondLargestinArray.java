package Array2;

public class SecondLargestinArray {

//    public static int secondLargestElement(int[] arr) {
//    	//Your code goes here
//    	// sorting the array
//    	// using selection sort
//    	  int n=arr.length;
//    	    for(int i=1;i<n;i++){
//    	        //Insert ith element in sorted position
//    	        int j=i-1;
//    	        int temp=arr[i];
//    	        while(j>=0 && arr[j]>temp){
//    	            arr[j+1]=arr[j];
//    	            j--;
//    	        }
//    	        //Position will be j+1;
//    	        arr[j+1]=temp;
//    	        
//    	       
//    	    }
//    	    System.out.println(arr[n-2]);
//    	    if(arr[n-2]==arr[n-1]) {
//    	    	return arr[n-3];
//    	    }else {
//    	    	return arr[n-2];
//    	    }
////    	for(int l=0;l<arr.length;l++) {
////			System.out.print(arr[l]+" ");
////		}
////    	return 1;
//    }
    public static int secondLargestElement(int[] arr) {
    	int largest = Integer.MIN_VALUE;
    	int secLagest = Integer.MIN_VALUE;
    	for(int i=0;i<arr.length;i++) {
    		if(largest<arr[i]) {
    			secLagest = largest;
    			largest = arr[i];
    		}else {
    			if(secLagest<arr[i] && arr[i]!=largest) {
    				secLagest = arr[i];
    			}
    		}
    	}
    	return secLagest;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,1};
		int ans =secondLargestElement(arr);
		System.out.println(ans);
	}

}
