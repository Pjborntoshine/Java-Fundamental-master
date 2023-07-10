package Patter2Rev;

import java.util.Scanner;

public class triangleOfPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		if(n>=0 && n<=50) {
			int i=1;
			while(i<=n) {
				int inc = i;
				int sp=1;
				while(sp<=n-i) {
					System.out.print(" ");sp++;
				}
				int j=1;
				while(j<=i) {
					System.out.print(inc);j++;inc++;
				}
				int dec = inc-2;
				while(dec>=i) {
					System.out.print(dec);dec--;
				}
				i++;
				System.out.println();
			}
		}
	}

}
