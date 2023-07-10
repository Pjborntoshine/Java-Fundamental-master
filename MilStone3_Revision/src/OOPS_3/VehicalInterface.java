package OOPS_3;
/*
 * interface are pure abstract i.e all the methods in interface are only and only are abstract. and all the methods in interface are public abstract by default
 * 2. for interface we habve to use ****implement
 * 3. we cannot create object of vehicla interface + abstract methods of vehicle but we cannot acces normal methods of Vehicla class
 * 4.we ca implement polymorphism using interface and using the we can access all the interface  + 
 * 5. we can also create variables inside it and this variable public final static by default
 * 6. A CLASS CAN ONLY extend only class but it cam have more the 1 interface
 * where as an ABSTRACT class can contain both abstract and nomal methods but interface only contain abstract methods
 */
public interface VehicalInterface {
	double PI = 3.14; //public final static by default
//	public abstract boolean isMotorized();
	 boolean isMotorized(); // we can also write like this
	public abstract boolean getCompany();
}
