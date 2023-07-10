package MileStone2Array1Revision;

public class selectionSort1day {
	public static void selectionSort(int[] arr) {
		int round=0;
		int i=1;
		int swapind=0;
		while(round<arr.length) {
			int minim = arr[round];
			// finding minimun
			int j=round;
			while((j+1)!=arr.length && j<arr.length) {
				if(arr[j]<minim) {
					minim = arr[j];
					int temp=arr[round];
					arr[round] = arr[j];
					arr[j]=temp;
				}j++;
			}
			
			round++;
		}
		for(int l=0;l<arr.length;l++) {
			System.out.print(arr[l]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,7,4,0,9,4 };
//		int arr[]={1,7,14,0,9,4,18,18,2,4,5 };
		selectionSort(arr);
	}

}
