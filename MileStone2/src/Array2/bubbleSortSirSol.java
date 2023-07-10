package Array2;

public class bubbleSortSirSol {
	public static void printArray(int[]arr){
	    int n=arr.length;
	    for(int i=0;i<n;i++){
	        System.out.println(arr[i]);
	    }
	}
	public static void bubbleSort(int[] arr){
	    int n=arr.length;
	    for(int i=0;i<n-1;i++){
	        //In-1 Rounds
	        
	        for(int j=0;j<n-1-i;j++){
	            
	            if(arr[j]>arr[j+1]){
	                int temp=arr[j];
	                arr[j]=arr[j+1];
	                arr[j+1]=temp;

	            }
	        }
	       
	    }
	}
	    
	public static void main(String args[]) {
	    int[] arr={1,7,4,3,9,2,6};
	    bubbleSort(arr);
	    printArray(arr);
	    }
}
