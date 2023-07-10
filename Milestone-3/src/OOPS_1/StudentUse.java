package OOPS_1;

public class StudentUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s1 = new Student();
		
		Student s1 = new Student("lal kumar",125);
		Student s2 = new Student("raj kumar",126);
		System.out.println(s1.numStudent);
		System.out.println(s2.numStudent);
		Student s3 = new Student("kanlesh kumar",127);
		System.out.println(s2.numStudent);
		System.out.println(s3.numStudent);
		System.out.println(Student.numStudent);
		// calling numStudent2 variable
		System.out.println(Student.getnumStudent2());
//		s2.print();
//		System.out.println(s1);
//		System.out.println(s1.name + " "+s1.rollNo); // default values
//		s1.setRollNo(100);
//		System.out.println(s1.name + " "+s1.getrollNo()); // accessing private variable
//		s1.name = "Manish";
//		s1.rollNo = 12;
//		System.out.println(s1.name + " "+s1.rollNo);
		
	}

}
