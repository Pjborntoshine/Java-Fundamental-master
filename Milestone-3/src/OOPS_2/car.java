package OOPS_2;

public class car extends Vehical{
	int noOfDoors;
	
	public car(int maxSpeed) { 
		super(100); // we need to define th eparent of this class for explicite call the const
		// TODO Auto-generated constructor stub
		System.out.println("car const");
	}

	public void print() {
		super.print();
		System.out.println("CAR" + noOfDoors);
//		System.out.println("Vehical CAR" + getColor() + "maxspeed" + maxSpeed);
	}
	
	public void Maxprint() {
		super.maxSpeed = 150;
		System.out.println("CAR" + noOfDoors +" "+super.maxSpeed);
//		System.out.println("Vehical CAR" + getColor() + "maxspeed" + maxSpeed);
	}
}
