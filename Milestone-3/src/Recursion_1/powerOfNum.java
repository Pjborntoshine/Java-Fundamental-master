package Recursion_1;

public class powerOfNum {

	public static int count(int n){
		//Write your code here
        if(n==0){
        return 0;
    }
	int smallOutput = count(n/10);// assumption
	//System.out.println(smallOutput++);
//	 int top=top+ smallOutput;
        return ++smallOutput;
        
    }
	
	public static int power(int x, int n) {
		if(n==1) {
			return x;
		}
		int smallop = power(x, n-1);
		int output =x*power(x, n-1);
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(power(3,4));
//		System.out.println(power(2,5));
//		System.out.println(6/10);
		System.out.println(count(156));
	}

}
