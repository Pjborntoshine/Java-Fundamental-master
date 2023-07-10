package Array1;

import java.util.Scanner;

public class MovigIntoFunction {
	
	public static void printArr(int arr[]) {
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
	}
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= takeInput();
		printArr(arr);
		
	}

}
