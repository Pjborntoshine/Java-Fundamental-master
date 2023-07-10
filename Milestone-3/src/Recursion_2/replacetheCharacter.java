package Recursion_2;

public class replacetheCharacter {
public static String replaceWith(String str,char a,char b,int strind) {
	if(strind == str.length() ) {
		return str;
	}
	if(str.charAt(strind) == a) {
		return str.replace(a, b); // done
	}
	String ans = replaceWith(str, a,b, ++strind);
	return ans;
	
}
// sir ways
public static String replacestr(String s,char a,char b) {
	if(s.length() ==0) {
		return s; // returning the string when we get single string
	}
	String smallOp = replacestr(s.substring(1), a, b);
	// checking if char a exisr
	if(s.charAt(0) == a) {
		// if number exist
		return b+ smallOp;
	}else {
		return s.charAt(0)+ smallOp;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replaceWith("asdasdassadas",'x','y',0));
		System.out.println(replacestr("xyxyxyxyasdasdas",'a','b'));
	}

}
