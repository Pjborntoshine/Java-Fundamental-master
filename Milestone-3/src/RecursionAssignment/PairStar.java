package RecursionAssignment;

import java.util.Scanner;

public class PairStar {
	public static String addStars(String s) {
		// Write your code here
		if(s.length() ==1) {
			return s;
		}
		System.out.println(s);
		if(s.charAt(0) == s.charAt(1)) {
			// calling rec
			String smallOp = s.charAt(0)+"*"+addStars(s.substring(1));
//			System.out.println(s);
			//String retval = s.charAt(0)+"*"+s.charAt(1)+s.substring(2);
			//System.out.println(retval);
			return smallOp;
		}else {
			String smallOp =s.charAt(0)+ addStars(s.substring(1));
			
			return smallOp;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(addStars(input));
	}

}
