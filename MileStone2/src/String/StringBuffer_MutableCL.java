package String;

import java.util.Scanner;

public class StringBuffer_MutableCL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s= new Scanner(System.in);
		StringBuffer str=new StringBuffer("abc"); // thi is mutable i.e we can change the value of the string value here
		// here we have setCharAt to change the valueof the string
		// here we have not created the new String within the same string we have make changes
		str.setCharAt(0, 'd');
		System.out.println(str);
		// here we can append the funcyion
		str.append("asdasda");
		System.out.println(str+" "+str.length());
		
		/*******
		 * vvi concept
		 */
		String s = "d";
		for(int i=0;i<5;i++) {
			s+='z'; // here we are creating new string every time but in string buffer we are not creating new string we are making change in the existingn string
		}
		System.out.println(s);
	}

}
