package MileStone2Array1Revision;

public class bubbleSort {
	/*
public static void bubbleSort(int arr[]) {
	int round=0;
	int i=0;
	while(round<arr.length) {
		int j=0;
		while(j<arr.length-1) {
			if(arr[j]>arr[j+1]) {
				int temp = arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=temp;
			}
			j++;
		}
		round++;
		i++;
	}
	for(int l=0;l<arr.length;l++) {
		System.out.print(arr[l]+" ");
	}
}*/
	public static void bubbleSort(int arr[]) {
		int round = 0;
		while(round<arr.length) {
			int j=0;
			while(j<arr.length-1) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
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
		int arr[]={2, 13, 4, 1, 3, 6, 28};
		 bubbleSort(arr);
	}

}
