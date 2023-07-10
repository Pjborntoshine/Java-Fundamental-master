package Array2;

public class isertSortSol {
	   public static void insertionSort(int[] arr) {
		   int n=arr.length;
		    for(int i=1;i<n;i++){
		        //Insert ith element in sorted position
		        int j=i-1;
		        int temp=arr[i];
		        while(j>=0 && arr[j]>temp){
		            arr[j+1]=arr[j];
		            j--;
		        }
		        //Position will be j+1;
		        arr[j+1]=temp;
		        
		       
		    }
		    for(int l=0;l<arr.length;l++) {
				System.out.print(arr[l]+" ");
			}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={9,7,6,8,4,2,3 };
		//int arr[]={1,7,4,0,9,4 };
		//int arr[]={1,7,14,0,9,4,18,18,2,4,5 };
		insertionSort(arr);
	}

}
