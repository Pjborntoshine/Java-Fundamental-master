package Recursion_1;

public class fibonnacieSeries {
	
	public static void print(int n){
	    if(n < 0){
	        return;
	    }
	    if(n == 0){
	        System.out.println(n);
	        return;
	    }
	    System.out.println(n);
	    print(n--);
	    System.out.print(n+" ");
	}
	
	public static int fibonaccie(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		int fibn_1 = fibonaccie(n-1);
		int fibn2 = fibonaccie(n-2);
		int smallop = fibn_1 + fibn2;
		System.out.println(smallop);
		return smallop;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println( fibonaccie(10));
		print(3);
	}

}
