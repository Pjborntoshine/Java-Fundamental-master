package String;

import java.util.Scanner;

public class checkPallindrome {
	public static void checkPallindrome(String str) {
	int lastind = str.length()-1;boolean a = true;
//	if
	for(int i=0;i<(str.length())/2;i++)
	{
		if(str.charAt(i)==str.charAt(lastind)) {
			lastind--;
		}else {
			a=false;
			break;
		}
	}
	if(a) {
		System.out.println("true");
	}
	if(!a) {
		System.out.println(false);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		checkPallindrome(str);
	}

}
