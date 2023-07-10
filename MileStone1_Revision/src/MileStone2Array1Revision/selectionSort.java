package MileStone2Array1Revision;

public class selectionSort {
	public static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				int minElem = arr[i];
				if(minElem>arr[j]) {
					// need to swap
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int l=0;l<arr.length;l++) {
			System.out.print(arr[l]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]={1,7,4,0,9,4 };
		int arr[]={1,7,14,0,9,4,18,18,2,4,5 };
		selectionSort(arr);
	}

}
