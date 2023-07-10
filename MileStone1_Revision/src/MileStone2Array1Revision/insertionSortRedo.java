package MileStone2Array1Revision;

public class insertionSortRedo {
	 public static void insertionSort(int[] arr) {
		 int i=0;
		 while(i<arr.length-1)
		 {
			 if(arr[i]>arr[i+1]) {
				 // swap
				 int temp = arr[i];
				 arr[i]=arr[i+1];
				 arr[i+1]=temp;
				 int j=i;
				 while(j>0 && arr[j]<arr[j-1]) {
					 // swap
					 int t2 = arr[j];
					 arr[j]=arr[j-1];
					 arr[j-1]=t2;
					 j--;
				 }
						 
			 }
				 i++;
			 
			 
		 }
		 for(int l=0;l<arr.length;l++) {
				System.out.print(arr[l]+" ");
			}
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]={9,7,6,8,4,5,2,3,1};
		//int arr[]={1,7,4,0,9,4 };
		int arr[]={1,7,14,0,9,4,18,18,2,4,5 };
		insertionSort(arr);
	}

}
