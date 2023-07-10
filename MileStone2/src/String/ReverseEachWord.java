package String;

import java.util.Scanner;

public class ReverseEachWord {
	public static String reverseEachWord(String str) {
		//Your code goes here
		if(str.isEmpty()) {
			return "";
		}
		String ans="";
		int i=0;
		int start;
		int end=0;
		while(i<str.length()) {
			if(str.charAt(i)==' ' || i==str.length()-1) {
				start= i==str.length()-1?i:i-1;
				System.out.println(start+" "+end);
				for(int j=start;j>=end;j--) {
//					System.out.println(str.charAt(j));
					ans+=str.charAt(j);
				}
				ans+=" ";
				end=i+1;
			}
			i++;
		}
		//System.out.println(ans);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		reverseEachWord(str);
	}

}
