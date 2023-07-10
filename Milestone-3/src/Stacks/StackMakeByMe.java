package Stacks;

public class StackMakeByMe {
	private int data[];
	private int nextelem;
	public StackMakeByMe() {
		data = new int[10];
		nextelem = 0;
	}
	public void push(int elem) {
		if(nextelem == data.length) {
			return;
		}
		data[nextelem] =elem; 
		nextelem ++;
		}
	public int pop() {
		if(nextelem == data.length) {
			return -1;
		}
		int retElem = data[nextelem-1];
		data[nextelem-1] = -1;
		nextelem = nextelem-1;
		return retElem;
	}
	
	public int  top() {
		return data[nextelem-1];
	}
	public int size() {
		return nextelem;
	}
	public void test() {
		for(int i=0;i<nextelem;i++) {
			System.out.print(data[i] +" ");
		}
	}
	
}
