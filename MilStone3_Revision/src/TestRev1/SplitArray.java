package TestRev1;

import java.util.Scanner;

public class SplitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(splitArray(input));
	}

	private static boolean splitArray(int[] input) {
		// TODO Auto-generated method stub
		int lSum=0,rSum=0;
		for(int i=0;i<input.length;i++) {
			if(input[i] % 5 == 0) {
				lSum+=input[i];
			}else if(input[i]%3==0) {
				rSum = input[i];
			}else {
				
				// chackeing cond for not by 3 and 5
				if(lSum<=rSum) {
					lSum += input[i];
				}else if(rSum>lSum) {
					rSum += input[i];
				}
				
				
			}
			System.out.println("lsun->" + lSum + " " + rSum);
			
		}
		if(lSum == rSum) {
			System.out.println("lsun" + lSum + " " + rSum);return true;
		}else {
			return false;
		}
	}

}
