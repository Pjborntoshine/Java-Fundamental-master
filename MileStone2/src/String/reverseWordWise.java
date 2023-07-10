package String;

import java.util.Scanner;

public class reverseWordWise {
	public static void reverseEachWord(String input) {
//		String str[]= input.split(" ");
//		String op = "";
//		for(int i=0;i<str.length;i++) {
//			System.out.println(str[i]);
//			StringBuffer sb = new StringBuffer();
//			sb.append(str[i]);
//			sb.reverse();
//			op+=sb+" ";
//		}
//		System.out.println(op);
	int start=0;
	
	for(int i=0;i<input.length();i++) {
		if(input.charAt(i)==' ' ||i==input.length()-1) {
			//
			int end = i-1;
			end = i==input.length()-1?i:i-1;
			for(int j=end;j>=start;j--) {
				System.out.print(input.charAt(j));
			}
			System.out.println();
			start=i==input.length()-1?i-1:i+1;
//			start = i+1;
		}
	}
	}
	
	/* solution provided by maam
	 
      public static String reverseEachWord(String str){
          String ans="";
          int currentWordStart=0;
          int i=0;
          for(;i<str.length();i++){
              if(str.charAt(i)==' '){
                  //Reverse Current Word
                  int currentWordEnd=i-1;
                  String reversedWord="";
                  for(int j=currentWordStart;j<=currentWordEnd;j++){
                      reversedWord=str.charAt(j)+reversedWord;
                  }
                  //Add it final String(ans)
                  ans+=reversedWord+" ";
                  currentWordStart=i+1;
              }
          }
          int currentWordEnd=i-1;
          String reversedWord="";
          for(int j=currentWordStart;j<=currentWordEnd;j++){
              reversedWord=str.charAt(j)+reversedWord;
          }
          ans+=reversedWord;
          return ans;
      }
	 
	  
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String inp = s.nextLine();
		
		reverseEachWord(inp);
		
	}

}
