package MileStone2Array1Revision;

public class PushZerostoend1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]= {2,0,0,1,3,0,0};
		int arr[]= {9,0,0,8,2};
		int i=0;// for looping
		int j=0;//for tracking 0
		while(i<arr.length) {
			// need to stop k if we find
			if(arr[j]==0) {
				if(arr[i]!=0) {
					//swap
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					j++;
				}
			}else {
				j++;
			}
			
			i++;
		}
	for(int l=0;l<arr.length;l++){
		System.out.print(arr[l]+" ");
	}
	}

}
