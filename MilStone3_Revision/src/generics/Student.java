package generics;

public class Student implements PrintInterface{
int rollNo;

	public Student(int rollNo) {
	super();
	this.rollNo = rollNo;
}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(rollNo);
		
	}

}
