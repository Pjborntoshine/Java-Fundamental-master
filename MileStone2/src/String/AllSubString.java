package String;

import java.util.Scanner;

public class AllSubString {
//public static void AllSubString(String str) {
//	int startInd = 0;
//	int endIndex = 1;
//	while(startInd<=str.length()) {
//		int newendIndex = endIndex;
//		while(newendIndex<=str.length()) {
//			System.out.print(str.substring(startInd, newendIndex)+" ");newendIndex++;
//		}
//		System.out.println();
//		endIndex++;
//	
//		startInd++;}
//}
	public static void AllSubString(String str) {
		int strind = 0;
		int endInd = 1;
		int loop = 0;
		//System.out.println(str.substring(0,1));
		while(loop<str.length())
		{
			int newStart = strind;
			int newEnd = endInd;
			while(newEnd<=str.length())
			{
				System.out.println(str.substring(newStart, newEnd));newEnd++;newStart++;
			}
//			System.out.println();
			endInd++;loop++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String str = s.next();
		AllSubString(str);
		
	}

}
