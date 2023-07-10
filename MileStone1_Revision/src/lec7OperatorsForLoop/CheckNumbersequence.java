package lec7OperatorsForLoop;

import java.util.Scanner;

public class CheckNumbersequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int i=1;
		boolean isdec=true;
		boolean isValid = false;
		while(i<=n-2) {
			if(n1>n2) {
				if(!isdec) {
					isValid=false;
					System.out.println(isValid);return;
				}
				// decreasing phase
				isdec=true;
				isValid=true;
			}
			if(n1<n2) {
				
				// increasing phase
				isdec=false;
				isValid=true;
			}
			
			n1=n2;
			n2=s.nextInt();
			if(n1==n2) {
				isValid=false;
				System.out.println(isValid);return;
			}
			i++;
		}
		if(isValid) {
			System.out.println(isValid);return;
		}else if(!isValid){
			System.out.println(isValid);return;
		}
	}

}
