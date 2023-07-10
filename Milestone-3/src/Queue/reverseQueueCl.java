package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class reverseQueueCl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		
		reverseQueue(queue);
		
	}
	public static void reverseQueue(Queue<Integer> input) {
		//Your code goes here
		Queue<Integer> qtt= reverseQueueRec(input);


	}
	public static Queue<Integer> reverseQueueRec(Queue<Integer> input) {
		if(input.size() ==1) {
			return input;
		}
		int data = input.peek();
		input.remove();
		System.out.println("asda" + data);
		Queue<Integer> smallQueue = reverseQueueRec(input);
		smallQueue.add(data);
		
		return smallQueue;
		
	}
}
