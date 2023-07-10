package Recursion21Day;

public class RecWirhStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeX("xaxb"));
//		System.out.println(replacestr("xyxyxyxyasdasdas",'a','b'));
	}
	public static String removeX(String input){
		if(input.length()==0) {
			return input;
		}
		String smallOp = removeX(input.substring(1));
		if(input.charAt(0)=='x') {
			return ""+smallOp;
		}else {
			return input.charAt(0) + smallOp;
		}
		
	}
	
//	public static String removeX(String input){
//		if(input.length() == 0) {
//			return input;
//		}
//		String smalOp =  removeX(input.substring(1));
//		System.out.println(smalOp + " "+ input);
//			if(input.charAt(0)=='x') {
//				return ""+smalOp;
//			}else {
//				return input.charAt(0) + smalOp;
//			}
////		return smalOp;
//	}

//	private static String replacestr(String str, char a, char b) {
//		// TODO Auto-generated method stub
//		if(str.length()==1) {
//			return str;
//		}
//		String smallStr = replacestr(str.substring(1), a, b);
//		System.out.println(smallStr + "   " + str);
//		if(str.charAt(0)== a) {
//			return b + smallStr;
//		}else {
//			return a+smallStr;
//		}
////		return smallStr;
//	}

}
