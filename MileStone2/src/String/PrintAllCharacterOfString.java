package String;

import java.util.Scanner;

public class PrintAllCharacterOfString {
	public static void printChars(String s) {
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		printChars(str);
		
	}

}
