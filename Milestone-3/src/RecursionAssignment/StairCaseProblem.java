package RecursionAssignment;

import java.util.Scanner;

public class StairCaseProblem {
	 public static int staircase(int n){
			if(n==0) {
				return 1;
			}
			if(n<0) {
				return 0;
			}
			int x = staircase(n-3);
			int y = staircase(n-2);
			int z = staircase(n-1);
			int sum = x+y+z;
			//System.out.println(sum);
			return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(staircase(n));
	}
}


