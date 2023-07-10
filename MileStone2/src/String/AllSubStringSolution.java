package String;

import java.util.Scanner;

public class AllSubStringSolution {
	// implementing using single swap
	public static void AllSubString(String str) {
//		for(int start=0;start<str.length();start++) {
//			for(int end = start;end<str.length();end++) {
//				System.out.println(str.substring(start, end));
//			}
//		}
		
	      for(int len=1;len<=str.length();len++){
	          //We have to print all strings wih length as "len"
	          for(int start=0;start<=str.length()-len;start++){
	              int end=start+len-1;
	              System.out.println(str.substring(start,end+1));
	          }
	      }
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		AllSubString(str);
	}

}
