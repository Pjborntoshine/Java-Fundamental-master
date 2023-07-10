package Recursion_3;

import java.util.ArrayList;

public class Rec_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
//		ArrayList<String>  asn= retSubSequence(str);
//		System.out.println("adsas" + asn.size());
//		for(String st: asn) {
//			System.out.println(" --"+st);
//		}
//		String[] op = SubSequence("abc");
//		for( String o:op) {
//			System.out.println(o);
//		}
//		System.out.println(4/10);
		String[] op =keypad(234);
		System.out.println(op.length);
		for( String o:op) {
			System.out.println(o);
		}
	}
	// keyPad sir's way
	
	public static String[] keypadsirWay(int n){
		// Write your code here
        if (n == 0){
            String[] output = new String[1];
            output[0] = "";
            return output;
        }

        String[] smallOutput = keypad(n/10);
        int lastDigit = n % 10;
        String lastDigitOption  = getOption(lastDigit);
        String[] output = new String[smallOutput.length * lastDigitOption.length()];
        int k = 0;
        for (int i = 0; i < smallOutput.length; i++){
            for (int j = 0; j < lastDigitOption.length(); j++){
                output[k] = smallOutput[i] + lastDigitOption.charAt(j);
                k++;
            }
        }
        return output;
        

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
	
	//***********
	
	
	static String[] arr = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static String[] keypad(int n){
		// Write your code here
		if(n==1) {
			String[] ar =new String[0]; 
			return ar;
		}
		
		String[] op = keypadhelper(n);
		return op;
		
	}
private static String[] keypadhelper(int n) {
	if(n==0) {
		String[] op = new String[1];
		op[0] ="";
		
		return op;
	}
//	System.out.println("dadas" + n);
	String[] smallOp= keypad(n/10);
	int lastnum =  n%10;
	String text = arr[lastnum-1];
//	System.out.println(lastnum + " " + text);
	
	String[] op;
	if(n==7 || n==9) {
		op = new String[4*smallOp.length];	
	}else {
		op = new String[3*smallOp.length];
	}
	int k=0;
	for(int i=0;i<smallOp.length;i++) {
		for(int j=0;j<text.length();j++) {
			op[k] = smallOp[i] + text.charAt(j);k++;
		}
		
	}
	
	
	
	return op;
	}
	// sir's way
	private static  String[] SubSequence(String input) {
		if(input.length() == 0) {
			String[] output = new String[1];
			output[0]="";
			return output;
		}
		String[] smallOp = SubSequence(input.substring(1));
		String[] output = new String[smallOp.length*2];
		for(int i=0;i<smallOp.length;i++) {
			output[i] = smallOp[i];
		}
		for(int i=0;i<smallOp.length;i++) {
			output[smallOp.length +  i] = input.charAt(0) + smallOp[i];
		}
		return output;
	}
	private static  ArrayList<String> retSubSequence(String str) {
		// TODO Auto-generated method stub
		if(str.length() == 0) {
			ArrayList<String>  st= new ArrayList<>();
			st.add("");
			return st;
		}
		
		ArrayList<String> sop=retSubSequence(str.substring(1));
		ArrayList<String> newLi = new ArrayList<>();
//		System.out.println("str" + str.charAt(0));
		for(int i=0;i<sop.size();i++) {
			String newStr = sop.get(i)+str.charAt(0);
			newLi.add(newStr);
		}
		sop.addAll(newLi);
		return sop;
	}
	

}
