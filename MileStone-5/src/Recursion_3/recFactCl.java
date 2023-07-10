package Recursion_3;

public class recFactCl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////		int num = 5;
////		factTopBot(num,1);
//		int[] arr = {9,5,2,7,3};
////		minInArray(arr,0,Integer.MAX_VALUE);
//		String[] subSeq = new String[1];
//		subSeq[0] = "";
////		SubSequence("abc",subSeq);
////		SubSequence2("abc","");
		printKeypad(23);
	}
	// startPrint Keypad Combinations Code
	public static void printKeypad(int input){
		// Write your code here
		keypadPrinthelp(input,"");
	}
	private static void keypadPrinthelp(int input, String str) {
		// TODO Auto-generated method stub
		if(input == 0) {
			System.out.println(str);return;
		}
		int lastindex = input % 10;
		int lastinp = input / 10;
		
		String str1 = getOption(lastindex);
		
		for(int i=0;i<str1.length();i++) {
			keypadPrinthelp(lastinp, str1.charAt(i) + str);
		}
//		keypadPrinthelp(lastint, str);
		
	}
	
	public static String getOption(int n){
        if (n==2){
            return "abc";
        }
        if (n==3){
            return "def";
        }
        if (n==4){
            return "ghi";
        }
        if (n==5){
            return "jkl";
        }
        if (n==6){
            return "mno";
        }
        if (n==7){
            return "pqrs";
        }
        if (n==8){
            return "tuv";
        }
        if (n==9){
            return "wxyz";
        }
        return "";
    }
	
	// end Print Keypad Combinations Code
	static int c = 0;
	private static void SubSequence2(String input, String strsoFar) {
		// TODO Auto-generated method stub
		if(input.length() ==0) {
			System.out.println(strsoFar);
			return;
		}
		
		String smallIp =  input.substring(1);
		SubSequence2(smallIp,strsoFar);
		SubSequence2(smallIp,strsoFar+ input.charAt(0)+"");
	}
	
	private static void SubSequence(String input, String[] subSeq) {
		if(input.length() == 0) {
			for(String st:subSeq) {
				System.out.println(st);
			}
			return;
		}
		
		String[] op = new String[2*subSeq.length];
		for(int i=0;i<subSeq.length;i++) {
			op[i] = subSeq[i];
		}
		for(int i=0;i<subSeq.length;i++) {
			op[subSeq.length + i] = input.charAt(0) + subSeq[i];
		}
		SubSequence(input.substring(1), op);
		
	}
	private static void minInArray(int[] arr,int si,int min) {
		// TODO Auto-generated method stub
		if(si == arr.length-1) {
			System.out.println(min);
			return;
		}
		if(arr[si]<min) {
			min = arr[si];
		}
		minInArray(arr, si+1, min);
	}

	private static void factTopBot(int num,int ans) {
		// TODO Auto-generated method stub
		if(num == 0) {
		System.out.println(ans);
		return;
		}
		ans=ans*num;
		factTopBot(num-1, ans);
	}

}
