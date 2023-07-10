package Recursion_2;

import java.util.Scanner;

public class CountZeros {
	public static int countZerosRec(int input){
		// Write your code here
		  String ip = ""+input;
			if(ip.length()==1) {
	            if(input==0){
	                return 1;
	            }
				return 0;
			}
			int smallOp = countZerosRec(input/10);
			//System.out.println(smallOp);
			//System.out.println(input%10);
			if(input%10==0) {
				smallOp++;
			}
			return smallOp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(countZerosRec(n));
	}

}
