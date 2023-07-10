package LinkedList_1;

import java.util.Scanner;

public class LinkedListNodeUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode<Integer> head =takeInput();
		printLinkedList(head);
		System.out.println();
		//System.out.println(findNode(head,2));
		//LinkedListNode<Integer> headapp =  appendLastNToFirst(head,5);
		//LinkedListNode<Integer> headapp = removeDuplicates(head);
//		printLinkedList(headapp);
		//printReverse(head);
		
		boolean headapp= isPalindrome(head);
		System.out.println(headapp);
	}
	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		if(head == null) {
			return true;
		}
		LinkedListNode<Integer> temp = head;
		LinkedListNode<Integer> mid = head;
		LinkedListNode<Integer> tempElem = null;
//		LinkedListNode<Integer> fastPoint = head;
		int c=0;
		while(temp!=null) {
			if(c%2==1) {
				mid=mid.next;
			}
			c++;
			temp=temp.next;
			
		}
		//System.out.println(mid.data + " ->" + mid.next.data);
		tempElem = mid.next;
		mid.next = null;
		System.out.println("");
		printLinkedList(head);
		System.out.println("");
		printLinkedList(tempElem);
		System.out.println("");
//		LinkedListNode<Integer> revHead =reverseLL(tempElem,head);
		//reverseLL(tempElem);
//		System.out.println(revHead.next.data);
		//printLinkedList(revHead);
		LinkedListNode<Integer> revHead = reverseLLIterativeWay(tempElem);
		boolean op = false;
		while(revHead!=null) {
			if(revHead.data != head.data) {
				return false;
			}
			revHead = revHead.next;
			head = head.next;
		}
		if(head!=null) {
			while(head.next!=null) {
				if(head.data != head.next.data) {
					return false;
				}
				head = head.next;
			}
		}
		return true;
	}

	private static LinkedListNode<Integer> reverseLLIterativeWay(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> prev = null;
		LinkedListNode<Integer> currelem = head;
		LinkedListNode<Integer> nextel = null;
		while(currelem!=null) {
			nextel = currelem.next;
			currelem.next = prev;
			prev = currelem;
			currelem = nextel;
		}
		head = prev;
		System.out.println();
		
		
		return head;
		// TODO Auto-generated method stub
	
	}

	
	private static LinkedListNode<Integer> reverseLL(LinkedListNode<Integer> head) {
		// TODO Auto-generated method stub
		if(head==null || head.next == null) {
			return head;
		}
		
		 LinkedListNode<Integer>rest =   reverseLL(head.next);
		System.out.println(rest.data + " -->" + head.data);
		return rest;
	
	}
	private static void printLinkedList(LinkedListNode<Integer> head) {
		// TODO Auto-generated method stub
		LinkedListNode<Integer> temp = head;
		while(temp!=null) {
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
	}
	public static void printReverse(LinkedListNode<Integer> root) {
		//Your code goes here
		if(root ==null) {
			return;
		}
		printReverse(root.next);
		System.out.print(root.data+" ");
	}

	private static LinkedListNode<Integer> takeInput() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail =null;
		int checkHead = 0;
		while(data!=-1) {
			// assinging the head node
			LinkedListNode<Integer> currrentNode =new LinkedListNode<Integer>(data);
			
			if(head == null){
				head = currrentNode;
				tail = head;
			}else {
				tail.next = currrentNode;
				tail = currrentNode;	
			}
			
			data = s.nextInt();
			
		}
		
		return head;
		
	}
	public static int findNode(LinkedListNode<Integer> head, int n) {
		int i=0;
		LinkedListNode<Integer> temp =head;
		while(temp!=null) {
			if(temp.data == n) {
				return i;
			}
			i++;
			temp = temp.next;
		}
		
		
		return -1;
		// Write your code here.
	}
	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		LinkedListNode<Integer> temp =head;
		int i=0;
		while(temp!=null) {
			temp = temp.next;
			i++;
		}
		LinkedListNode<Integer> temp2 =head;
		LinkedListNode<Integer>headRef =head;
		int tillRem = i-n;
		System.out.println(tillRem);
		// making head to point toward i+1 eleme;
		int k=0;
		while(k<=tillRem) {
			if(k==tillRem-1) {
				head = null;
				//System.out.println("headRef" + headRef.data);
				head = temp2.next;
				LinkedListNode<Integer>tempRef =head;
				while(tempRef!=null) {
					System.out.println(tempRef.data);
					tempRef = tempRef.next;
					if(tempRef.next == null) {
						System.out.println("nn" + tempRef.data);
						tempRef.next = headRef;
						break;
					}
				}
				temp2.next = null;
				
				
				return head;
			}
			
			temp2 = temp2.next;	
			k++;
			
		}
		return head;
		//Your code goes here
	}
	
	//Eliminate duplicates from LL
	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
		if(head == null) {
			return head;
		}
		LinkedListNode<Integer> temp = head;
		LinkedListNode<Integer> tempNextElem = head.next;
		
		while(tempNextElem!=null) {
			if(temp.data == tempNextElem.data) {
				
				tempNextElem = tempNextElem.next;
				
			}else {
				temp.next = tempNextElem;
				temp = tempNextElem;
				//tempNextElem = tempNextElem.next;
			}
			if(tempNextElem == null) {
				temp.next = null;
			}
	
		
		}
		
		return head;
		//Your code goes here
	}

}
