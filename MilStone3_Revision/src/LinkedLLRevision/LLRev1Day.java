package LinkedLLRevision;

import java.util.Scanner;
class DoubleNode{
	LinkedList<Integer> head;
	LinkedList<Integer> tail;
	public DoubleNode(LinkedList<Integer> head, LinkedList<Integer> tail) {
		super();
		this.head = head;
		this.tail = tail;
	}
	
}
public class LLRev1Day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>head =  takeInput();
		printLL(head);
		System.out.println();
		//int ind = findANode(head,5);
		//System.out.println(ind);
//		LinkedList<Integer> delll = deleteNode(head,0);
//		System.out.println();
//		printLL(delll);
//		System.out.println();
//		
//		LinkedList<Integer>headElem =appendLastNToFirst(head,4);
//		printLL(headElem);
//		LinkedList<Integer>headElem =InsettLlRec(head,20,20);
//		PrintLlRec(headElem);
//	
//		LinkedList<Integer>headElem =DeleteLlRec(head,45);
//		PrintLlRec(headElem);
//		LinkedList<Integer>headElem =RevlRec(head);
//		System.out.println(headElem);
//		PrintLlRec(headElem);
		
//		DoubleNode headElem =RevlRecDoublePair(head);
//		PrintLlRec(headElem.head);
		LinkedList<Integer> headElem =RevlLLBestWay(head);
		PrintLlRec(headElem);
	}
	// revLl best way
	public static LinkedList<Integer> RevlLLBestWay(LinkedList<Integer> head) {
		if(head.next == null) {
			return head;
		}
	LinkedList<Integer> smallll = RevlLLBestWay(head.next);
	LinkedList<Integer> tail = head.next;
	tail.next = head;
	head.next = null;
	head = smallll;
	return head;
		
	}
	// reverse LL using Pair
	public static DoubleNode RevlRecDoublePair(LinkedList<Integer> head) {
		DoubleNode ans;
		if(head.next == null) {
			ans = new DoubleNode(head, head);
			return ans;
		}
		DoubleNode smallop = RevlRecDoublePair(head.next);
		smallop.tail.next = head;
		head.next = null;
		
		ans = new DoubleNode(smallop.head, head);
		return ans;
	}
	// rev ll
	public static LinkedList<Integer> RevlRec(LinkedList<Integer> head) {
		if(head.next == null) {
			return head;
			
		}
		LinkedList<Integer> smallhead = RevlRec(head.next);
		LinkedList<Integer> tail = head;
		LinkedList<Integer> temp = head;
		while(tail.next!=null) {
			tail = tail.next;
		}
		tail.next = temp;
		temp.next = null;
		head = smallhead;
		return head;
		
	}
	// insert LL using Recursion
		// using normal method
		public static LinkedList<Integer> DeleteLlRec(LinkedList<Integer> head,int pos) {
			if(head == null ) {
				return head;
			}
			if(pos == 0) {
				head = head.next;
				return head;
			}
			else {
				LinkedList<Integer> sh = DeleteLlRec(head.next, pos-1);
				head.next = sh;
				return head;
			}
		}	
	// insert LL using Recursion
	// using normal method
	public static LinkedList<Integer> InsettLlRec(LinkedList<Integer> head,int eme,int pos) {
		
		if(pos ==0) {
			LinkedList<Integer> insEleme  = new LinkedList<>(eme);
			insEleme.next = head;
			return insEleme;
		}else{
			LinkedList<Integer> smallHead = InsettLlRec(head.next, eme, pos-1);
			head.next = smallHead;
			return head;
		}
		
		
	}
//	// Print LLUsing Rec LL-2 Rev
	public static void PrintLlRec(LinkedList<Integer> head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data+ " ");
		PrintLlRec(head.next);
		
	}
	public static LinkedList<Integer> removeDuplicates(LinkedList<Integer> head) {
		LinkedList<Integer> temp = head;
		LinkedList<Integer> tNext = head.next;
		while(temp!=null) {
			if(temp.data ==tNext.data ) {
				System.out.println("dada");
			}
			temp = temp.next;
		}
		return head;
	}
	public static LinkedList<Integer> appendLastNToFirst(LinkedList<Integer> head, int n)
	{
		LinkedList<Integer> temp = head;
		int i=0;
		while(temp!=null) {
			i++;
			temp = temp.next;
		}
		int j = i-n;
		temp = head;
		LinkedList<Integer> tt2 = head;
		i=0;
		System.out.println("j" + j);
		while(i!=j){
			
			if(i==j-1) {
				System.out.println("asdas" + temp.data);
				head = temp.next;
				temp.next = null;
				//return head;
			}
			temp=temp.next;
			i++;
		}
		temp = head;
		i=0;
		while(temp!=null) {
			if(temp.next ==null) {
				temp.next = tt2;
				return head;
			}
			
			temp = temp.next;
		}
		return head;
	}
	
	public static LinkedList<Integer> deleteNode(LinkedList<Integer> head, int pos) {
		if(head == null){
	          return head;
	      }
	        if(pos==0) {
			head = head.next;
			return head;
		}
	        LinkedList<Integer> temp = head;
			int i=0;
			while(temp!=null) {
				if(i==pos-1) {
					//System.out.println(temp.data);
	                if(temp.next==null) {
						return head;
					}
					temp.next = temp.next.next;
				}
				i++;
				temp = temp.next;
			}
			return head;
	}
	private static int findANode(LinkedList<Integer> head, int i) {
		// TODO Auto-generated method stub
		int j=0;
		LinkedList<Integer> temp = head;
		while(temp!=null) {
			if(temp.data == i) {
				return j;
			}
			j++;
			temp = temp.next;
		}
		return -1;
	}

	private static void printLL(LinkedList<Integer> head) {
		// TODO Auto-generated method stub
		LinkedList<Integer> temp = head;
		while(temp!=null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
	}

	private static LinkedList<Integer> takeInput() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		LinkedList<Integer> head = null;
		LinkedList<Integer> tail = null;
		while(data!=-1) {
			LinkedList<Integer> cn = new LinkedList<>(data);
			if(head ==null) { 
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

}
