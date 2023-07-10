package Array2;

public class BubbleSort {
	public static void bubbleSort(int[] arr){
    	//Your code goes here
		int comp = arr.length-1;
		for(int i=0;i<arr.length-1;i++) {
			// round
			int internalround=0;
			for(int j=0;j<comp;j++) {
				//for(int j=0;j<arr.length-1;j++) {

				if(arr[j]>arr[j+1]) {
					//swap
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}

			}
			System.out.println("comp"+comp);
			comp--;
			//System.out.println("round"+i +" ");
//			for(int l=0;l<arr.length;l++) {
//				System.out.print(arr[l]+" ");
//			}System.out.println();
		}
		for(int l=0;l<arr.length;l++) {
			System.out.print(arr[l]+" ");
		}
    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={4,3,6,8,1,5,7};
		bubbleSort(arr);
	}

}
