package LinkedList_2;

import java.util.Scanner;
 class DoubleNode{
	LinkedListNode<Integer> head;
	LinkedListNode<Integer> tail;
	public DoubleNode(LinkedListNode<Integer> head, LinkedListNode<Integer> tail) {
		this.head = head;
		this.tail = tail;
	}
	public DoubleNode() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
public class LinkdListUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LinkedListNode<Integer>head = takeInput();
//		printLlUsingRecursion(head);
//		LinkedListNode<Integer>head2 = takeInput();
//		printLlUsingRecursion(head2);
//		LinkedListNode<Integer> headIns=insertLLUsingRec(head,20,8);
//		LinkedListNode<Integer> headIns= insertLLUsingRecActuallSol1day(head,20,8);
//		System.out.println();
//		printLlUsingRecursion(headIns);
//		LinkedListNode<Integer>headRem =  deleteNodeRec(null,8);
//		System.out.println("");
//		printLlUsingRecursion(headRem);
		
//		LinkedListNode<Integer>headRem =  reverseLinkedListRec(head);
//		System.out.println("");
//		printLlUsingRecursion(headRem);
//		LinkedListNode<Integer>headRem= callReverseLinkedListRecBetter(head);
//		System.out.println("");
//		printLlUsingRecursion(headRem);
		
//		LinkedListNode<Integer>headRem= reverseLinkedListRecBestWay(head);
//		System.out.println("");
//		printLlUsingRecursion(headRem);
//		LinkedListNode<Integer>headRem= midPoint(head);
//		System.out.println(headRem.data+"zxasdasd");
		//printLlUsingRecursion(headRem);
//		LinkedListNode<Integer>headRem= midPoint(head);
//		LinkedListNode<Integer>headRem=mergeTwoSortedLinkedLists(head,head2);
//		printLlUsingRecursion(headRem);
//		LinkedListNode<Integer>headRem=mergeSort(head);
//		printLlUsingRecursion(headRem);
		
//		LinkedListNode<Integer>headRem=TakeInpcircularLL();
//		printCircularLlUsingRecursion(headRem);
		LinkedListNode<Integer>head = takeInput();
		//kReverse(head,4);
		nextLargeNumber(head);
	}
	
	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
		   LinkedListNode<Integer> temp = head;
		   LinkedListNode<Integer>revLl =  reverseLinkedListRecBestWay(temp);
		  
		   LinkedListNode<Integer> ansOP = addOne(revLl);
		   LinkedListNode<Integer>ans =  reverseLinkedListRecBestWay(ansOP);
		   printLlUsingRecursion(ans);
		   return ans;
	}

	
	
	private static LinkedListNode<Integer> addOne(LinkedListNode<Integer> head) {
		// TODO Auto-generated method stub
		int carry=1;
		LinkedListNode<Integer> tt = head;
		while(tt!=null) {
			int sum = carry+tt.data;
			//System.out.println("sum" + tt.data);
			carry = (sum>=10)?1:0;
			sum = sum%10;
			tt.data = sum;
			tt=tt.next;
		}
		if(carry>0) {
			tt.next = new LinkedListNode<Integer>(carry);
		}
		return head;
	}

	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
		//Your code goes here
		//System.out.println("daadas");
		LinkedListNode<Integer> temp = head;
		LinkedListNode<Integer> tempHead = head;
		LinkedListNode<Integer> tTail = tempHead;
		int t = 0;
		while(temp!=null) {
			System.out.println("daadas");
			if(t<=k) {
				tTail.next = temp;
				tTail = temp;
				if(t==k) {
					tTail.next = null;
				}
			}
			k++;
			temp = temp.next;
		}
		printLlUsingRecursion(tempHead);
		return head;
	}
	
	
	
	private static LinkedListNode<Integer> reverseLL(LinkedListNode<Integer> dl) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void printCircularLlUsingRecursion(LinkedListNode<Integer> head){
		LinkedListNode<Integer> temp = head;
		do {
			System.out.println(temp.data);
			temp = temp.next;
		}while(temp!=head);
	}
	// implemeting circular LL
	public static LinkedListNode<Integer> TakeInpcircularLL(){
	
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		while(data!=-1) {
			
			LinkedListNode<Integer> cNode = new LinkedListNode<>(data);
			if(head == null) {
				head = cNode;
				tail = head;
			}else {
				tail.next = cNode;
				tail = cNode;
			}
			data = s.nextInt();
			
			if(data == -1) {
				tail.next = head;
				break;
			}
		}
		return head;
	}
	//10 -5 9 90 5 67 1 89 -1
	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		//Your code goes here
		if(head==null ||  head.next==null) {
			return head;
		}
	
		LinkedListNode<Integer> secHalf = midPoint2(head);
		LinkedListNode<Integer> firstHalf =null;
		firstHalf = firstHalf(head);
		LinkedListNode<Integer> chfh =secHalf;
		LinkedListNode<Integer> fh =mergeSort(firstHalf);
		LinkedListNode<Integer> sh =mergeSort(secHalf);
		LinkedListNode<Integer> headeleme = mergeTwoArr(fh,sh);
		return headeleme;
	}
	
	
	 private static LinkedListNode<Integer> mergeTwoArr(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
		// TODO Auto-generated method stub
		 if(head1==null) {
			 return head2;
		 }
		 if(head2==null) {
			 return head1;
		 }
		 LinkedListNode<Integer> head = null;
		 LinkedListNode<Integer> tail = null;
		 if(head1.data<=head2.data) {
			 head = head1;
			 tail = head1;
			 head1= head1.next;
		 }else {
			 head = head2;
			 tail = head2;
			 head2= head2.next;
		 }
		 while(head1!=null && head2!=null) {
			 if(head1.data<=head2.data)
			 {
				 tail.next = head1;
				 tail= head1;
				 head1 = head1.next;
			 }else {

				 tail.next = head2;
				 tail= head2;
				 head2 = head2.next;
			 }
		 }
		 
		 if(head1!=null) {
			 tail.next = head1;
		 }
		 if(head2!=null) {
			 tail.next = head2;
		 }
		 
		return head;
	}


	private static LinkedListNode<Integer> firstHalf(LinkedListNode<Integer> head) {
		// TODO Auto-generated method stub
		 LinkedListNode<Integer> fNode = head;
		 LinkedListNode<Integer> sNode = head;
		 LinkedListNode<Integer> temp = head;
		while(true) {
			if(fNode == null || fNode.next == null || fNode.next.next==null) {
				sNode.next = null;
				return temp;
			}
			sNode = sNode.next;
			fNode = fNode.next.next;
		}
	}
	 public static LinkedListNode<Integer> midPoint2(LinkedListNode<Integer> head) {
	        //Your code goes here
		 LinkedListNode<Integer> fNode = head;
		 LinkedListNode<Integer> sNode = head;
		 LinkedListNode<Integer> temp = head;
		while(true) {
			if(fNode == null || fNode.next == null || fNode.next.next==null) {
				return sNode.next;
			}
			sNode = sNode.next;
			fNode = fNode.next.next;
		}
	 }

	public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
	        //Your code goes here
		 LinkedListNode<Integer> head = null;
		 LinkedListNode<Integer> tail = null;
		 if(head1.data<=head2.data) {
			 head = head1;
			 tail = head1;
			 head1 = head1.next;
		 }else {
			 head = head2;
			 tail = head2;
			 head2 = head2.next;
		 }
			 
		 while(head1!=null && head2!=null)
		 {
			 if(head1.data<=head2.data) {
				 tail.next = head1;
				 tail = head1;
				 head1 = head1.next;
			 }else {
				 tail.next = head2;
				 tail = head2;
				 head2 = head2.next;
			 } 	
		 }
		 // one list id over
		 if(head1!=null) {
			 tail.next = head1;
		 }else {
			 tail.next = head2;
		 }
