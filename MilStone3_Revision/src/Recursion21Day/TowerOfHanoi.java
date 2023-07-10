package Recursion21Day;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		towerOfHanoi(n, 'a', 'b', 'c');
	}

	private static void towerOfHanoi(int n, char c, char d, char e) {
		// TODO Auto-generated method stub
		if(n==1) {
			return;
		}
		towerOfHanoi(n-1, c, e, d);
		System.out.println(c +" " + d);
		towerOfHanoi(n-1, d, c, e);
	}

}
