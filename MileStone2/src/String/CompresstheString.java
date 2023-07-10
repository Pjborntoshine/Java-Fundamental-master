package String;

import java.util.Scanner;

public class CompresstheString {
	public static String getCompressedString(String str) {
		// Write your code here.
		String ans = "";
		int i=0;int count=1;
		
		while(i<str.length()) {
//			System.out.println(i);
			
			if(i!=str.length()-1&& str.charAt(i)==str.charAt(i+1)) {
				count++;
			}else {
				ans+=count==1?str.charAt(i):str.charAt(i)+""+count;
//				ans+=str.charAt(i)+""+count;
				count=1;
			}
			i++;
		}
//		System.out.println("asd==> "+ans);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = "aaabbccdsa";
		getCompressedString(str);
	}

}