//		 System.out.println("dasda" + head.data);
		 return head;
	    }
	// VVi Revrse Linked List revise throughly
	// Need to memorize this beacause i am forgetting things
	public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head){
		LinkedListNode<Integer> ci=head;
		LinkedListNode<Integer> prev = null;
		LinkedListNode<Integer> nextEl = null;
		while(ci!=null) {
			
			nextEl = ci.next;
			ci.next = prev;
			prev = ci;
			ci = nextEl;
		}
		head = prev;
		return head;
	}
	
	 public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
	        //Your code goes here
		 LinkedListNode<Integer> fNode = head;
		 LinkedListNode<Integer> sNode = head;
		 LinkedListNode<Integer> temp = head;
		while(true) {
			if(fNode == null || fNode.next == null || fNode.next.next==null) {
				return sNode;
			}
			sNode = sNode.next;
			fNode = fNode.next.next;
		}
	 }
	// Best Way
	public static LinkedListNode<Integer> reverseLinkedListRecBestWay(LinkedListNode<Integer> head) {
		if(head == null || head.next == null) {
			return head;
		}
		 LinkedListNode<Integer> smallhead =  reverseLinkedListRecBestWay(head.next);
		 LinkedListNode<Integer> tailRev = head.next;
		 tailRev.next = head;
		 head.next = null;
		 return smallhead;
		 
	}
	public static LinkedListNode<Integer> callReverseLinkedListRecBetter(LinkedListNode<Integer> head) {
		DoubleNode dd= reverseLinkedListRecBetter(head);
		return dd.head;
	}
	public static DoubleNode reverseLinkedListRecBetter(LinkedListNode<Integer> head) {
		DoubleNode ans;
		if(head == null || head.next == null) {
			ans = new DoubleNode();
			ans.head = head;
			ans.tail = head;
			return ans;
		}
		DoubleNode smallhead = reverseLinkedListRecBetter(head.next);
		smallhead.tail.next = head;
		head.next = null;
		ans = new DoubleNode(smallhead.head,head);
		return ans;
	}
	
	public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
		if(head == null) {
			return head;
		}
		//Your code goes here
		if(head.next == null ) {
			return head;
		}
		LinkedListNode<Integer> smallHead =  reverseLinkedListRec(head.next);
		LinkedListNode<Integer> tail = smallHead;
		while(tail.next!=null)
		{
			tail = tail.next;
		}
		tail.next = head;
		head.next = null;
		return smallHead;
	}
	// Revrse Linked List revise throughly
	public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
		if(head == null ) {
			return head;
		}
    	//Your code goes here
		if(pos ==0) {
			head = head.next;
			return head;
		}
		
		LinkedListNode<Integer> smallHead = deleteNodeRec(head.next, pos-1);
