package Lec8FunctionAndScope;

import java.util.Scanner;

public class DivideNumber {

	public static int divideNumber(int a,int b) {
		if(b==0) {
			return 1;
		}
		return a/b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println(divideNumber(4,2));
	}

}
