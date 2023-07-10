package D2Array;

import java.util.Scanner;

public class takeInpColWiseNPrintColWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of row");
		int rows =s.nextInt();
		System.out.println("Enter the number of columns");
		int cols = s.nextInt();
		int[][] arr = new int[rows][cols];
		// taking input 
		for(int i=0;i<cols;i++) {
			for(int j=0;j<rows;j++) {
				System.out.println("Enter the element @"+ i +" col "+j+" row " );
				arr[i][j]=s.nextInt();
			}
		}
		
		for(int i=0;i<cols;i++) {
			for(int j=0;j<rows;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
