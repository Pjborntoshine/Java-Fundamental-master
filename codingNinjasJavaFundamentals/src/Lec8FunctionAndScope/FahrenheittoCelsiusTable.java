package Lec8FunctionAndScope;

import java.util.Scanner;

public class FahrenheittoCelsiusTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int S = s.nextInt();
		int E = s.nextInt();
		int W = s.nextInt();
		 if((S>=0 && S<=90) && (E>=S && E<=900) && (W>=0 && W<=80)){
		ferinHietToCelcius(S,E,W);
		 }
	}
public static void ferinHietToCelcius(int s,int e, int w) {
	while(s<=e) {
		 int cel = 0;
         cel = ((s-32)*5)/9;
     System.out.println(s+" "+cel);
		s+=w;
	}
}
}
