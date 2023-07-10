package Patter2Rev;

import java.util.Scanner;

public class Diamondofstars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n>=1 && n<=49) {
			int i=1;
			int printStar =1; 
			int half = (n/2)+1;
			int decsechalf = n-2;
			int sechalfsp=1;
			while(i<=n) {
				if(i<=half) {
					int sp = 1;
					while(sp<=half-i) {
						System.out.print(" ");sp++;
					}
					int j=1;
					while(j<=i) {
						System.out.print("*");j++;
					}
					int dec = j-2;
					while(dec>0) {
						System.out.print("*");dec--;
					}
				}else if(i>half) {
					
					int k=1;
					int sp=1;
					int kj=1;
					while(sp<=sechalfsp) {
						System.out.print(" ");sp++;
					}
					while(kj<=decsechalf) {
						System.out.print("*");kj++;
					}
					decsechalf-=2;
					sechalfsp++;
					
				}
				
				i++;
				System.out.println();
			}
		}
	}

}
