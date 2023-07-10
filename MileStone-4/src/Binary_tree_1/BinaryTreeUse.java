package Binary_tree_1;

import java.util.Scanner;

public class BinaryTreeUse {
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
	
	
public static void printTree(BinaryTreeNode<Integer> root) {
		if(root ==null) {
			return;
		}
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);
	/*System.out.println(root.data);
	if(root.left!=null) {
		printTree(root.left);
	}
	if(root.right!=null) {
		printTree(root.right);
	}*/
}
public static BinaryTreeNode<Integer>  TakeTreeInputByMe() {
	Scanner s = new Scanner(System.in);
	System.out.println("enter root");
	int data = s.nextInt();
	BinaryTreeNode<Integer> root = null;
	if(data==-1) {
		return root;
	}else {
		root=new BinaryTreeNode<Integer>(data);
	}
	BinaryTreeNode<Integer>leftRoot = TakeTreeInputByMe();
	BinaryTreeNode<Integer>rightroot = TakeTreeInputByMe();
	root.left = leftRoot;
	root.right = rightroot;
	return root;
}

//sir's way
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
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
//		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
//		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
//		root.left = rootLeft;
//		root.right = rootRight;
//		printTreeDetail(root);
//		printTree(root);
//		BinaryTreeNode<Integer> twoRightch = new BinaryTreeNode<Integer>(4);
//		BinaryTreeNode<Integer> threeLeftch= new BinaryTreeNode<Integer>(5);
//		rootLeft.right = twoRightch;
//		rootRight.left = threeLeftch;
//		BinaryTreeNode<Integer> root= TakeTreeInputByMe();
//		printTreeDetail(root);
//		BinaryTreeNode<Integer> root= TakeTreeInput();
//		printTreeDetail(root);
		BinaryTreeNode<Integer> root= TakeTreeInputBetter(true,0,true);
//		printTreeDetail(root);
//		System.out.println(numNodes(root));
		//System.out.println(getSum(root));
		//preOrder(root);
//		System.out.println(largentInTree(root));
//		System.out.println(countNodesGreaterThanX(root,5));
//		System.out.println(height(root));
//		System.out.println(leafCountNode(root));
//		depthOftree(root,2);
//		changeToDepthTree(root);
//		System.out.println(isNodePresent(root,3));
		printNodesWithoutSibling(root);
	}
	// number of node
	public static int  numNodes(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int lSum =numNodes(root.left);
		int rSum =numNodes(root.right);
		
		
		int nunod =lSum + rSum;
		System.out.println("otal" + nunod);
		return nunod+1;
		
	}
	// sum of node
	public static int getSum(BinaryTreeNode<Integer> root) {
		//Your code goes here.
		if(root==null) {
			return 0;
		}
		int leftData = getSum(root.left);
		int rightData = getSum(root.right);
		int rootData = root.data;
		
		int sum = leftData+rightData+rootData;
		return sum;
	}
	
	public static void preOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root ==null) {
			return;
		}
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
		
		
	}
	//post order
	public static void postOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root ==null) {
			return;
		}
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
	}
// inorder
	public static void inOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root ==null) {
			return;
		}
		
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
		
	}
	public static int  largentInTree(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root ==null) {
			return -1;
		}
		
		int leftLarg = largentInTree(root.left);
		int largRig = largentInTree(root.right);
		// comapring 
		int max=Math.max(root.data, Math.max(leftLarg, largRig));
		return max;
		
	}
	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		//Your code goes here
		if(root==null) {
			return 0;
		}
		int leftcount = countNodesGreaterThanX(root.left,x);
		int rightcount = countNodesGreaterThanX(root.right,x);
		int inc=0;
		if(root.data>x) {
			inc++;
		}
		int ans = leftcount+rightcount+inc;
		return ans;
	}
	public static int height(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root==null) {
			return 0;
		}
		int lhei = height(root.left);
		int rhei = height(root.right);
		int height = Math.max(lhei, rhei);
		return height+1;
	}
	// done by me
	public static int leafCountNode(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root==null) {
			return 0;
		}
		if(root.left ==null && root.right==null) {
			return 1;
		}
		
		int lhei = leafCountNode(root.left);
		int rhei = leafCountNode(root.right);
		int numOfNode = lhei+rhei;
		return numOfNode;
	}
	public static void depthOftree(BinaryTreeNode<Integer> root,int k) {
		//Your code goes here
		if(root==null) {
			return;
		}
		if(k==0) {
			System.out.println(root.data);
			return;
		}
		
		
		depthOftree(root.left,k-1);
		depthOftree(root.right,k-1);
	
	}
	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
	    //Your code goes here

		replaceNode(root,0);
		inOrderPrint(root);
	}


	private static void replaceNode(BinaryTreeNode<Integer> root, int i) {
		// TODO Auto-generated method stub
		if(root==null) {
			return;
		}
		root.data = i;
		replaceNode(root.left,i+1);
		replaceNode(root.right, i+1);
		
	}
	public static void inOrderPrint(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root ==null) {
			return;
		}
		
		inOrderPrint(root.left);
		System.out.println(root.data);
		inOrderPrint(root.right);
		
	}
	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	    //Your code goes here
		if(root==null) {
			return false;
		}
		if(root.data ==x) {
			return true;
		}
	boolean	leftPres = isNodePresent(root.left, x);
	boolean	rightPres =	isNodePresent(root.right, x);
	if(!leftPres && !rightPres) {
		return false;
	}
	return true;
	}
	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root==null) {
			return;
		}
		if(root.left==null && root.right!=null) {
			System.out.println(root.right.data);
		}else if(root.right==null && root.left!=null) {
			System.out.println(root.left.data);
		}
		printNodesWithoutSibling(root.left);
		printNodesWithoutSibling(root.right);
	}
}