//		System.out.println();
		head.next = smallHead;
		return head;
	}
	
	// REvision
	private static LinkedListNode<Integer> insertLLUsingRecActuallSol1day(LinkedListNode<Integer> head, int num, int pos) {
		if(head == null && pos>0) {
			return head;
		}
		if(pos == 0) {
			LinkedListNode<Integer> newNode = new LinkedListNode<>(num);
			newNode.next = head;
			return newNode;
		}else {
			LinkedListNode<Integer> smallHead =  insertLLUsingRecActuallSol1day(head.next, num, pos-1);
			head.next =  smallHead;
			return head;
		}
	
	}
// NEED TO WATCH again
	private static LinkedListNode<Integer> insertLLUsingRecActuallSol(LinkedListNode<Integer> head, int num, int pos) {
			if(head == null && pos>0) {
				return head;
			}
			if(pos ==0) {
				LinkedListNode<Integer> newNode = new LinkedListNode<>(num);
				newNode.next = head;
				return newNode;
			}else {
//				LinkedListNode<Integer>smallHead = insertLLUsingRec(head.next, num, pos-1);
//				head.next = smallHead;
				head.next = insertLLUsingRec(head.next, num, pos-1);
				return head;
			}
	}
	
	private static LinkedListNode<Integer> insertLLUsingRec(LinkedListNode<Integer> head, int num, int pos) {
		// TODO Need toRevise there is some mistake here
		if(head == null && pos>0) {
			return head;
		}
		if(pos == 0) {
			LinkedListNode<Integer> cNode = new LinkedListNode<>(num);
			cNode.next = head;
			head = cNode;
			return head;
		}
		
		
		if(pos == 1) {
			LinkedListNode<Integer> cNode = new LinkedListNode<>(num);
			cNode.next = head.next;
			head.next = cNode;
			System.out.println("test");
			//printLlUsingRecursion(head);
			
			return head;
		}
		LinkedListNode<Integer>hedele = insertLLUsingRec(head.next,num,pos-1);
		System.out.println(head.data + " ->" + hedele.data);
		head.next = hedele;
		return head;
		
	}


	private static void printLlUsingRecursion(LinkedListNode<Integer> head) {
		// TODO Auto-generated method stub
		if(head == null) {
			return ;
		}
		System.out.print(head.data + " ");
		printLlUsingRecursion(head.next);
	}

	private static LinkedListNode<Integer> takeInput() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
	
		while(data!=-1)
		{
			LinkedListNode<Integer> cn = new LinkedListNode<>(data);
			if(head ==null)
			{
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
