package OOPS_2;

public class Vehical {
	private String color;
	
	
	
	public Vehical() {
//		super();
		// TODO Auto-generated constructor stub
	}
	public Vehical(int maxspeed) {
	//	super();
		// TODO Auto-generated constructor stub
		System.out.println("vehical const");
	
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	protected int maxSpeed;
	public void print() {
		System.out.println("Vehical" + getColor() + "maxspeed" + maxSpeed);
	}
}
