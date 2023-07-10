package Test_3;

import java.util.ArrayList;
import java.util.Scanner;

import Binary_tree_1.BinaryTreeNode;

public class CheckCousins {

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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root= TakeTreeInputBetter(true,0,true);
		System.out.println(isCousin(root,7,1));
//		printTreeDetail(root);
	}

	public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) {
		// Write your code here
		if(root ==null) {
			 return false;
		}
		
		// finding the leel of each node
		int leftlve = levelfi(root.left,p,1);
		int rgttlve = levelfi(root.right,q,1);
		System.out.println("ledtlev" + leftlve);
		if(leftlve == rgttlve && !sameParent(root,p,q)) {
			return true;
		}
		return false;
//		isCousinHep cl= isCousinhlper(root,p,q,0);
//		return cl.couOrNot;
	}
// TODO: didnt understand this sol need to do it by ur own today
	//Longest Leaf to root path
	public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root){
		// Write your code here
		if(root == null) {
			ArrayList<Integer> ans = new ArrayList<>();
			return ans;
		}	
	
		ArrayList<Integer> lft = longestRootToLeafPath(root.left);
		ArrayList<Integer> rgt =longestRootToLeafPath(root.right);
		if(lft.size() > rgt.size()) {
			lft.add(root.data);
		}else {
			rgt.add(root.data);
		}
		return (lft.size() >
        rgt.size() ? lft :rgt);
	}
	
	private static boolean sameParent(BinaryTreeNode<Integer> root, int p, int q) {
		// TODO Auto-generated method stub
		if(root == null) {
			return false;
		}
		// checking if root contain both p and q or not
		if(root.left!=null && root.right!=null) {
			if(root.left.data == p && root.right.data == q || root.left.data == q && root.right.data ==p) {
				return true;
			}
		}
		
		
		boolean lftchk = sameParent(root.left, p, q);
		boolean rgtchk = sameParent(root.right, p, q);
		if(lftchk || rgtchk) {
			return true;
		}
		return false;
	}

	private static int levelfi(BinaryTreeNode<Integer> root, int ele, int l) {
		// TODO Auto-generated method stub
		if(root == null) {
			return 0;
		}
		if(root.data == ele) {
			return l;
		}
		int lftl = levelfi(root.left, ele, l+1);
		if(lftl!=0) {
			return lftl;
		}
		
		return levelfi(root.right, ele, l+1);
	}

	// TODO:Need to try 
	
//	private static isCousinHep isCousinhlper(BinaryTreeNode<Integer> root, int p, int q,int l) {
//		// TODO Auto-generated method stub
//		isCousinHep ans;
//		if(root == null) {
//			 ans= new isCousinHep(-1, false);
//			return ans;
//		}
//		if(root.data == p || root.data == q) {
//		
//		}
//		isCousinHep lftch = isCousinhlper(root.left,p,q);
//		isCousinHep rgtch =  isCousinhlper(root.right, p, q);
//		ans.level = 	
//		return null;
//	}
}
