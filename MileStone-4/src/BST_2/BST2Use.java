package BST_2;

import java.util.ArrayList;
import java.util.Scanner;

import Binary_tree_1.BinaryTreeNode;

public class BST2Use {

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
		BinaryTreeNode<Integer> root = TakeTreeInput();
//		 ArrayList<Integer>  elemLi= nodeToRootPath(root,4);
//		 if(elemLi == null) {
//			 System.out.println("not Found");
//		 }
//		 for(int i : elemLi) {
//			 System.out.print(i + " ");
//		 }
		
		ArrayList<Integer>  elemLi= getPath(root,2);
		 if(elemLi == null) {
			 System.out.println("not Found");
		 }
		 for(int i : elemLi) {
			 System.out.print(i + " ");
		 }
		
	}
	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
		if(root == null) {
			 return null;
		}
		if(root.data == data) {
			ArrayList<Integer> rotli = new ArrayList<Integer>();
			rotli.add(root.data);
			return rotli;
		}
		if(root.data>data) {
			ArrayList<Integer>  lftli= getPath(root.left,data);
			lftli.add(root.data);
			return lftli;
		}else if(root.data<=data) {
			ArrayList<Integer>  rgtli= getPath(root.right,data);
			rgtli.add(root.data);
			return rgtli;
		}
		return null;
	}
	public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer> root,int x) {
		if(root ==null) {
			return null;
		}
		if(root.data == x) {
			ArrayList<Integer> alli = new ArrayList<Integer>();
			alli.add(root.data);
			return alli;
		}
		ArrayList<Integer> leftLi=nodeToRootPath(root.left,x);
		// adding the element to path
		if(leftLi!=null) {
			leftLi.add(root.data);
			return leftLi;
		}
		ArrayList<Integer> rightLi=nodeToRootPath(root.right,x);
		// adding the element to path
		if(rightLi!=null) {
			rightLi.add(root.data);
			return rightLi;
		}
		return null;
	}
}
