package Stacks;

public class StackUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackMakeByMe st = new StackMakeByMe();
		st.push(10);
		st.push(20);
		st.test();
		System.out.println(st.pop());
		st.test();
//		System.out.println();
//		System.out.println(st.size());
//		System.out.println(st.top());
	}

}
