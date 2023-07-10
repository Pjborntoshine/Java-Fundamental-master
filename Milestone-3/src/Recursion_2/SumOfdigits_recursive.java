package Recursion_2;

import java.util.Scanner;

public class SumOfdigits_recursive {
	public static int sumOfDigits(int input){
		// Write your code here
		String ip = ""+input;
		if(ip.length()==1) {
			return input;
		}
		int smallop = sumOfDigits(input/10);
		//System.out.println(smallop +" "+input%10);
		int ans =  smallop + input%10;
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(sumOfDigits(n));
	}

}
