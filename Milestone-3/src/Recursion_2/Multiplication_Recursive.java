package Recursion_2;

import java.util.Scanner;

public class Multiplication_Recursive {
	public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
		if(m==1) {
			return n;
		}
		int smallOP =  multiplyTwoIntegers(m-1,n);
		//System.out.println(smallOP+n);
		return smallOP+n;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		System.out.println(multiplyTwoIntegers(m, n));
	}

}
