package Patter2Rev;

import java.util.Scanner;

public class MirrorImagePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i =1;
		while(i<n) {
			int j=1;
			int sp=1;
			while(sp<=n-(i+1)){
				System.out.print(" ");sp++;
			}
			while(j<=i) {
				System.out.print("*");j++;
			}
			i++;
			System.out.println("");
		}
		
	}

}
