package Patter2Rev;

import java.util.Scanner;

public class parralellogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int i=0;
		int space=0;
		while(i<=n) {
			int sp=0;
			while(sp<space) {
				System.out.print(" ");sp++;
			}
			int j=0;
			while(j<=n) {
				System.out.print("*");j++;
			}
			i++;
			space++;
			System.out.println();
		}
	}

}
