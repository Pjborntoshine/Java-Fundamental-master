package Inheritance_Temp;

import OOPS_2.Vehical;

public class Truck extends Vehical{
	int maxLoadingCapacity;
	public void print() {
		System.out.println("Vehical" + getColor() + "maxspeed" + maxSpeed +" maxLoadingCapacity " + maxLoadingCapacity);
	}
}
