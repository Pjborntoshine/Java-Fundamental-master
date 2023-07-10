package MileStone2Array1Revision;

public class insertionSort {
	public static void bubbleSort(int arr[]) {
		int i=0;
		while(i<arr.length-1) {
		if(arr[i]>arr[i+1]) {
		// swap beween i and i+1;
			int temp=arr[i+1];
			arr[i+1]=arr[i];
			arr[i]=temp;
			int j=i;
			System.out.println(j);
			while(j>0 && arr[j]<arr[j-1]) {
				
					//swap
					int t2 = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=t2;
				j--;
			}
		}else {
			i++;
		}
	
		}
		for(int l=0;l<arr.length;l++) {
			System.out.print(arr[l]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]={2, 13, 4, 1, 3, 6, 28};
		int arr[]={9,7,6,8,4,5,2,3,1};
		bubbleSort(arr);
	}

}
