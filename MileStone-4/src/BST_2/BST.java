package BST_2;

import org.w3c.dom.Node;

public class BST {
	private BinaryTreeNode<Integer> root;
	private int size;
	
	private static boolean isPresentHelper(BinaryTreeNode<Integer> node,int x) {
		if(node == null) {
			return false;
		}
		
		if(node.data == x) {
			return true;
		}
		if(x<node.data) {
			return isPresentHelper(node.left,x);
		}else {
			return isPresentHelper(node.right,x);
		}
	}
	public boolean isPresent(int x) {
		return isPresentHelper(root,x);
	
	}
	private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> node,int data) {
		if(node == null) {
			BinaryTreeNode<Integer> newNOde = new BinaryTreeNode<Integer>(data);
			return newNOde;
		}
		if(data<node.data) {
			// calling on left
			BinaryTreeNode<Integer> rleft= insertHelper(node.left,data);
			node.left = rleft;
		}
		else {
//			calling on right
			BinaryTreeNode<Integer> rrght=insertHelper(node.right,data);
			node.right =rrght;
		}
		return node;
	}
	
	public void insert(int x) {
		root =  insertHelper(root,x); // updating the root data
		size++;
	}
	/***** Delete in BST *****/
	
	/********* sir's way
	 * T.C- (h-k)
	 * 
	 */
	public boolean delete(int x) {
		BSTDeleteReturn output= deleteHelperSW(root,x);
		root = output.root;
		if(output.deleted) {
			size--;
		}
		
		return output.deleted;
	
	}
	
	private static BSTDeleteReturn deleteHelperSW(BinaryTreeNode<Integer> root,int x) {
		// case1: null
		if(root == null) {
			return new BSTDeleteReturn(null, false);
		}
		// case if root.data<x
		if(root.data<x) {
			BSTDeleteReturn outputRight = deleteHelperSW(root.right,x);
			root.right = outputRight.root; // assignning root.right to  outputRight.root value
			outputRight.root = root; // re assignning to 
			return outputRight;
			
		}
		if(root.data>x) {
			BSTDeleteReturn outputLeft = deleteHelperSW(root.left,x);
			root.left = outputLeft.root; // assignning root.right to  outputRight.root value
			outputLeft.root = root; // re assignning to 
			return outputLeft;
			
		}
		
		//0 child
		if(root.left == null && root.right == null) {
			return new BSTDeleteReturn(null, true);
		}
		// only left cild
		if(root.left!=null && root.right == null) {
			return new BSTDeleteReturn(root.left, true);
		}
		
		// only right cild
		if(root.left==null && root.right != null) {
			return new BSTDeleteReturn(root.right, true);
		}
		// when x== data
		int rgtMin =  MinInBst(root.right);
		root.data = rgtMin;
		// elemetating that elemente from tree
		BSTDeleteReturn outputRight =  deleteHelperSW(root.right,rgtMin);
		root.right = outputRight.root;
		return new BSTDeleteReturn(root, true); 
	}
	private static int MinInBst(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		int leftData = MinInBst(root.left);
		int rgtData = MinInBst(root.right);
		return Math.min(root.data,Math.min(leftData, rgtData));
	}
	/********* sir's way
	 * 
	 */
	
	/**************Done By Me
	 * 
	 * @author Rahul
	 *
	 */
	class deleteWrp{
		BinaryTreeNode<Integer> newRoot;
		boolean isDelete;
		public deleteWrp(BinaryTreeNode<Integer> newRoot, boolean isDelete) {
			
			this.newRoot = newRoot;
			this.isDelete = isDelete;
		}
		public deleteWrp() {
		// TODO Auto-generated constructor stub
		}
		
		
	}
	
	public boolean deleteme(int x) {
		deleteWrp dltWrp= deleteHelper(root,x);
		System.out.print( dltWrp.isDelete);
		root = dltWrp.newRoot;
		return dltWrp.isDelete;
	
	}
	
	private deleteWrp deleteHelper(BinaryTreeNode<Integer> node, int x) {
		// TODO Auto-generated method stub
		// cast 1 when node == null
		deleteWrp dlwrp = new deleteWrp();
		if(node ==null) {
			dlwrp = new deleteWrp(null,false); // not delete any thing from here
			return dlwrp;
		}
		// case 2:if node.data<x i.e x is greater then root.data
		if(node.data<x) {
			// do some 
			deleteWrp newRgt = deleteHelper(root.right,x);
			
			root.right = newRgt.newRoot;
			dlwrp = new deleteWrp(newRgt.newRoot,newRgt.isDelete);
			return dlwrp;
		}
		else  if(node.data>x){
			deleteWrp newLft = deleteHelper(root.left,x);
			root.left = newLft.newRoot;
			dlwrp = new deleteWrp(newLft.newRoot,newLft.isDelete);
			return dlwrp;
		}
		else  if(node.data==x) { // if we got the data 
			// s.Case-1
			if(node.left == null && node.right == null) { // when root is parent 
				dlwrp = new deleteWrp(null,true);
				return dlwrp;
			}else if(node.left == null) {
				dlwrp = new deleteWrp(node.right,true);
				return dlwrp;
			}else if(node.right == null) {
				dlwrp = new deleteWrp(node.left,true);
				return dlwrp;
			}else  {
				BinaryTreeNode<Integer> minRight = node.right;
				while(minRight.left!=null) {
					// getting minimum in right
					minRight = minRight.left;
				}
				//
				int y = minRight.data;
				node.data = minRight.data;
				deleteWrp dlwrppp=deleteHelper(root.right,y);
				dlwrp= new deleteWrp(dlwrppp.newRoot,true);
				
				return dlwrp;
			}
		}
		return dlwrp;
	}
	
	/**************Done By Me
	 * 
	 * @author Rahul
	 *
	 */
	
	public int size() {
		return size;
	}	
	private static void printHelper(BinaryTreeNode<Integer> node) {
	
		if(node ==null) {
			return;
		}
		System.out.print(node.data+":");
		if(node.left!=null) {
			System.out.print("L"+node.left.data+", ");
		}
		if(node.right!=null) {
			System.out.print("R"+node.right.data);	
		}
		System.out.println();
		printHelper(node.left);
		printHelper(node.right);
	}
//	Print function
	public void printTree() {
		printHelper(root);
	}
	
}
