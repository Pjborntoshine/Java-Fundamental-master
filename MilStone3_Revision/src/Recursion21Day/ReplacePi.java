package Recursion21Day;

public class ReplacePi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.out.println(replacepi("dpipppi"));
	}

	private static String replacepi(String str) {
		// TODO Auto-generated method stub
		if(str.length()==0) {
			return str;
		}
		if(str.charAt(0) =='p' && str.charAt(1) == 'i') {
			String smallop = replacepi(str.substring(2));
			return "3.14" +smallop;
		}else {
			String smallOP =  replacepi(str.substring(1));
			return str.charAt(0) + smallOP;
		}
	
	}

}
