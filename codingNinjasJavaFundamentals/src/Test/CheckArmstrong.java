package Test;

import java.util.Scanner;

public class CheckArmstrong {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int temp=n;
		int i=1;
		String lenofdogit =""+n;
		int lenofdig = lenofdogit.length();
		//System.out.println(lenofdig);
		int sum=0;
		while(n!=0)
		{
			int rem = n%10;
			//System.out.println(rem);
			int numPoert = (int) Math.pow(rem, lenofdig);
			//System.out.println(numPoert);
			sum+=numPoert;
			n/=10;
		}
		
		if(sum ==temp) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
