package Recursion21Day;

public class replaceCharacterRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(replaceWith("asdasdassadas",'x','y',0));
		System.out.println(replacestr("abacd",'a','x'));


	}

	private static String replacestr(String str, char c, char d) {
		// TODO Auto-generated method stub
		if(str.length()==0) {
			return str;
		}
		if(str.charAt(0) == c){
			String smallOp = replacestr(str.substring(1),c,d);
			return d +smallOp;
			
		}else {
			String smallOp = replacestr(str.substring(1),c,d);
			return str.charAt(0)+ smallOp;
		}
//		return null;
	}

}
