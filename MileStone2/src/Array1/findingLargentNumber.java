package Array1;

import java.util.Scanner;

public class findingLargentNumber {
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
	public static int largest(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[] = takeInput();
	int larg=largest(arr);
	System.out.println(larg);
	}

}
