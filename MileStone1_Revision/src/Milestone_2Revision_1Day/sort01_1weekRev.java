package Milestone_2Revision_1Day;

public class sort01_1weekRev {
	public static void sort012(int[] arr){
		int i=0;
		int nz=0;
		int nt=arr.length-1;
		while(i<=nt) {
			if(arr[i]==0 && i!=0) {
				// swap 
				int temp = arr[i];
				arr[i]=arr[nz];
				arr[nz]=temp;
				nz++;
			}else if(arr[i]==2) {
				int temp = arr[i];
				arr[i]=arr[nt];
				arr[nt]=temp;
				nt--;
			}else {
				i++;
			}
		}
		for(int m=0;m<arr.length;m++) {
			System.out.print(arr[m]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,2,0,2,0,1};
//		int[] arr = {2,2,0,1,1};
//		int[] arr = {0,1,2,0,1,2,0};
//		int[] arr = {1,0,2,1,0,1,2,0};
		sort012(arr);
	}

}
