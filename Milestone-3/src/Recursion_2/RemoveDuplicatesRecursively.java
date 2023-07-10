package Recursion_2;

public class RemoveDuplicatesRecursively {
	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
		if(s.length() <= 1) {
			return s;
		}
		// hypothesis
		
		
		if(s.charAt(0) == s.charAt(1)) {
			String smallOp = removeConsecutiveDuplicates(s.substring(1));
//			System.out.println(smallOp);
			return smallOp;
		}else {
			String smallOp = removeConsecutiveDuplicates(s.substring(1));
			return s.charAt(0) + smallOp;
		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeConsecutiveDuplicates("xxxyyyzwwzzz"));
	}

}
