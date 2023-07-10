package MileStone2Array1Revision;

public class BubbleSortRevInterMediata {
	public static void bubbleSort(int[] arr) {
		// here we are dealing with consecutive elemets
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					// swap the consecutive
					int temp = arr[i];
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
		int arr[]={1,7,14,0,9,4,18,18,2,4,5 };
		 bubbleSort(arr);
	}

}
