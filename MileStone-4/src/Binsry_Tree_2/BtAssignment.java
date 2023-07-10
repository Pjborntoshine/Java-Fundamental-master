package Binsry_Tree_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Binary_tree_1.BinaryTreeNode;

public class BtAssignment {
	
	public static BinaryTreeNode<Integer>  TakeTreeInputBetter(boolean isRoot,int parentData,boolean isLeft) {
		
		if(isRoot) {
			System.out.println("enter root data");
		}else {
			if(isLeft) {
				System.out.println("enter left child of" + parentData);
			}else {
				System.out.println("enter right child of" + parentData);
			}
		}
		
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer>leftChild = TakeTreeInputBetter(false,rootData,true);
		BinaryTreeNode<Integer>rightChild = TakeTreeInputBetter(false,rootData,false);
		root.left = leftChild;
		root.right = rightChild;
		return root;
	}
	public static void printTreeDetail(BinaryTreeNode<Integer> root) {
		if(root ==null) {
			return;
		}
		System.out.print(root.data+":");
		if(root.left!=null) {
			System.out.print("L"+root.left.data+", ");
		}
		if(root.right!=null) {
			System.out.print("R"+root.right.data);	
		}
		System.out.println();
		printTreeDetail(root.left);
		printTreeDetail(root.right);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root= TakeTreeInputBetter(true,0,true);
		//insertDuplicateNode(root);
//		Pair<Integer, Integer> rdata = getMinAndMax(root);
//		System.out.println(rdata.maximum);
//		System.out.println(rdata.minimum);
		//printLevelWise(root);
		//rootToLeafPathsSumToK(root,13);
		nodesAtDistanceK(root,5,2);
	}
	//Print nodes at distance k from node
//	public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k,int j) {
//	  
//	  
//	}
	static BinaryTreeNode<Integer> refNode = null;
	public static int nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
		if(root ==null) {
			return -1;
		}
		if(root.data == node) {
			// printing all node whick are k distance apar
			printKDistDatrt(root,k);
			return 0;
			
		}
		
		int ld = nodesAtDistanceK(root.left,node,k);
		// ceck ld ==-1 -> call rd
		if(ld!=-1) {
			if(ld==0) { // printing the node
				if(ld+1 == k) {
					System.out.print(root.data);
				}
			}else{
				int depth = k-ld-2;
				//int rd =nodesAtDistanceK(root.right,node,depth);
				printKDistDatrt(root,depth);
			}
			return ld+1;
		}
		
		
		int rd = nodesAtDistanceK(root.right,node,k);
		// ceck ld ==-1 -> call rd
		if(rd!=-1) {
			if(rd==0) { // printing the node
				if(rd+1 == k) {
					System.out.print(root.data);
				}
			}else{
				int depth = k-rd-2;
				printKDistDatrt(root,depth);
			}
			return rd+1;
		}
		return -1;
	
	}
	//Print nodes at distance k from node
	
	private static void printKDistDatrt(BinaryTreeNode<Integer> root, int k) {
		while(root!=null) {
			return;
		}
		
		if(k==0) {
			System.out.print(root.data + " ");
		}
		int l = k-1;
		printKDistDatrt(root.left,l);
		printKDistDatrt(root.right,l);
		
	}
	static LinkedList<Integer> ll = new LinkedList<Integer>();
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		rootToLeafPathsSumToK2(root, k, false);
		
	}
	public static void rootToLeafPathsSumToK2(BinaryTreeNode<Integer> root, int k, boolean printorNot) {
		//Your code goes here
		if(root == null) {						
			return;
		}	
		if(root.left == null && root.right == null) {
			ll.add(root.data);	
			int sumk = 0;
			for(int i=0;i<ll.size();i++) {
				sumk+= ll.get(i);
			}

				if(sumk == k) {
					for(int i=0;i<ll.size();i++) {
						System.out.print(ll.get(i) + " ");
					}
					System.out.println();
				}
				ll.removeLast();
			return;
		}
		ll.add(root.data);		
		rootToLeafPathsSumToK2(root.left,k,false);
		rootToLeafPathsSumToK2(root.right,k,true);
		ll.removeLast();
	
	}
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root == null) {
			return;
		}
	Queue<BinaryTreeNode<Integer>> btQueue = new LinkedList<>();
	btQueue.add(root);
	btQueue.add(null);
	while(!btQueue.isEmpty()) {
		BinaryTreeNode<Integer> front = btQueue.poll();
		if(front == null) {
			System.out.println("");

			if(btQueue.isEmpty()) {
				break;
			}else {
				btQueue.add(null);
			}
			
		}else {
			System.out.print(front.data +" ");
			if(front.left!=null) {
				btQueue.add(front.left);
			}
			if(front.right!=null) {
				btQueue.add(front.right);
			}
			
		}
		
		
	}

	}
	
	
	
	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root == null) {
			return ;
		}
		
		insertDuplicateNode(root.left);
		insertDuplicateNode(root.right);
		System.out.println("sda" + root.data + " " + root.left);
		BinaryTreeNode<Integer> leftData =new BinaryTreeNode<Integer>(root.data);
		BinaryTreeNode<Integer> templeft = root.left;
		root.left = leftData;
		leftData.left = templeft;
		printTreeDetail(root);
		System.out.println("***************");
	}
	
	public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if( root == null) {
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			Pair<Integer, Integer> pcll1 = new Pair<Integer, Integer>(min, max);
			return pcll1;
		}
		int leftData = -1;
		int rightdata = -1;
		if(root.left == null) {
			leftData = root.data;
		}else {
			leftData = root.left.data;
		}
		if(root.right == null) {
			rightdata = root.data;
		}else {
			rightdata = root.right.data;
		}
		
		int max = Math.max(root.data,Math.max(leftData, rightdata));
		int min = Math.min(root.data,Math.min(leftData, rightdata));
		
		
		Pair<Integer, Integer> pleft =getMinAndMax(root.left);
		Pair<Integer, Integer> rleft =getMinAndMax(root.right);
		//System.out.println(pleft.maximum + " "+ pleft.minimum);
		int newMin = Math.min(min, Math.min(pleft.minimum, rleft.minimum));
		int newMax = Math.max(max, Math.max(pleft.maximum, rleft.maximum));
		Pair<Integer, Integer> pcll = new Pair<Integer, Integer>(newMin, newMax);
		return pcll;
	}
}
