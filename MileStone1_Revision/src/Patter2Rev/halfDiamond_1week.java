package Patter2Rev;

import java.util.Scanner;

public class halfDiamond_1week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner s = new Scanner(System.in);
				int n=s.nextInt();
				int i=0;
				int fiirstHalf = n;
				int decSecHal = n-1;
				while(i<n*2+1) {
					if(i<=fiirstHalf) {
						int j=0;int	num=1;
						System.out.print("*");
						while(j<i) {
							System.out.print(num);num++;
							j++;
						}
						
						int dec = num-2;
						while(dec>0) {
							System.out.print(dec);dec--;
						}
					}else {
						// for 2nd half
						int j=0,num=1;
						System.out.print("*");
						while(j<decSecHal) {
							System.out.print(num);num++;j++;
						}
						
						int dec2 = num-2;
						while(dec2>0) {
							System.out.print(dec2);dec2--;
						}
						decSecHal--;
					}
					if(i!=0 && i!=n*2) {
					System.out.print("*");
					}
					System.out.println();i++;
				}
	}

}
