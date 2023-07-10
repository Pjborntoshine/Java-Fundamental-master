package Array1;

import java.util.Scanner;

public class primitiveAndNonPrimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s = new Scanner(System.in);
		int[] arr = {1,2,3,4,5};
		incrementArr(arr);
		printArr(arr);
		System.out.println("arr"+arr);
		// here arr will contain 2 thing 1ref 2.length of aa=rray
	}
	public static void printArr(int[] input) {
		for(int i=0;i<input.length;i++) {
			System.out.println(input[i]);
		}
	}
	public static void incrementArr(int[] input) {
		System.out.println("input"+input);
//		input = new int[7];// will create new arr reference
		for(int i=0;i<input.length;i++) {
			input[i]=input[i]+1;
		}
	}

}
