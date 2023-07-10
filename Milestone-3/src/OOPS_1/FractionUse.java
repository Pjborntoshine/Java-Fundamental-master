package OOPS_1;

public class FractionUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction(4,6);
		f1.print();
//		f1.increment();
//		f1.print();
//		f1.setNumerator(12);
		
//		f1.getNumerator();
		Fraction f2 = new Fraction(4,8);
		f1.multiply(f2);
		f1.print();
		f1.substract(f2);
		f1.print();
		
		Fraction f3 = Fraction.add(f1,f2); // calling via static methods as the fraction is not part and we need to have return 3rd fration
		f3.print();
		f2.print();
		f1.add(f2);
		Fraction addtwo = new Fraction();
		addtwo.addTwoFraction(f1, f2);
		addtwo.print();
	
	}

}
