package Array1;

import java.util.Scanner;

public class PairSum {
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
	public static int pairSum(int arr[], int x) {
    	//Your code goes here
		int count =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==x) {
					int small =arr[i]<arr[j]?arr[i]:arr[j];
					int large = arr[i]>arr[j]?arr[i]:arr[j];
					//System.out.println(small+"-"+large);
					count++;
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
	 System.out.print(pairSum(arr1,x));
	}
}
