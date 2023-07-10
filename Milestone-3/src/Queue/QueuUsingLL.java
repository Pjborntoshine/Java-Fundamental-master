package Queue;

public class QueuUsingLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingLL<Integer> q = new QueueUsingLL<>();
		System.out.println(q.isEmpty());
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.testPrint();
		//System.out.println(q.dequeue());
		q.testPrint();
		System.out.println(q.size());
		System.out.println(q.isEmpty());
	}

}
