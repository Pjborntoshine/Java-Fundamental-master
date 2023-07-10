package Stacks;

import java.util.Stack;

public class MinimumBracketReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
	//int ans = countBracketReversals("{{}}{{{{");
	//int ans = countBracketReversals("{{{{}}");
	int ans = countBracketReversals("{{{");
//	int ans = countBracketReversals("}}}{{{");
//		int ans = countBracketReversals("}{");
	System.out.println(ans);
	
}
	public static int countBracketReversals(String input) {
		
		if(input.length() == 0 || input.length()%2!=0) {
			return -1;
		}
		String str = input;
		Stack<Character> st = new Stack<>();
		int ans = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == '{') {
				st.push(str.charAt(i));
			}else {
				if(st.isEmpty()) {
					st.push(str.charAt(i));
				}else if(!st.isEmpty()) {
					if(st.peek()=='{') {
						st.pop();
					}else if(st.peek()=='}') {
						st.push(str.charAt(i));
					}
				}
			}
		}
		System.out.println(st.peek() + " "+ st.size());
		char c1;
		char c2;
		while(!st.isEmpty()) {
			c1=st.pop();
			c2 = st.pop();
			if(c1==c2) {
				ans++;
			}else {
				ans+=2;
			}
		}
		return ans;
	}
/*public static int countBracketReversals(String str) {
	if(str.length()%2!=0) {
		return -1;
	}
	//Your code goes here
	Stack<Character> stc  = new Stack<Character>();
	int ans = 0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i) == '{') {
			if(!stc.isEmpty() && stc.peek() == '}') {
				stc.pop();
				//ans++;
			}else {
				stc.push(str.charAt(i));
			}
		}else if(str.charAt(i) == '}'){
				if(!stc.isEmpty() && stc.peek() =='{') {
					stc.pop();
					//ans++;
				}else {
					stc.push(str.charAt(i));
				}
			
		}
	}
	if(stc.size() == 0) {
		return ans+1;
	}
	ans = 0;
	System.out.println( stc.size());
		char c1;
		char c2;
		while(!stc.isEmpty()) {
			c1 = stc.pop();
			c2 = stc.pop();
			if(c1 == c2) {
				ans++;
			}
		}
		return ans;
	}

*/
}
