package RecursionAssignment;

import java.util.Scanner;

public class StringtoInteger {
//	public static int convertStringToInt(String input){
//		// Write your code here
//		System.out.println("inp" + input);
//		if(input.length()==1) {
//			int charVal  = input.charAt(0)-'0';
//			return charVal;
//			
//		}
//		int smallop = convertStringToInt(input.substring(1));
//		String smallstr = ""+smallop;
//		int multip =(int) Math.pow(10, smallstr.length());
//		System.out.println("multi" + multip);
//		System.out.println(Integer.parseInt(input.substring(0,1))*multip+" "+smallop);
//		int ans = Integer.parseInt(input.substring(0,1))*multip+smallop;
////		System.out.println("input" +Integer.parseInt(input)*10 + smallop);
//		
//		return ans;
//	}
	
	public static int convertStringToInt(String input){
		// Write your code here
		//1099System.out.println("inp" + input);
		if(input.length()==1) {
			int charVal  = input.charAt(0)-'0';
			return charVal;
			
		}
		int smallop = convertStringToInt(input.substring(1));
		int x = input.charAt(0) - '0';
//		System.out.println(input.length() + "==> " + smallop);
		int pow = (int) (Math.pow(10, input.length()-1));
		int ams = x*pow + smallop;
	//	System.out.println("ams"+ pow+" "+ ams);
		return ams;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(convertStringToInt(input));
	}

}
