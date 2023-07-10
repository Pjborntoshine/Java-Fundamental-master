package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ReversetheFirstKElementsQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		Queue<Integer> ans = reverseKElements(queue,3);
		while(!ans.isEmpty()) {
			System.out.println(ans.remove());
		}
		
	}
	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
		//Your code goes here
		Queue<Integer> ans1 = reverseKRec(input,k);
		int lp = input.size() -k;
		System.out.println("asdas->" + lp);
		for(int i=0;i<lp;i++) {
			int data = input.peek();
			input.remove();
			input.add(data);
		}
		return ans1;
	
	}
	public static Queue<Integer> reverseKRec(Queue<Integer> input, int k) {
		Queue<Integer> op = input;
		if(k==0) {
			return op;
		}
		int data = op.peek();
		op.remove();
		Queue<Integer> smallOp =  reverseKRec(input,k-1);
		smallOp.add(data);
		return smallOp;
	}
}
