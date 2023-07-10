package test;

import java.util.Scanner;

public class SplitArray {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(splitArray(input));
	}

	public static boolean splitArray(int input[]) {
		boolean ans=helpVa(input,input.length,0,0,0);
		return ans;
	}

	private static boolean helpVa(int[] input, int n, int st, int larr, int rarr) {
		// TODO Auto-generated method stub
		if(st == n) {
			System.out.println(larr +" " + rarr);
			return larr == rarr;
		}
		
		if(input[st]%5==0) {
			larr += input[st];
		}else if(input[st]%3==0){
			rarr += input[st];
		}else {
			return helpVa(input,n,st+1,larr+input[st],rarr) || helpVa(input,n,st+1,larr,rarr+input[st]);
		}
		
		
		return helpVa(input,n,st+1,larr,rarr);
	
	}
	}


