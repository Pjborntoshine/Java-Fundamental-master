package OOPS_1;

public class ComplexNumbers {
	private int Real;
	private int Imaginary;
	public ComplexNumbers(int real, int imaginary) {
		super();
		Real = real;
		Imaginary = imaginary;
	}
	public ComplexNumbers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getReal() {
		return Real;
	}
	public void setReal(int real) {
		Real = real;
	}
	public int getImaginary() {
		return Imaginary;
	}
	public void setImaginary(int imaginary) {
		Imaginary = imaginary;
	}
	// 
	public void plus(ComplexNumbers c2) {
		this.Real = this.Real + c2.Real;
		this.Imaginary = this.Imaginary + c2.Imaginary;
	}
	public void multiply(ComplexNumbers c2) {
		int sumReam=0;
		int sumImaginary=0;
		sumReam = this.Real*c2.Real - this.Imaginary*c2.Imaginary;
		sumImaginary = this.Real*c2.Imaginary + this.Imaginary*c2.Real;
		this.Real = sumReam;
		this.Imaginary = sumImaginary;
	}
	public static ComplexNumbers addTwoComplexNum(ComplexNumbers c1,ComplexNumbers c2) {
		int Real = c1.Real + c2.Real;
		int Imaginary = c1.Imaginary + c2.Imaginary;
		ComplexNumbers c3 =new ComplexNumbers(Real,Imaginary);
		return c3;
	}
	public void print() {
		System.out.println(Real +" + i" + Imaginary);
	}
}
