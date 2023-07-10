package String;

import java.util.Scanner;

public class TakingInputString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
//		str = s.next(); //next() deals with toke  this will return till we encounter delimeter like space, enter,tab
//		System.out.println(str.length());
//		str = s.nextLine(); //deals with entire line this will give all the line
//		System.out.println(str.length());
		
//		str = s.next();
//		System.out.println(str+" "+str.length());
////		String str2 = s.next();
//		int i=s.nextInt();
//		String str2 = s.nextLine();
//		
//		System.out.println(str2+" "+str2.length());
		
		String str1=s.next();
		String str2=s.nextLine();
		String str3=str2+str1;
		System.out.println(str3);
		
	}

}
