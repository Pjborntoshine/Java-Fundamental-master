package String;

import java.util.Scanner;

public class ReverseStringWordwise {
	public static String reverseWordWise(String input) {
		String ans ="";
		int start = input.length();
		int end=0;
		int i=input.length()-1;
		for(;i>=0;i--) {
			
				if(input.charAt(i)==' ') {
					 end = i+1;
					//System.out.println(input.substring(end,start));
					ans+=input.substring(end,start)+" ";
					 start = i;
				}
				if(i==0) {
					end = 0;
//					System.out.println(input.substring(end,start-1));
					ans+=input.substring(end,start);
				}
				
		}
//		System.out.println(ans);
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
	System.out.println(reverseWordWise(str));
	}

}
