package lec7OperatorsForLoop;

import java.util.Scanner;

public class termap1Week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int x=s.nextInt();
		if(x>=1 && x<=1000) {
			int n= 0;
			int count=0;
			while(n<=x || count<=x ) {
				int ans = 3*n+2;
				if(ans%4!=0) {
					System.out.println(ans);count++;
				}
				n++;
			}
			
		}
	}

}
