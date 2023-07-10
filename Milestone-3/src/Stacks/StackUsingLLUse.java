package Stacks;

import java.util.Stack;

public class StackUsingLLUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StackUsingLL<Integer> st = new StackUsingLL<>();
//		String testArr = ")()()(";
//		System.out.println(isBalanced(testArr));
//		System.out.println(st.isEmpty());
//		st.push(1);
//		st.push(2);
//		st.push(3);
//		st.push(4);
//		st.print();
////		st.pop();
//		st.print();
////		System.out.println(st.size());
////		System.out.println(" top" + st.top());
//		System.out.println(st.isEmpty());

//	String testArr = "[{(a+b)} + (e+f)]";
//	String testArr = ")()()(";
//	System.out.println(isBalanced(testArr));
//	try {
//		System.out.println(isBalanced2(testArr));
//	} catch (StackEmptyexception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//		Stack<Integer> st = new Stack<>();
//		int arr[] = {1,2};
//		for(int i=0;i<arr.length;i++) {
//			st.push(arr[i]);
//		}
//		System.out.println(st.peek() + " ===");
//		Stack<Integer> ext = new Stack<>();
//		reverseStack(st,ext);
		//String exp = "(c)";
		//System.out.println(checkRedundantBrackets(exp));
//		int arr[]= {100, 80, 60, 70, 60, 75, 85};
		int arr[]= {60 ,70, 80, 100, 90, 75, 80, 120};
		int[] ans = stockSpan(arr);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i] + " ");
		}
	}
	public static int[] stockSpan(int[] price) {
		//Your code goes here
		int[] ans = new int[price.length];
		ans[0] = 1;
		Stack<Integer> st = new Stack<>();
		st.push(0);
		for(int i=1;i<price.length;i++) {
			
			if(price[st.peek()]>price[i]) {
				
				ans[i] = i-st.peek();
				
				st.push(i);
			}else {
					while(!st.isEmpty()) {
					if(price[st.peek()]<price[i]) {
						st.pop();
						if(st.isEmpty()) {
							ans[i] = i+1;
							st.push(i);break;
						}
					}else {
						ans[i] = i-st.peek();
						st.push(i);
						break;
					}
				}
			}
			
		}
		return ans;
	}
	public static boolean checkRedundantBrackets(String expression) {
		//Your code goes here
		Stack<Character> st = new Stack<Character>();
		String str = expression;
		int j=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) !=')') {
				st.push(str.charAt(i));
				
			}else  if(str.charAt(i) ==')'){
				while(!st.isEmpty()) {
					if(st.peek() =='(') {
						st.pop();
						if(j==0 || j==1) {
							return true;
						}
						j=0;
					}else {
						st.pop();j++;
					}
				}
			}
		}
	
        return false;
	}

	
	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		
		//Your code goes here
		if(input.size() ==1) {
			return;
		}
		int temp = input.pop();
		
		reverseStack(input, extra);
		
	
		while(!input.isEmpty()) {
			System.out.println("dada" + input.peek());
			extra.push(input.pop());
		}
		input.push(temp);
		while(!extra.isEmpty()) {
			input.push(extra.pop());
		}
		
	}
	 public static boolean isBalanced2(String expression) throws StackEmptyexception {
	        //Your code goes here
		 String str = expression;
		 if(str.charAt(0) ==')' || str.charAt(0) == '}'|| str.charAt(0) == ']') {
			 return false;
		 }
			StackUsingLL<Character> st = new StackUsingLL<>();
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i) == '[' ||str.charAt(i) == '{'|| str.charAt(i) == '(') 
				{
//					System.out.println(str.charAt(i));
					st.push(str.charAt(i));
				}
				if(str.charAt(i) == ']' ||str.charAt(i) == '}'|| str.charAt(i) == ')') {
//					System.out.println(str.charAt(i));
//					System.out.println("top data " + st.top());
					char bal = str.charAt(i);
					if(st.top() =='(' && bal ==')' || st.top() =='{' && bal =='}' || st.top() =='[' && bal ==']' ) {
						st.pop();
						
					}else {
						return false;
					}
				}
				
			}
		 return true;
	    }

	 public static boolean isBalanced(String expression) {
		 String str = expression;
		 if(str.charAt(0) ==')' || str.charAt(0) == '}'|| str.charAt(0) == ']') {
			 return false;
		 }
			Stack<Character> st = new Stack<>();
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i) == '[' ||str.charAt(i) == '{'|| str.charAt(i) == '(') 
				{
//					System.out.println(str.charAt(i));
					st.push(str.charAt(i));
				}
				if(str.charAt(i) == ']' ||str.charAt(i) == '}'|| str.charAt(i) == ')') {
//					System.out.println(str.charAt(i));
//					System.out.println("top data " + st.top());
					char bal = str.charAt(i);
					if(st.peek() =='(' && bal ==')' || st.peek() =='{' && bal =='}' || st.peek() =='[' && bal ==']' ) {
						st.pop();
						
					}else {
						return false;
					}
				}
				
			}
		 return true;
	    }
	}
	 

