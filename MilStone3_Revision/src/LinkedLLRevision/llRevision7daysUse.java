package LinkedLLRevision;

import java.util.Scanner;

public class llRevision7daysUse {
	private static llRevision7days<Integer> takeInput() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		llRevision7days<Integer> head =null;
		llRevision7days<Integer> tail =null;
		while(data!=-1) {
			llRevision7days<Integer> cn = new llRevision7days<Integer>(data);
			if(head==null) {
				head = cn;
				tail = head;
			}else {
				tail.next = cn;
				tail = cn;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	private static void printLL(llRevision7days<Integer> head) {
		// TODO Auto-generated method stub
		llRevision7days<Integer> temp = head;
		while(temp !=null ) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	private static void printLlusingRec(llRevision7days<Integer> head) {
		// TODO Auto-generated method stub
		if(head.next == null) {
			return;
		}
		System.out.println(head.data);
		printLL(head.next);
		
	}
	
	private static llRevision7days<Integer> insertUsenrRec(llRevision7days<Integer> head,int elem,int pos) {
		if(pos ==0) {
			llRevision7days<Integer> newNode = new llRevision7days<Integer>(elem);
			newNode.next = head;
			return newNode;
		}
		llRevision7days<Integer> smallOp = insertUsenrRec(head.next,elem,pos-1);
		head.next = smallOp;
		return head;
	}
	
	public static llRevision7days<Integer> deleteNodeRec(llRevision7days<Integer> head, int pos) {
		if(pos == 0) {
			head = head.next;
			return head;
		}
		llRevision7days<Integer>smallHead =  deleteNodeRec(head.next,pos-1);
		head.next = smallHead;
		return head;
	}
	
	public static llRevision7days<Integer> ReverseLlUsingRecursion(llRevision7days<Integer> head) {
		if(head.next ==null || head == null) {
			return head;
		}
		llRevision7days<Integer>smallHead =   ReverseLlUsingRecursion(head.next);
		
		llRevision7days<Integer> tail = smallHead;
		while(tail.next!=null) {
//			System.out.println(smallHead.data);
			tail = tail.next;
		}
		tail.next = head;
		head.next = null;
		return smallHead;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		llRevision7days<Integer> head =  takeInput();
		//printLL(head);
//		printLlusingRec(head);
//		llRevision7days<Integer> headR =insertUsenrRec(head,20,3);
		//llRevision7days<Integer> headR = deleteNodeRec(head,2);
		llRevision7days<Integer> headR = ReverseLlUsingRecursion(head);
		printLlusingRec(headR);
	}

	



}
