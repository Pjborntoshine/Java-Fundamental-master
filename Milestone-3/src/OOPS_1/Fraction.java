package OOPS_1;

public class Fraction {
	private int numerator;
	private int denominator;
	public Fraction() {
		
	}
	public Fraction(int numerator,int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		// calling simplify 
		simplify();
	}
	private void simplify() {
		// TODO Auto-generated method stub
		int gcd=1;
		int i=1;
		
		int small = numerator>denominator?numerator:denominator;
		while(i<small) {
			if(numerator%i==0 && denominator%i==0) {
				gcd = i;
			}
			//System.out.println("gcd @" +i +" "+gcd );
			i++;
		}
		this.numerator = this.numerator/gcd;
		this.denominator = this.denominator/gcd;
		
	}
	// increment
	public void increment(){
		this.numerator = this.numerator + (1*denominator);
		System.out.println("numerator"+numerator);
		simplify();
	}
	// ADD
	public void add(Fraction f2){
			// first fraction on which function is called
			// second fraction is passed as argument
		this.numerator =this.numerator * f2.denominator + this.denominator * f2.numerator;
		this.denominator = this.denominator * f2.denominator;
		simplify();
	}
	public void substract(Fraction f2) {
		this.numerator = this.numerator*f2.denominator - this.denominator * f2.numerator;
		this.denominator = this.denominator * f2.denominator;
		simplify();
	}
	public void multiply(Fraction f2) {
		this.numerator = this.numerator*f2.numerator ;
		this.denominator = this.denominator * f2.denominator;
		simplify();
	}
	public void addTwoFraction(Fraction f1,Fraction f2) {
		System.out.println(" f1 "+f1.numerator + " f2 " + f2.numerator);
		this.numerator = f1.numerator+f2.denominator + f2.numerator*f1.denominator;
		this.denominator = f1.denominator * f2.denominator;
		simplify();
	}
	
	
	public static Fraction add(Fraction f1,Fraction f2) {
//		
		 	
		int numNum= f1.numerator+f2.denominator + f2.numerator*f1.denominator;
		int numDeino = f1.denominator * f2.denominator;
		Fraction f3 = new Fraction(numNum,numDeino);
		return f3;
	}
	
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	public void print() {
		System.out.println(numerator +" / " + denominator);
	}
}
