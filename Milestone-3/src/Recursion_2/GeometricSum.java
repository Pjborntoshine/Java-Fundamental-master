package Recursion_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GeometricSum {
	public static double findGeometricSum(int k){
		// Write your code here
		if(k==0) {
			return 1;
		}																												
		double smallOp = findGeometricSum(k-1);
		double demo =  Math.pow(2, k);
		double ans =  smallOp+ 1/(demo);
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		double ans = findGeometricSum(k);
		System.out.println(ans);
	}

}
