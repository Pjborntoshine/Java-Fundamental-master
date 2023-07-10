package LinkedList_1;

import java.util.Scanner;

// the head @ main and head @ print are two seperat variable 
public class LinkedListUse {
public static Node<Integer> crateLl(int num){
	Node<Integer> n = new Node<Integer>(num);
	return n;
}

public static Node<Integer> crateLinkedlist(){
	Node<Integer> n2= crateLl(10);
	Node<Integer> n3= crateLl(20);
	Node<Integer> n4= crateLl(30);
	Node<Integer> n5= crateLl(40);
	System.out.println(n2);
	n2.ref = n3;
	System.out.println("n2" + n2 + " n2.data -> " + n2.Data + " next " + n2.ref);
	n3.ref = n4;
	n4.ref = n5;
	n5.ref = null; //  tail
//	System.out.println(n2.ref.Data);
	return n2;
}

// incrementing the linked list
public static void incrementLinkedList(Node<Integer> head) {
	Node<Integer> temp = head;
//	while(temp!=null) {
//		temp.Data++;
//	}
	
	while(head!=null) {
		head.Data++;
		head = head.ref;
	}
}

// taking input o(n^2)
public static Node<Integer> takeInput() {
	// TODO Auto-generated method stub
	Scanner s = new Scanner(System.in);
	int data = s.nextInt();
	Node<Integer> head = null;
	while(data!=-1) {
		Node<Integer> currentNode = new Node<Integer>(data);
		if(head ==null) {
			// making it as current node
			head = currentNode;
		}else {
			Node<Integer> tail = head;
			while(tail.ref!=null) {
				
				tail = tail.ref;
			}
			// now taile will refer to last node
			// connect current node after last node
			tail.ref = currentNode;
		}
		data = s.nextInt();
	}
	return head;
}
// optimize way
public static Node<Integer> takeInputOpt() {
	// TODO Auto-generated method stub
	Scanner s = new Scanner(System.in);
	int data = s.nextInt();
	Node<Integer> head = null,tail = null;
	while(data!=-1) {
		Node<Integer> currentNode = new Node<Integer>(data);
		if(head ==null) {
			// making it as current node
			head = currentNode;
			tail = head;
		}else {
			tail.ref = currentNode;
			tail = currentNode; //  tail = tail.ref
		}
		data = s.nextInt();
	}
	return head;
}


// inserting linked list




public static void printLinkedList(Node<Integer> head){
	Node<Integer> temp = head;
	while(temp!=null) {
		System.out.print(temp.Data +" ");

		temp = temp.ref;
	}
// done by me here last elemet will no be print beacause of ;condition
//	Node<Integer> nn = head;

//	while(true) {
//		if(nn.ref==null) {
//			return;
//		}else {
//			System.out.println(nn.Data);
//			nn = nn.ref;
//		}
//	}

}

public static Node<Integer> insert(Node<Integer> head, int pos, int data){
	Node<Integer> temp = head;
	Node<Integer> prevNode = null;
	Node<Integer> afterNode = null;
	Node<Integer> insertNode = new Node<Integer>(data);
	if(pos == 0) {
		afterNode = temp;
		insertNode.ref = afterNode;
		return insertNode;
	}
	int i=0;
	while(temp!=null) {
		if(i==pos-1) {
			if(temp.ref == null) {
				// we are at last
				System.out.println("dasda" + temp.Data);
				prevNode = temp;
				temp.ref = insertNode;
				return head;
			}else {
				// making prev Node
				prevNode = temp;
				afterNode = temp.ref;
				temp.ref = insertNode;
				insertNode.ref = afterNode;
				System.out.println("" + i+" ->" + prevNode.Data +" " + afterNode.Data);
				
			}
			
		}
		temp = temp.ref;
		i++;
	}
	return head;
	//Your code goes here
}

// deleting linked list
public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
	// Write your code here.
	if(pos==0) {
		head = head.ref;
		return head;
	}
	Node<Integer> preNode = null;
	Node<Integer> backEleme = null;
	Node<Integer> temp = head;
	int i=0;
	while(temp!=null) {
		if(i==pos) {
			// checking edge case
			if(temp.ref==null) {
				System.out.println("edge"+ " "+backEleme.Data);
				// then removing end element 
				backEleme.ref = null;
				return head;
			}
			
			System.out.println("asdas" + backEleme.Data);
			preNode = temp;
			backEleme.ref = backEleme.ref.ref;
		}
		backEleme = temp;
		temp = temp.ref;
		i++;
	}
	
	return head;
}
public static void printReverse(LinkedListNode<Integer> root) {
	//Your code goes here
	if(root==null) {
		return;
	}
	printReverse(root.next);
	System.out.println("asd" + root.data);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Node<Integer>head =   takeInputOpt();
		printLinkedList(head);
		System.out.println();
		Node<Integer>headNode =deleteNode(head,5);
		System.out.println();
		printLinkedList(headNode);
		
		/*Node<Integer>head =   takeInputOpt();
		printLinkedList(head);
		System.out.println();
		Node<Integer>headNode =insert(head,5,99);
		System.out.println();
		printLinkedList(headNode);
		//System.out.println(head.Data);
		*/
		
		
		
		
		/*
		Node<Integer>head=  crateLinkedlist();
		printLinkedList(head);
		incrementLinkedList(head);
		System.out.println();
		printLinkedList(head);
		*/
		
		
//		Node<Integer> n1 =new Node<>(10);
//		System.out.println(n1);
//		System.out.println(n1.Data);
//		Node<Integer> n2= crateLl(10);
//		Node<Integer> n3= crateLl(20);
//		Node<Integer> n4= crateLl(30);
//		Node<Integer> n5= crateLl(40);
//		System.out.println(n2);
//		n2.ref = n3;
//		n3.ref = n4;
//		n4.ref = n5;
//		n5.ref = null; //  tail
//		System.out.println(n2.ref);
		
	}

}
