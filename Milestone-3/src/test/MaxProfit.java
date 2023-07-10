package test;

import java.util.Arrays;
import java.util.Scanner;

public class MaxProfit {
	public static int maximumProfit(int budget[]) {
		// Write your code here
		Arrays.sort(budget);
//		for(int i=0;i<budget.length;i++) {
//			System.out.print(budget[i] + " ");
//		}
//		System.out.println();
		int maxProfit = Integer.MIN_VALUE;
		int multip = budget.length;
	
		for(int i=0;i<budget.length;i++) {
			int bud = budget[i]*multip;
			if(bud>maxProfit) {
				maxProfit = bud;
			}
			multip--;
//			System.out.println(maxProfit +" " + multip);
		}
		return maxProfit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i=0;i<n;i++)
			input[i] = s.nextInt();
		
		System.out.println(maximumProfit(input));
	}

}
