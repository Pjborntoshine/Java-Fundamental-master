package TestRev1;

import java.util.Scanner;

public class DoesContinSt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String large = s.nextLine();
		String small = s.nextLine();
		System.out.println(checkSequence(large, small));
	}

	private static boolean checkSequence(String s, String t) {
		// TODO Auto-generated method stub
		if(t.length()==0) {
			return 	true;
		}
		if(s.length() == 0) {
			return false;
		}
		if(s.charAt(0) == t.charAt(0)) {
			boolean smallOp =  checkSequence(s.substring(1), t.substring(1));
			return smallOp;
		}
		else {
			boolean smallOp = checkSequence(s.substring(1), t);
			return smallOp;
		}
	}

}
