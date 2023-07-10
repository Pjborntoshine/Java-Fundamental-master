package generics;

public class Vehicle implements PrintInterface{ // form interface method
//	/public class Vehicle { // for normall class call
private int maxSpeed;
private String comp;



public Vehicle() {
	super();
	// TODO Auto-generated constructor stub
}



public Vehicle(int maxSpeed, String comp) {
	super();
	this.maxSpeed = maxSpeed;
	this.comp = comp;
}



public int getMaxSpeed() {
	return maxSpeed;
}
public void setMaxSpeed(int maxSpeed) {
	this.maxSpeed = maxSpeed;
}
public String getComp() {
	return comp;
}
public void setComp(String comp) {
	this.comp = comp;
}

public void print() {
	System.out.println(maxSpeed + " " + comp);
}





}
