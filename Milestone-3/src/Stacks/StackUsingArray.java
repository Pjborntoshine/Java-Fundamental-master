package Stacks;

public class StackUsingArray {
	int data [];
	int topIndex;
	public StackUsingArray() {
		data = new int[2];
		topIndex = -1;
	}
	public StackUsingArray(int size) {
		data = new int[size];
		topIndex = -1;
	}
	// O(1)
	public int size() {
		return topIndex + 1;
	}
	// O(1)
	public boolean isEmpty() {
		if(topIndex == -1) {
			return true;
		}
		return false;
	}
	// O(1)
//	public void push(int elem ) throws StackFullException {
//		if(topIndex == data.length-1) {
//			// throw exception
//			StackFullException e = new StackFullException();
//			throw e;
//			// or
//			// throw new StackFullException();
//		}
//		topIndex++;
//		data[topIndex] = elem;
//	}
	// new having double capacity
	public void push(int elem ) {
		if(topIndex == data.length-1) {
			// throw exception
			doubleCapacity();
		}
		topIndex++;
		data[topIndex] = elem;
	}
	
	private void doubleCapacity() {
		// TODO Auto-generated method stub
		int[] temp = data;
		data = new int[temp.length*2];
		for(int i=0;i<temp.length;i++) {
			data[i] = temp[i];
		}
	}
	// O(1)
	public int top() throws StackEmptyexception {
		if(topIndex == -1) {
			// throw  Stack Exception
			throw new StackEmptyexception();
		}
		return data[topIndex];
	}
	// O(1)
	public int pop() throws StackEmptyexception {
		if(topIndex == -1) {
			// throw  Stack Exception
			throw new StackEmptyexception();
		}
		int temp = data[topIndex];
		topIndex--;
		return temp;
	}
	
}
