package Array2;

public class SelectionSort {
	public static void selectionSort(int[] arr) {
		int round=0;
		for(int i=0;round<arr.length;i++) {
			int minElement = i;
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minElement]>arr[j]) {
					
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;;
					
				}
			}
			round++;
		}
		for(int l=0;l<arr.length;l++) {
			System.out.print(arr[l]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]={1,3,0,4,2,7,6};
		int arr[]={2, 13, 4, 1, 3, 6, 28};
	 selectionSort(arr);
	}

}
