package Lec8FunctionAndScope;

import java.util.Scanner;

public class MoreOnFunction {
public static int sum(int a,int b) {
	return a+b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b=s.nextInt();
		System.out.println(sum(a,b));
	}

}
