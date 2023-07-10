package BST_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Binary_tree_1.BinaryTreeNode;

public class BST2_Assign {
	public static BinaryTreeNode<Integer>  TakeTreeInput() {
		System.out.println("enter root");
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer>leftChild = TakeTreeInput();
		BinaryTreeNode<Integer>rightChild = TakeTreeInput();
		root.left = leftChild;
		root.right = rightChild;
		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root= TakeTreeInput();
		//ArrayList<LinkedListNode<Integer>> datas= constructLinkedListForEachLevel(root);
		//System.out.println(datas.size());
		//System.out.println(largestBSTSubtree(root));
		printNodesSumToS(root,12);
	}
	
	/*********3. Start Pair sum in a BST *************/
	
	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
		// Write your code here
		ArrayList<Integer> list  =  new ArrayList<Integer>();
		ArrayList<Integer> li2  = printNodesSumToSHelper(root,s,list);
//		System.out.println(li2.size());
//		for(int i=0;i<li2.size();i++) {
//			System.out.println(li2.get(i));
//			
//		}
		int i=0;int j = li2.size()-1;
		while(i<j) {
			int sEleme = li2.get(i) + li2.get(j);
			if(sEleme>s) {	
				j--;
			}else if(sEleme<s) {
				i++;
			}else if(sEleme == s) {
				System.out.println(li2.get(i) + " " + li2.get(j)); i++;j--;
			}
			
		}
	}

	
	private static ArrayList<Integer> printNodesSumToSHelper(BinaryTreeNode<Integer> root, int s,ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		if(root == null) {
			return list;
		}
		
		printNodesSumToSHelper(root.left, s,list);
		int rData = root.data;
		list.add(rData);
		printNodesSumToSHelper(root.right, s,list);
		return list;
	}
	/*********3. END Pair sum in a BST *************/
	/*********2. Start Level wise linkedlist*************/
	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		// Write your code here
		LargestBstHelp ans =  largestBSTSubtreeHelp(root);
		//System.out.println(ans.isBST + " " + ans.height + " " + ans.max + " " + ans.min );
		return ans.height;
	}
	private static LargestBstHelp largestBSTSubtreeHelp(BinaryTreeNode<Integer> root) {
		// Write your code here
		LargestBstHelp lbh = new LargestBstHelp();
		if(root == null) {
			//int min, int max, boolean isBST, int height
			lbh = new LargestBstHelp(Integer.MAX_VALUE,Integer.MIN_VALUE,true,0);return lbh;
			
		}
		LargestBstHelp leftAns = largestBSTSubtreeHelp(root.left);
		LargestBstHelp rgtAns = largestBSTSubtreeHelp(root.right);
		// checking if lest and right is BST
		boolean isbst = false;
		int height =0;
		int maxVal = Math.max(root.data, Math.max(leftAns.max, rgtAns.max));
		int minVal = Math.min(root.data, Math.min(leftAns.min, rgtAns.min));
		height = Math.max(leftAns.height, rgtAns.height);
		if(leftAns.isBST && rgtAns.isBST) {
			if(leftAns.max<root.data && rgtAns.min>=root.data) {
				isbst = true;
				height += 1;
			}
			
		}
			
		
		lbh = new LargestBstHelp(minVal, maxVal, isbst, height);
		return lbh;
		
	}
	/*********2. Start Level wise linkedlist************/
	
	
	
	/*********1. Start Level wise linkedlist**********
	 * 
	 * 
	 * **/
	public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
		// Write your code here
        if(root == null) {
			return null;
		}
    	// Write your code here
		ArrayList<LinkedListNode<Integer>> fLl= new ArrayList<LinkedListNode<Integer>>();
		
		Queue<BinaryTreeNode<Integer>> qu = new LinkedList<BinaryTreeNode<Integer>>();
		qu.add(root);
		qu.add(null);
		LinkedListNode<Integer> head =null;
		LinkedListNode<Integer> tail =null;
		
		//ll.add(root.data);
		
		while(!qu.isEmpty()) {
			
			BinaryTreeNode<Integer> front = qu.poll();
			if(front == null) {
				if(qu.isEmpty()) {
					break;
				}else {
					//fLl.add(head);
					head = null;
					tail = null;
					qu.add(null);
				}
			}else {
				//System.out.print(front.data +" ");
				if(front.left!=null) {
					qu.add(front.left);
				}
				if(front.right!=null) {
					qu.add(front.right);
				}
				int root1data= front.data;

				LinkedListNode<Integer> cNode = new LinkedListNode<Integer>(root1data);
				if(head == null) {
					head = cNode;
					tail = head;
                    fLl.add(head);
				}else {
					tail.next = cNode;
					tail = cNode;
				}
			}
			
		
			
		}
		
		return fLl;
	}
	/*********End Level wise linkedlist**********
	 * 
	 * 
	 * **/
	
}
