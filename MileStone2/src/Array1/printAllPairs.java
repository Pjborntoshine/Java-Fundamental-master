package Array1;

import java.util.Scanner;

public class printAllPairs {
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
	public static void printAllPirs(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j =i+1;j<arr.length;j++) {
				System.out.println("("+arr[i]+","+arr[j]+")");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] arr = takeInput();
	printAllPirs(arr);
	
	}

}
