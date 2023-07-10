package Patter2Rev;

import java.util.Scanner;

public class halfDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int half = n*2/2+1;int loop=n-1;
		if(n>=0 && n<=50) {
			int i=1;
			System.out.println("*");
			while(i<=(n*2)) {
				if(i<half) {
					int j=1;
					System.out.print("*");
					while(j<=i) {
						
						System.out.print(j);j++;
					}
					
					int dec = j-2;
					while(dec>0) {
						System.out.print(dec);dec--;
					}
					//System.out.print("*");
				
				}else {
					int k=1;
					System.out.print("*");
					while(k<=loop) {
						System.out.print(k);k++;
					}
					loop--;	
					int dec2 = k-2;
					while(dec2>0) {
						System.out.print(dec2);dec2--;
					}
					
				}
				
				if(i==n*2) {
					System.out.print("");
				}else
				if(i!=0) {
				System.out.print("*");
				
				}
				i++;
				System.out.println();
			}
		}
	}

}
