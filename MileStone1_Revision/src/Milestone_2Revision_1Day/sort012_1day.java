package Milestone_2Revision_1Day;

import java.util.Scanner;

public class sort012_1day {
	public static void sort012(int[] arr){
		int i=0;
		int nz=0;
		int nt=arr.length-1;
		while(i<=nt) {
			for(int m=0;m<arr.length;m++) {
				System.out.print(arr[m]+" ");
			}
			
		  System.out.println("nz"+nz+" "+i +" "+arr[i]);
			if(arr[i]==0 && i!=0) {
				int temp = arr[i];
				arr[i]=arr[nz];
				arr[nz] = temp;nz++;
			}else if(arr[i]==2){
				// swap 2 
				int temp = arr[nt];
				arr[nt] = arr[i];
				arr[i]=temp;nt--;
				
			}else {
				i++;
			}
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] arr = {0,1,2,0,2,0,1};
//		int[] arr = {2,2,0,1,1};
//		int[] arr = {0,1,2,0,1,2,0};
//		int[] arr = {1,0,2,1,0,1,2,0};
		sort012(arr);

	}

}
