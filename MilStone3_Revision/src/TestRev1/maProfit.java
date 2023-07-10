package TestRev1;

import java.util.Arrays;
import java.util.Scanner;

public class maProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i=0;i<n;i++)
			input[i] = s.nextInt();
		
		System.out.println(maximumProfit(input));
	}

	private static int maximumProfit(int[] input) {
		// TODO Auto-generated method stub
		Arrays.sort(input);
		int noPep = input.length;
		int maxProfit = Integer.MIN_VALUE;
		for(int i=0;i<input.length;i++) {
			int profit = input[i] * noPep;
			if(profit > maxProfit) { 
				maxProfit = profit;
			}
			noPep--;
		}
	
	return maxProfit;
	}

}
