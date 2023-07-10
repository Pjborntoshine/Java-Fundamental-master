package OOPS_3;

public class Car extends Vehicle2 implements VehicalInterface,CarInterface {

	@Override
	public boolean isMotorized() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean getCompany() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int numGears() {
		// TODO Auto-generated method stub
		return 0;
	}

}
