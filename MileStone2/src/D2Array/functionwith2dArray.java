package D2Array;

import java.util.Scanner;

public class functionwith2dArray {
	public static void print2dArray(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] takeInput(){
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of row");
		int rows =s.nextInt();
		System.out.println("Enter the number of columns");
		int cols = s.nextInt();
		int[][] arr = new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println("Enter the element @"+ i +" row "+j+" col " );
				arr[i][j] = s.nextInt();
			}
		}
		
		return arr;
	}
	

	public static void main(String[] args) {
	int[][] input = takeInput();
	print2dArray(input);
	}

}
