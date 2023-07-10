package Queue;

public class QueueUsingLL<T> {
	private Node<T> front;
	private Node<T> rear;
	private int size;
	public QueueUsingLL() {
		front = null;
		rear = null;
		size=0;
		
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}return false;
	}
	public void enqueue(T elem) {
		Node<T> newNode = new Node<T>(elem);
		size++;
		if(rear == null) {
			front = newNode;
			rear = newNode;
		}else {
			rear.next = newNode;
			rear = newNode;
		}
		
	}
	public T front() throws QueueEmptyException {
		if(front == null) {
			throw new QueueEmptyException();
		}
		return front.data;
	}
	public T rear() {
		return rear.data;
	}
	public T dequeue() throws QueueEmptyException {
		if(front == null) {
			throw new QueueEmptyException();
		}
		T temp = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		size--;
		return temp;
		
	}
	public void testPrint() {
	Node<T> temp = front;
		while(temp!=null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}
}

//public class QueueUsingLL<T> {
//	private Node<T> front;
//	private Node<T> rear;
//	private int size;
//	public QueueUsingLL() {
//		
//	}
//	public int size() {
//		return size;
//	}
//	public boolean isEmpty() {
//		if(size == 0) {
//			return true;
//		}return false;
//	}
//	public void enqueue(T elem) {
//		Node<T> newNode = new Node<T>(elem);
//		if(front == null) {
//			front = newNode;
//			rear = front;
//		}else {
//			rear.next = newNode;
//			rear = newNode;
//		}
//		size++;
//	}
//	public T front() {
//		return front.data;
//	}
//	public T rear() {
//		return rear.data;
//	}
//	public T dequeue() {
//		Node<T> temp = front;
//		front = front.next;
//		size--;
//		return temp.data;
//		
//	}
//	public void testPrint() {
//	Node<T> temp = front;
//		while(temp!=null) {
//			System.out.println(temp.data + " ");
//			temp = temp.next;
//		}
//	}
//}
