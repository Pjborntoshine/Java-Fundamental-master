package OOPS_1;

public class PolynomialUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Polynomial pl = new Polynomial();
//		
//		pl.setCoefficient(0, 3);
//		pl.setCoefficient(2, 2);
////		System.out.println(pl.getCoffieient(0));
////	
////		pl.print();
//		Polynomial pl2 = new Polynomial();
//		pl2.setCoefficient(0, 3);
//		pl2.setCoefficient(2, 2);
//		pl2.setCoefficient(1, 4);
//		pl2.setCoefficient(2, 5);
//		pl2.print();
////		pl2.add(pl);
////		pl2.print();
//		pl.add(pl2);
//		pl.print();0
		
//		Polynomial p1 = new Polynomial();
//		p1.setCoefficient(2, 1);
//		p1.setCoefficient(3, 2);
//		p1.setCoefficient(6, 4);
//		p1.print();
//		Polynomial p2 = new Polynomial();
//		p2.setCoefficient(4, 3);
//		p2.setCoefficient(2, 1);
////		p2.setCoefficient(0 , 1);
//		p2.print();
//		Polynomial psunAns = new Polynomial();
//		psunAns = p2.multiply(p1);
//		psunAns.print();		
		
//		Polynomial p1 = new Polynomial();
//		p1.setCoefficient(3, 1);
//		p1.setCoefficient(1, 2);
//		p1.setCoefficient(7, 3);
//		p1.print();
//		Polynomial p2 = new Polynomial();
//		p2.setCoefficient(2, 7);
//		p2.setCoefficient(1, 8);
////		p2.setCoefficient(0 , 1);
//		p2.print();
//		Polynomial psunAns = new Polynomial();
//		psunAns = p2.multiply(p1);
//		psunAns.print();
		
		
		Polynomial p1 = new Polynomial();
		p1.setCoefficient(1, 3);
		p1.setCoefficient(2, 1);
		p1.setCoefficient(3, 7);
		p1.print();
		Polynomial p2 = new Polynomial();
		p2.setCoefficient(2, 7);
		p2.setCoefficient(1, 8);
//		p2.setCoefficient(0 , 1);
		p2.print();
		Polynomial psunAns = new Polynomial();
		psunAns = p1.multiply(p2);
		psunAns.print();
	
	}

}
