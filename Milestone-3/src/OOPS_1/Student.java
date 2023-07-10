package OOPS_1;

public class Student {
	String name;
	final private int rollNo; // here roll no will assign only once and then it cannot be change after wards
	double cgpa;
	final  double conversionFactor = 0.95; // No one can cheng the value of this varable
	final static double CONVRSIONFACTOR2 = 0.95; // No one can cheng the value of this varable and conversionFactor2 belong to class not object
	public final static double CONVRSIONFACTOR3= 0.95; // any one can see assign only once and it is a class property
	static int numStudent;
	private static int numStudent2; // here we are restricting the the outer class to access this  numStudent2 variable  therefore we need to use static methods to access this varaible
	// getter for numStudent2
	public static int getnumStudent2() {
		return numStudent2;
	}
	
	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
		numStudent++;
	}
//public Student() {
//		
//	}
//	public int getrollNo() { // public
//		return rollNo;
//	}
//	public void print() {
//		System.out.println(this.name+"-> "+this.rollNo);
//	}
//	// setter 
//	public void setRollNo(int num) {
//		if(num<0) {
//			return;
//		}
//		System.out.println("this will refer to current Student classs   "+this);
//		rollNo = num;
//	}
}
