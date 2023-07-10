package LinkedList_2;

import java.util.LinkedList;
import java.util.Scanner;



public class LLuseAssignment {
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
	private static void printLlUsingRecursion(LinkedListNode<Integer> head) {
		// TODO Auto-generated method stub
		if(head == null) {
			return ;
		}
		System.out.print(head.data + " ");
		printLlUsingRecursion(head.next);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode<Integer>head = takeInput();
//		printLlUsingRecursion(head);
//		int ans = findNodeRec(head,20010);
//		System.out.println(ans);
//		LinkedListNode<Integer> he=	evenAfterOdd(head);
//		printLlUsingRecursion(he);
//		LinkedListNode<Integer> he=	skipMdeleteN(head,2,3);
//		printLlUsingRecursion(he);
//		LinkedListNode<Integer> headTt =  swapNodes(head,3,4);
//		printLlUsingRecursion(headTt);
//		LinkedListNode<Integer> headTt =  kReverse(head,3);
//		System.out.println();
//		printLlUsingRecursion(headTt);
//		LinkedListNode<Integer> headTt =  bubbleSort(head);
//		System.out.println();
//		printLlUsingRecursion(headTt);
		deleteAlternateNodes(head);
	}
	
	// deleteAlternateNodes
	 public static void deleteAlternateNodes(LinkedListNode<Integer> head) {
	        //Your code goes here
		 LinkedListNode<Integer> temp = head;
		 LinkedListNode<Integer> anshead = null;
		 LinkedListNode<Integer> ansTail = null;
		 while( temp!=null && temp.next!=null ) {
			 temp.next = temp.next.next;
			 
			 temp = temp.next;
			 
			 
			 
//			 LinkedListNode<Integer> cn = new LinkedListNode<>(temp.data);
//			 if(anshead==null) {
//				 anshead = cn;
//				 ansTail = anshead;
//			 }else {
//				 ansTail.next =cn;
//				 ansTail = cn;
//			 }
//			 temp = temp.next.next;
		 }
		 printLlUsingRecursion(head);
	 }
	
	
	
	
	// need to d againg vvvi
//	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
//		LinkedListNode<Integer> h;
//		
//		while(t1!=null) {
//			while(t2!=null) {
//				LinkedListNode<Integer> t2 =t1.next;
//				if(t1.data > t2.data) {
//					LinkedListNode<Integer> ht= swapp(t1 , t2);
//				}
//				
//			}
//			t1 = t1.next;
//		}
//		return null;
//	}
	
	
	
	
	
	private static LinkedListNode<Integer> swapp(LinkedListNode<Integer> data, LinkedListNode<Integer> data2) {
		// TODO Auto-generated method stub
		LinkedListNode<Integer> temp = data2;
		data2.next = data;
		data.next = temp;
		System.out.println(data2.data + " " + data.data);
		
		return null;
	}
	//2 7 4 1 5 3 -1
//	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
//		//Your code goes here
//		LinkedListNode<Integer> t1 = head;
//		LinkedListNode<Integer> t2prev =null;
//		
//		while(t1!=null) {
//			int elem = t1.data;
//			t2prev =t1;
//			System.out.println(t2prev.data+" -->");
//			LinkedListNode<Integer> t2 = t1.next;
//			System.out.println(t2prev.data);
//			while(t2!=null) {
//				int ele2 = t2.data;
//				if(elem>ele2) {
//					t2prev = t2prev.next;
//					System.out.println("---" + t2prev.data);
//					t2 = t2.next;
//					System.out.println(elem + ">" + ele2 + " " + t2prev.data);
//				}else {
//					//t1.next = t2;
//					
//					break;
//				}
//					
//			}
//			t1 = t1.next;
//		}
//		return head;
//	}
	
	
	
	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
		if(k ==0) {
			return head;
		}
		LinkedListNode<Integer> headNode = kRev(head,head,k);
		return headNode;
	
	}
	private static LinkedListNode<Integer> kRev(LinkedListNode<Integer> head, LinkedListNode<Integer> head2, int k) {
		// TODO Auto-generated method stub
		
		LinkedListNode<Integer> temp = head;
		LinkedListNode<Integer> h1 = temp;
		LinkedListNode<Integer> t1 = h1;
		LinkedListNode<Integer> newHead = null;
		int i=1;
		while(temp!=null) {
			
			if(i==k) {
				newHead = t1.next;
				t1.next = null;
				
				break;
			}
			t1 = t1.next;
			i++;
			temp = temp.next;
		}
		// callinr rever
		LinkedListNode<Integer> headNode =  reverse(h1);
		
		printLlUsingRecursion(headNode);
		System.out.println();
		if(temp == null) {
			return headNode;
		}
		LinkedListNode<Integer> smallOp = kRev(newHead,headNode,k);
		//System.out.println(smallOp.data +" " +head.data + " " + headNode.data);
		LinkedListNode<Integer>tail = null;
		head.next = smallOp; 
		return headNode;
		
	}
