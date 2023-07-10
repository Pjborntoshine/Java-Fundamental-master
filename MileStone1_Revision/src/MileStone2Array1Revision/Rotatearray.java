package MileStone2Array1Revision;

public class Rotatearray {
	 public static void rotate(int[] arr, int d) {
		 // code 
		 int temp[] = new int[d];
		 for(int i=0;i<d;i++) {
			 temp[i]=arr[i];
			 
		 }
		 int k=0;
		 // now 
		 for(int i=0;i<arr.length;i++) {
			 if((i+d)<=arr.length-1) {
				 arr[i]=arr[i+d];
				
			 }
			 if(i>=arr.length-d) {
				arr[i]=temp[k];k++;
			 }
			
		 }
		 for(int l=0;l<arr.length;l++) {
				System.out.print(arr[l]+" ");
			}
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		rotate(arr,3);

	}

}
