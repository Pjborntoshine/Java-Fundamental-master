package Stacks;

public class StackUsingLL<T> {
	private Node<T> head;
	private int size;
	
	public StackUsingLL() {
		head = null;
		size = 0;
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size == 0;	
	}
	public void push(T elem) {
		Node<T> newNode = new Node<T>(elem);
		newNode.next = head;
		head = newNode;
		size++;
	}
	public T top() throws StackEmptyexception {
		if(head == null) {
			throw new StackEmptyexception();
		}
		return head.data;
	}
	public T pop() throws StackEmptyexception {
		if(head == null) {
			throw new StackEmptyexception();
		}
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
	public void print() {
		Node<T> temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}


/*
public class StackUsingLL<T> {
	private Node<T> head;
	private Node<T> tail;
	private int size;
	
	public StackUsingLL() {
		head = null;
		size = 0;
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}
	public void push(T elem) {
		Node<T> newNode = new Node<T>(elem);
		if(head == null) {
			head = newNode;
		}else {
			newNode.next = head;
			head = newNode;
		}
		size++;
//		Node<T> newNode = new Node<T>(elem);
//		if(head == null) {
//			head = newNode;
//			tail = head;
//		}else {
//			tail.next = newNode;
//			tail = newNode;
//		}
//		size++;
	}
	public T top() {
		return head.data;
	}
	public T pop() {
		head = head.next;
		return head.data;
	}
	public void print() {
		Node<T> temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
*/