//	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
//		//Your code goes here
//		LinkedListNode<Integer> newHead = head;
//		LinkedListNode<Integer> newtemp = null;
//		LinkedListNode<Integer> temp = head;
//		LinkedListNode<Integer> h1 = head;
//		LinkedListNode<Integer> t1= h1;
//		int i=0;
//		int inc = 0;
//		while(temp!=null) {
//			if(i<k-1) {
//				t1 = t1.next;
//				
//			}
//			if(i==k) {
//				LinkedListNode<Integer> tempNewHead = t1.next;
//				LinkedListNode<Integer> tempNewtail = t1.next;
//				t1.next = null;
//				LinkedListNode<Integer> head1 =  reverse(h1);
//				if(inc==0) {
//					newHead = head1;
//					newtemp = newHead;
//					inc++;
//					
//				}else {
//					while(newtemp.next!=null) {
////						System.out.println("" + newtemp.data);
//						newtemp = newtemp.next;
//					}
//					newtemp =head1;
//				}
//				printLlUsingRecursion(head1);
//				System.out.println();
//				h1 = tempNewHead;
//				t1 = tempNewtail;
//				i=-1;
//			}
//			i++;
//			
//			temp = temp.next;
//		}
//		
//		return head;
//	}

	
	// calling reverse function
	public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
		
		if(head == null || head.next == null) {
			return head;
		}
		 LinkedListNode<Integer> smallhead =  reverse(head.next);
		 LinkedListNode<Integer> tailRev = head.next;
		 tailRev.next = head;
		 head.next = null;
		 return smallhead;
	}
	public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
		//Your code goes here
		LinkedListNode<Integer> test = new LinkedListNode<>(12);
		LinkedListNode<Integer> c1 = null;
		LinkedListNode<Integer> c2 = null;
		LinkedListNode<Integer> p1 = null;
		LinkedListNode<Integer> p2 = null;
		LinkedListNode<Integer> temp=head;
		
		int is = 0;
		int js=0;
		while(temp!=null) {
			
			if(is == i-1) {
				
				c1 = temp.next;
				p1 = temp;
			}
			if(js == j-1) {
				c2 = temp.next;
				p2 = temp;
			}
			if(is == i && js ==j) {
				break;
			}
			is++;
			js++;
			temp = temp.next;
		}
		if(i == 0) {
			LinkedListNode<Integer> tt = head;
			LinkedListNode<Integer> ttc2 = c2.next;

			head = c2;
			head.next = tt.next;
			p2.next = tt;
			System.out.println(tt.data + " "+head.next.data +  " " +c2.data +" " + p2.next.data + " =>" + ttc2);
			tt.next = ttc2;
			return head;
		}
		if(j == 0) {
			LinkedListNode<Integer> tt = head;
			LinkedListNode<Integer> ttc2 = c1.next;

			head = c1;
			head.next = tt.next;
			p1.next = tt;
			tt.next = ttc2;
			return head;
		}
		p1.next = c2;
		p2.next = c1;
		LinkedListNode<Integer> temp2 = c1.next;
		c1.next = c2.next;
		c2.next = temp2;
		return head;
		
	}
	
	
	//Delete every N nodes TODO: NEED to revise this concept againg and again vvi
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
		//Your code goes here
		int retNod =0;//M;
		int delNode =0; //N;
		boolean	dele = false;
		LinkedListNode<Integer> temp = head;
		LinkedListNode<Integer> temp2 = null;
//		LinkedListNode<Integer> tailNode = hNode;
		while(temp!=null)
		{int i=1,j=0;
		while(i<M && temp.next!=null) {
			temp = temp.next;
			i++;
		}
		temp2 = temp;
		while(j<N && temp2.next!=null) {
			temp2 = temp2.next;
			j++;
		}
		temp.next = temp2.next;
		temp = temp.next;
			
			}
		return head;
	}
	
	//Even after Odd LinkedList
	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
		//Your code goes here
		 if(head == null){
	            return head;
	        }
		LinkedListNode<Integer> oddHead = null;
		LinkedListNode<Integer> oddTail = null;
		LinkedListNode<Integer> evenHead = null;
		LinkedListNode<Integer> evenTail = null;
		LinkedListNode<Integer> temp = head;
		while(temp!=null) {
			if(temp.data%2!=0) {
				if(oddHead==null) {
					oddHead = temp;
					oddTail = temp;
				}else {
					oddTail.next = temp;
					oddTail = temp;
				}
			}else if(temp.data %2==0){
				if(evenHead==null) {
					evenHead = temp;
					evenTail = temp;
				}else {
					evenTail.next = temp;
					evenTail = temp;
				}
			}
			temp = temp.next;
		}
		if(oddTail == null) {
			return evenHead;
		}else if(evenTail ==null) {
			return oddHead;
		}
		evenTail.next = null;
		oddTail.next = evenHead;
		return oddHead;
	}
	
	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
    	//Your code goes here
		int ans = findrec(head,n,0);
		return ans;
	}
	private static int findrec(LinkedListNode<Integer> head, int n, int i) {
		// TODO Auto-generated method stub
		if(head==null) {
			return -1;
		}
		if(head.data ==n) {
			return i;
		}
		int smallAns = findrec(head.next,n,i+1);
		return smallAns;
	}
}
