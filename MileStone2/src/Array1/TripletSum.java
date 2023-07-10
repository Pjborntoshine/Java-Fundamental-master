package Array1;

import java.util.Scanner;

public class TripletSum {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
		
			System.out.println("enter @ "+i);
				arr[i]=s.nextInt();
				}
		return arr;
		
	}
	public static int tripletSum(int arr[], int x) {
		int count =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==x) {
						count++;
					}
				}
			}
		}
	return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr1 = takeInput();
		 Scanner s = new Scanner(System.in);
		 int x = s.nextInt();
		 System.out.print(tripletSum(arr1,x));	
	}

}
