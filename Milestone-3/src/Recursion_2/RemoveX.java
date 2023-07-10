package Recursion_2;

public class RemoveX {
	public static String removeXprob(String input){
//		System.out.println("dasdas");
		// Write your code here
		if(input.length() ==0) {
			return input;
		}
		String smallOp = removeXprob(input.substring(1));
		System.out.println(input +"smallOp"+smallOp);
		if(input.charAt(0) == 'x') {
			return ""+smallOp;
		}else {
			return input.charAt(0)+smallOp;
		}
		
	}
// ans
//	public static String removeXprob(String input){
////		System.out.println("dasdas");
//		// Write your code here
//		if(input.length() ==0) {
//			return input;
//		}
//		System.out.println(input);
//		String smallOp = removeXprob(input.substring(1));
//		if(input.charAt(0) == 'x') {
//			// if number exist
//			return ""+ smallOp;
//		}else {
//			return input.charAt(0)+ smallOp;
//		}
//	
//	}
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeXprob("xaxb"));
	}

}
