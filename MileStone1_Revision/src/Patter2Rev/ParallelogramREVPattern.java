package Patter2Rev;

import java.util.Scanner;

public class ParallelogramREVPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int i=1;
		int spcount=0;;
		while(i<=n) {
			int sp=0;
			while(sp<spcount) {
				System.out.print(" ");sp++;
			}
			int j=1;
			while(j<=n) {
				System.out.print("*");j++;
				
			}
			i++;
			System.out.println();
			spcount++;
		}
	}

}
