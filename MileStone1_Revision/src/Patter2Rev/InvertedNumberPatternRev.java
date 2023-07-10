package Patter2Rev;

import java.util.Scanner;

public class InvertedNumberPatternRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		int k=n;
		while(i<=n) {
			int j=1;
			while(j<=k) {
				System.out.print(k);j++;
			}
			i++;k--;
			System.out.println();
		}
	}

}
