package String;

import java.util.Scanner;

public class ReverseString {
public static String reverseNumber(String str) {
	String reverseString="";
//	for(int i=str.length()-1;i>=aa0;i--) {
//		reverseString+=str.charAt(i);
//	}
//	// othr approach
	int lastInd = str.length()-1;
	for(int i=0;i<str.length();i++) {
		reverseString = str.charAt(i) + reverseString;
	}
	
	return reverseString;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(reverseNumber(str));
	}

}
