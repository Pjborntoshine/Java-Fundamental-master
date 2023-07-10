package Recursion_1;

public class PrintFirstNNaturalNum {


	public static void print(int n){
		//Write your code here
		if(n==0) {
			System.out.println("");
			return ;
		}
		 System.out.println(n); // rev
		 print(n-1);
		 System.out.println(n);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(10);
	}

}
