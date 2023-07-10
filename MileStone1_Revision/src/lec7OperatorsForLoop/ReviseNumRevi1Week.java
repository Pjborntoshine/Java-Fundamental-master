package lec7OperatorsForLoop;

import java.util.Scanner;

public class ReviseNumRevi1Week {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String num = "";
		while(n>0) {
			int rem = n%10;
			num+=rem;
			n/=10;
		}
		System.out.println(num);
		// removing 0
		int count=0;
		if(num.charAt(0)=='0') {
			for(int i=0;i<num.length();i++) {
				if(num.charAt(0)==num.charAt(i)) {
					count++;
				}else {
					break;
				}
			}
		}
		num = num.substring(count, num.length());
		System.out.println(num);
	}
}
