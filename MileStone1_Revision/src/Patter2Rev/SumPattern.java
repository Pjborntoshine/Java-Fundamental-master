package Patter2Rev;

import java.util.Scanner;

public class SumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int n =s.nextInt();
		 int i=1;
		 while(i<=n) {
			 int j=1;
			 
			 int sum=0;
			 while(j<=i){
				 sum+=j;
				
				 if(j==i) {
					 System.out.println(j+"="+sum);
				 }else {
					 System.out.print(j+"+");
				 }
				 j++;
			 }
			 i++;
			 System.out.println();
		 }
	}

}
