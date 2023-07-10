package MileStone2Array1Revision;

public class selectionSort1dayRev {
//	public static void selectionSort(int[] arr) {
//		int i=0;
//		while(i<arr.length) {
//			int miniInd = i;
//			int j=i+1;
//			while(j<arr.length) {
//				if(arr[j]<arr[miniInd]) {
//					// swap
//					int temp = arr[j];
//					arr[j]=arr[miniInd];
//					arr[miniInd]=temp;
//				}j++;
//			}
//			
//			i++;
//		}
//		for(int l=0;l<arr.length;l++) {
//			System.out.print(arr[l]+" ");
//		}
//	}

	public static void selectionSort(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int j=i+1;
			int minInd=i;
			while(j<arr.length-1) {
				if(arr[j]<arr[i]) {
					// swap
					int temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					
				}j++;
			}
		i++;
		}
		for(int l=0;l<arr.length;l++) {
			System.out.print(arr[l]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,3,0,4,2,7,6};
//		int arr[]={2, 13, 4, 1, 3, 6, 28};
	 selectionSort(arr);
	}
}
