package OOPS_2;

public class ExceptionDemo {
	
	 public static int fact(int n) throws Negativenumexcep{
		 if(n<0) {
			 throw new Negativenumexcep();
		 }
		 return 1;
	 }
	public static int divide(int a,int b) throws divideByZero {// throws means we are passing the declaration to main or who so ever call the exception
	
		if(b==0) {
			throw new divideByZero();
		}
		return a/b;
	}	
	public static void main(String[] args) {
		try {
			divide(10,0);
			System.out.println(fact(2));
		} catch (divideByZero e) {
			// TODO Auto-generated catch block
			System.out.println("divide by zero");
			e.printStackTrace();
		} catch (Negativenumexcep e) {
			// TODO Auto-generated catch block
			System.out.println("Negative number exception");
		}
		System.out.println("Main");
	}
}
