package Recursion_2;

import java.util.Scanner;

public class CheckPalindrome_recursive {
	public static boolean isStringPalindrome(String input) {
		// Write your code here
		if(input.length()==1) {
			return true;
		}
		  if(input.length()==2) {
				if(input.charAt(0)== input.charAt(1)) {	
				System.out.println(input +" "+input.charAt(0) +" "+input.charAt(1));
					return true;
			}	
			}
		if(input.charAt(0)!= input.charAt(input.length()-1)) {	
			//System.out.println(input +" "+input.charAt(0) +" "+input.charAt(input.length()-1));
				return false;
		}
		boolean smallAns =  isStringPalindrome(input.substring(1,input.length()-1));
		return smallAns;
	}
	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			String input = s.nextLine();
			System.out.println(isStringPalindrome(input));
		}
	}


