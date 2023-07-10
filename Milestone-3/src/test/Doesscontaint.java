package test;

import java.util.Scanner;

public class Doesscontaint {
	public static boolean checkSequence(String a, String b) {
			if(b.length() == 0) {
				return true;
			}

			if(a.length() == 0) {
				return false;
			}
			if(a.charAt(0) == b.charAt(0)) {
				return checkSequence(a.substring(1),b.substring(1));
			}else {
				return 	checkSequence(a.substring(1),b);
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		String large = s.nextLine();
		String small = s.nextLine();

		System.out.println(checkSequence(large, small));
	}

}
