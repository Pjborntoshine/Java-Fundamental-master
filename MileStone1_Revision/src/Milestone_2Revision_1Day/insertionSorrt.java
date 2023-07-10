package Milestone_2Revision_1Day;

public class insertionSorrt {
	 public static void insertionSort(int[] arr) {
		 int i=0;
		 while(i<arr.length && (i+1)!=arr.length-1) {
			 int j = i+1;
			 int elem =arr[j];
			 if(elem < arr[i]) {
				 int temp = arr[j];
				 arr[j] = arr[j-1];
				 arr[j-1]=temp;
				 // 
				 while(i-1>=0) {
					 if(arr[i-1]>arr[i]) {

						 int t2 = arr[i-1];
						 arr[i-1]=arr[i];
						 arr[i]=arr[temp];
							i--;	 
					 }
					 else{
						 break;
					 }
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
//		int arr[]={9,7,6,8,4,2,3,1 };
//		int arr[]={9,7,6,8,4,5,2,3,1};
		int arr[]={1,7,4,0,9,4 };
//		int arr[]={1,7,14,0,9,4,18,18,2,4,5 };
		insertionSort(arr);
	}

}
