package Lec7Revision;

import java.util.Scanner;

public class TermsofAP_RevFirstWek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		if(n>=0 && n<=1000) {
			int i=1;
			int tc = 1;
			int counter=1;
			while(i<=n || counter<=n) {
				int ap = 3*tc+2;
				tc++;
				if(ap%4!=0) {
					System.out.print(ap+" ");
					counter++;
				}
				i++;
				
				
			}
		}
	}

}
