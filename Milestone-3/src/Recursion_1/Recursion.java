package Recursion_1;

public class Recursion {
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		int smalloutput = (fact(n-1));
		int output = n*smalloutput;
		return output;
	}
	public static int sumOfNNaturalNum(int n) {
		if(n==0) {
			return 0;
		}
		int smalloutput = (sumOfNNaturalNum(n-1));
		int output = n+smalloutput;
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));
		System.out.println(sumOfNNaturalNum(10));
	
	}

}
