package Recursion_2;

public class ReplacePi {
public static String replacepi(String ip) {
	// TODO Auto-generated method stub
	// base case
	if(ip.length()<=1) {
		return ip;
	}
	
	// hypothesis
	
	
	if(ip.charAt(0) == 'p' && ip.charAt(1)=='i') {
		// calling recursion on length n-2
		String smallop = replacepi(ip.substring(2));
		System.out.println(smallop);
		return 3.14+smallop;
	}else {
		// calling recursion on length n-1
		String smallop = replacepi(ip.substring(1));
		return ip.charAt(0)+ smallop;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replacepi("dpipppi"));
	}

}
