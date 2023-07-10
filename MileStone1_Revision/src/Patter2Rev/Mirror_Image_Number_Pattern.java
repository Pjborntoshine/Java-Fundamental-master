package Patter2Rev;

import java.util.Scanner;

public class Mirror_Image_Number_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		while(i<n){
			int sp = 1;
			while(sp<n-i) {
				System.out.print(" ");sp++;
			}
			int j=1;
			while(j<=i) {
				System.out.print(j);
				j++;
			}
			i++;
			System.out.println();
		}
	}

}
