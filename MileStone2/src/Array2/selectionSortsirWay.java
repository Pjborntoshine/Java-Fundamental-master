package Array2;

public class selectionSortsirWay {
	public static void selectionSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int minVal = Integer.MAX_VALUE;
			int minIndex = -1;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<minVal) {
					minVal = arr[j];
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		
		}
		for(int l=0;l<arr.length;l++) {
			System.out.print(arr[l]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2, 13, 4, 1, 3, 6, 28};
		 selectionSort(arr);
	}

}
