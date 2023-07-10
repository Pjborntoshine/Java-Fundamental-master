package String;

import java.util.Scanner;

public class RemovCharacter {

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
		String ans="";
		for(int i=0;i<str.length();i++) {
//				System.out.println(str.charAt(i));
				if(str.charAt(i)!=ch) {
					ans+=str.charAt(i);
				}
		}
//		System.out.println(ans);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char ch = s.next().charAt(0);
		removeAllOccurrencesOfChar(str,ch);
		
	}

}
