package MileStone2Array1Revision;

import java.util.Scanner;

public class Sort01_oneDayRev {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
		
			//System.out.println("enter @ "+i);
				arr[i]=s.nextInt();
				}
		return arr;
		
	}
	public static void sort01(int arr[]) {
		int i=0;
		int j=arr.length-1;
		while(i<arr.length && j!=i) {
			if(arr[i]==1) {
				if(arr[j]==0) {
					// swap
					int temp = arr[i];
					arr[i]=arr[j];arr[j]=temp;
					i++;
					
				}else {
					j--;
				}
			}else {
				i++;
			}
			
		}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]);
		}
	}
	public static void main(String[] args) {
				 int[] arr1 = {0,1,0,1,0};
			//				 System.out.print(sort01(arr1));
				 sort01(arr1);

	}

}
