package String;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
		String ans = "";
		for(int i=0;i<str.length();i++) {
			if(i<str.length()-1 && str.charAt(i)!=str.charAt(i+1)) {
				ans+=str.charAt(i);
			}
		}
		System.out.println(ans +str.charAt(str.length()-1) );
		String ans2 = ans +str.charAt(str.length()-1);
		System.out.println(ans2.length());
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		System.out.println(removeConsecutiveDuplicates(str1));
	}

}
