package Recursion21Day;

public class RemoveDuplicatesRecursively_1day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeConsecutiveDuplicates("xxxyyyzwwzzz"));
	}

	private static String removeConsecutiveDuplicates(String str) {
		// TODO Auto-generated method stub
		if(str.length()==1) {
			return str;
		}
		if(str.charAt(0) == str.charAt(1)) {
			String smallOp =  removeConsecutiveDuplicates(str.substring(1));
			return  smallOp;
		
		}else {
			String smallOp =  removeConsecutiveDuplicates(str.substring(1));
			return str.charAt(0) + smallOp;
		
		}
		
		
	}

}
