package Array1;

import java.util.Scanner;

public class Sort01 {
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
		int count=0;
		for(int i =0,j=arr.length-1;i<arr.length && j!=i;) {
			
			if(arr[i]==1) {
				if(arr[j]==0) {
					int temp=arr[j];
					
					arr[j]=arr[i];
					arr[i]=temp;
					
					i++;
					
				}else {
					j--;
				}
			}else if(arr[i]==0) {
				i++;
			}

					
		}
		for(int k=0;k<arr.length;k++) {
		System.out.print(arr[k]);
	}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr1 = takeInput();
		 Scanner s = new Scanner(System.in);
	
//		 System.out.print(sort01(arr1));
		 sort01(arr1);
	}
}
