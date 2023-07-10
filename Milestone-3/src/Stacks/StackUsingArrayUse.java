package Stacks;

public class StackUsingArrayUse {

	public static void main(String[] args) throws StackEmptyexception, StackFullException {
		// TODO Auto-generated method stub
		StackUsingArray st = new StackUsingArray();
		int arr [] = {5,6,7,1,9};
		for(int i=0;i<arr.length;i++) {
			st.push(arr[i]);
		}
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
//		st.push(10);
//		System.out.println(st.top());
//		st.pop();
//		st.size();
//		System.out.println(st.isEmpty());
		
	}

}
