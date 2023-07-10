package Binsry_Tree_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Binary_tree_1.BinaryTreeNode;

public class BinTreeUser2 {
	class heightNdiametet{
		int height;
		
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
//		BinaryTreeNode<Integer> root= TakeTreeInputBetter(true,0,true);
//		printTreeDetail(root);
//		BinaryTreeNode<Integer> rootData=removeLeafNode(root);
//		BinaryTreeNode<Integer> rd = mirrorBinaryTree(root);
//		System.out.println("a-----");
//		
//		printTreeDetail(rd);
//		mirrorBinaryTree2(root);
	//System.out.println(checkBinaryTreeBalanced(root));
//		BalancedTreeReturn bt =  checkBinaryTreeBalancedBetter(root);
//		System.out.println(bt.isBalanced);
//		System.out.println(diameterOfBinaryTree(root));
		//TODO
//		BalancedTreeReturn bt =  diameterOfBinaryTreeBetter(root);
//		System.out.println(bt.height);
		//BinaryTreeNode<Integer>rootdata =  takeInputLevelWise();
//		printTreeDetail(rootdata);
		//printLevelWise(rootdata);
		int[] inOrder = new int[] {4,2,5,1,6,3,7};
		int[] preOrder = new int[] {1,2,4,5,3,6,7};
//		BinaryTreeNode<Integer> rd = buildTree(preOrder,inOrder);
//		printLevelWise(rd);
		int in2[] =  {4,8,2,5,1,6,7,3};
		int post[] = {8,4,5,2,6,7,3,1};
		BinaryTreeNode<Integer> root = buildTreeFrominNPost(post,in2);
		printLevelWise(root);
	}
	/*
	 * Start Construct Tree Using Inorder and PostOrder
	 */
	static int [] postOrderRef ;
	static int inc=0;
	public static BinaryTreeNode<Integer> buildTreeFrominNPost(int[] postOrder, int[] inOrder) {
		//Your code goes here
		postOrderRef = postOrder;
		inc = postOrder.length-1;
		BinaryTreeNode<Integer> root = buildTreeFrominNPostHelper(postOrder,inOrder,0,inOrder.length-1,0,postOrder.length-1);
		return root;
	}

	
	
		
	private static BinaryTreeNode<Integer> buildTreeFrominNPostHelper(int[] postOrder, int[] inOrder, int siIn,int enIn,int siPst,int eiPst) {
		// TODO Auto-generated method stub
		if(siIn>enIn||siPst>eiPst) {
			return null;
		}
		
		int rData = postOrder[eiPst];
		
		 
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rData);
		if (siIn == enIn)
            return root;
	
//		if(inc == 0) {
//			return root;
//		}
		
		// System.out.println("raData " + rData + " " + siIn + " " + enIn);
		int rootInd =-1;
		for(int i=0;i<=inOrder.length;i++) {
			if(inOrder[i] == rData) {
				rootInd = i;
				// System.out.println("ii" + i);
				break;
			}
		}
		// System.out.println( inOrder[rootInd]);
		//  node.left = buildUtil(in, post, inStrt, iIndex - 1, postStrt,postStrt - inStrt + iIndex - 1);
    //node.right = buildUtil(in, post, iIndex + 1, inEnd,postEnd - inEnd + iIndex,postEnd - 1);
		
		
		int siInLeft  = siIn;
		int eiInleft = rootInd -1;
		int siPstLeft  = siPst;
        int forriost=siPst+rootInd-siIn-1;
		// int forriost = siPst - siIn + rootInd -1;
		int eiPstLeft  = forriost;
//		
		int siInRight  = rootInd +1;
		int eiInRight = enIn;
		int siPstRight  =( eiPst - enIn )+ rootInd;
		int eiPstRight  = eiPst-1;
		// System.out.println("test" + siInLeft + " " + eiInleft +" "+siInRight + " " + " " + eiInRight);
		// root.left  = buildTreeFrominNPostHelper(postOrder,inOrder,siInLeft,eiInleft,siPstLeft,eiPstLeft);
		// root.right  = buildTreeFrominNPostHelper(postOrder,inOrder,siInRight,eiInRight,siPstRight,eiPstRight);
        root.left = buildTreeFrominNPostHelper(postOrder, inOrder, siPstLeft, eiPstLeft, siInLeft, eiInleft);
        root.right = buildTreeFrominNPostHelper(postOrder, inOrder, siPstRight, eiPstRight, siInRight, eiInRight);
       	return root;
	}




	/*
	 * End Construct Tree Using Inorder and PostOrder
	 */
	static int preOrderRef[];
	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		BinaryTreeNode<Integer> root =  buildTreeSol(preOrder,inOrder,0,preOrder.length,0,inOrder.length);
		//preOrderRef = preOrder;
//		BinaryTreeNode<Integer> root =  buildTreeSolByMe(preOrder,inOrder,0,inOrder.length-1,0);
		return root;
	}
	private static BinaryTreeNode<Integer> buildTreeSol(int pre[],int in[],int siPre,int eiPre,int siIn,int eiIn){
		if(siPre>eiPre) {
			return null;
		}
		int rootData = pre[siPre];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		int rootInd = -1;
		for(int i=siIn;i<=eiIn;i++) {
			if(in[i] == rootData) {
				rootInd = i;break;
			}
		}
		int siPreLeft = siPre+1;
		int siInLeft = siIn;
	
		int eiInLeft = rootInd -1;
		// right part
	
		int siInRight = rootInd +1;;
		int eiPreRight = eiPre;
		int eiInRight = eiIn;
		int leftSubTreeLength = eiInLeft - siInRight +1;
		int eiPreLeft = siPreLeft + leftSubTreeLength - 1;	
		int siPreRight = eiPreLeft +1;
		
		root.left =  buildTreeSol(pre,in,siPreLeft,eiPreLeft,siInLeft,eiInLeft);
		root.right =buildTreeSol(pre,in,siPreRight,eiPreRight,siInRight,eiInRight);
		return root;
	}
	
	static int preInc = -1;
	private static BinaryTreeNode<Integer> buildTreeSolByMe(int[] preOrder, int[] inOrder, int ist, int inen,int preInd) {
		// TODO Auto-generated method stub
//		System.out.println("--"+inOrder[ist] + "----" + inOrder[inen]);
		if(ist>inen) {
			return null;
		}
		
		int PreRoot = preOrder[preInd];
		if(preInd<inOrder.length-1) {
			preInd++;
		}

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(PreRoot);
		if(ist == inen ) {
			return root;
		}
		
		int inOrdInd =0;
		
		for(int i=ist;i<inen;i++) {
			if(PreRoot == inOrder[i]) {
				inOrdInd = i;
				break;
			}
		}
		
		int newInSt = inOrdInd-1;
		int newInEN = inOrdInd+1;
		root.left=	buildTreeSolByMe(preOrder,inOrder,0,newInSt,preInd);
		root.right=	buildTreeSolByMe(preOrder,inOrder,inOrdInd+1,inen,preInd);
		return root;
	}
	static int preOrderTrack = 0;
	private static BinaryTreeNode<Integer> buildTreeSol(int[] preOrder, int[] inOrder,int sinor,int enInor) {
		if(sinor>enInor) {
			return null;
		}
		
		int rootData = preOrder[preOrderTrack];
		if(preOrderTrack<inOrder.length-1) {
			preOrderTrack++;
		}
		
		//1.finding root
		int ri = 0;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		if(sinor == enInor) {
			return root;
		}
		// searching for left and right inorder
		for(int i=sinor;i<enInor;i++) {
			if(rootData == inOrder[i]) {					
				ri = i;
			}
		}
		//System.out.println("asda" + root.data + sinor +" " + enInor);
		root.left = buildTreeSol(preOrder, inOrder,sinor,ri-1);
		root.right = buildTreeSol(preOrder, inOrder,ri+1,enInor);
		return root;
		
	}
//	private static BinaryTreeNode<Integer>  buildTreeSol(int[] preOrder, int[] inOrder) {
//
//		// TODO Auto-generated method stub
//		if(inOrder.length == 1) {
//			BinaryTreeNode<Integer> bt =new BinaryTreeNode<Integer>(inOrder[0]); 
//			return bt;
//		}
//		// 1.finding the root data
//		int rootdata = preOrder[0];
//		System.out.println("rootData" + rootdata);
//		// 2.finding inorder or both left and right
//		// searching root in inOrder to get left and right
//		int inorderRootInd = 0;
//		for(int i =0;i<inOrder.length;i++) {
//			if(rootdata == inOrder[i]) {
//				inorderRootInd = i;
//			}
//		}
//		
//		int leftInorder[] = new int[inorderRootInd];
//		int rightInorder[]= new int[inOrder.length - inorderRootInd-1];
//		for(int i=0;i<leftInorder.length;i++) {
//			leftInorder[i] = inOrder[i];
//		
//		}
//		int sin = inorderRootInd+1;
//		int j=0;
//		while(sin<inOrder.length) {
//			rightInorder[j] = inOrder[sin];
//			j++;
//			sin++;
//		}
//		int[] leftPerOrder = new int[leftInorder.length];
//		int[] rightPreOrder = new int[rightInorder.length];
//		j=1;
//		for(int i=0;i<leftPerOrder.length;i++) {
//			leftInorder[i]=preOrder[j];
//			//System.out.println("dadasdad==>" + preOrder[j] + " " + leftInorder[i]);
//			j++;
//		}
//		int k=0;
//		for(int i=leftPerOrder.length+1;i<preOrder.length;i++) {
//			rightPreOrder[k] = preOrder[i];
//			k++;
//		}
//		
//		int stattpreord=k+1;
//		k=0;
//		for(int i=stattpreord;i<preOrder.length;i++) {
//			leftPerOrder[k] = preOrder[i];
//			System.out.println("asdasd--->" + leftPerOrder[k]);
//			k++;
//		
//		}
//		//int[] preOrder, int[] inOrder
//		BinaryTreeNode<Integer> leftData = buildTreeSol(leftPerOrder,leftInorder);
//		BinaryTreeNode<Integer> rigtData = buildTreeSol(rightPreOrder,rightInorder);
//		BinaryTreeNode<Integer> rootDataVal = null;
//		rootDataVal.data = rootdata;
//		rootDataVal.left = leftData;
//		rootDataVal.right = rigtData;
//		return rootDataVal;
//		
//	}
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root == null) {
			return ;
		}
		Queue<BinaryTreeNode<Integer>> pChild = new LinkedList<BinaryTreeNode<Integer>>();
		pChild.add(root);
		while(!pChild.isEmpty()) {
			BinaryTreeNode<Integer> front= pChild.poll();
			
			int rootData = front.data;
			int lData,rData;
			
			if(front.left!=null) {
				lData = front.left.data;
//				System.out.print("L:" + front.left.data);
				pChild.add(front.left);
				
			}else {
				lData = -1;
			}
			if(front.right!=null) {
//				System.out.print(",R:" + front.right.data);
				rData = front.right.data;
				pChild.add(front.right);
			}else {
				rData=-1;
			}
			System.out.println(rootData+":" +"L:"+ lData +",R:"+rData);
		}
	}
	
	
	public static BinaryTreeNode<Integer> takeInputLevelWise(){
			Scanner s = new Scanner(System.in);
			System.out.println("Enter root data");
			int rootData = s.nextInt();
			if(rootData == -1) {
				return null;
			}
			BinaryTreeNode<Integer> root =new  BinaryTreeNode<Integer>(rootData);
			Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
			pendingChildren.add(root);
			while(!pendingChildren.isEmpty()) {
				BinaryTreeNode<Integer> front =  pendingChildren.poll();
				System.out.println("Enter left child of" + front.data);
				int left = s.nextInt();
				if(left!=-1) {
					BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(left);
					front.left = leftChild;
					pendingChildren.add(leftChild);
				}
				
				System.out.println("Enter right child of" + front.data);
				int right = s.nextInt();
				if(right!=-1) {
					BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(right);
					front.right = rightChild;
					pendingChildren.add(rightChild);
				}
			}
			return root;
	}
	
	//TODO:https://www.geeksforgeeks.org/diameter-of-a-binary-tree/ and compleye this question 
//	public static BalancedTreeReturn diameterOfBinaryTreeBetter(BinaryTreeNode<Integer> root){
//		//Your code goes here
//		if(root == null) {
//			BalancedTreeReturn btanm = new BalancedTreeReturn();
//			btanm.height = 0;
//			return btanm;
//		}
//		BalancedTreeReturn ldiam =  diameterOfBinaryTreeBetter(root.left);
//		BalancedTreeReturn rdiam = diameterOfBinaryTreeBetter(root.right);
//		//geting 
//	}
	//T.C O(n2)
	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here
		if(root == null) {
			return 0;
		}
		
		int leheight = height(root.left);
		int rheight = height(root.right);
		 
		int ldiamerete = diameterOfBinaryTree(root.left);
		int rdiamerete = diameterOfBinaryTree(root.right);
		int ans = Math.max((leheight + rheight)+1, Math.max(ldiamerete, rdiamerete));
		return ans;
	}
	

	//Better time complexity O(n).
	public static BalancedTreeReturn checkBinaryTreeBalancedBetter(BinaryTreeNode<Integer> root) {
		if(root == null) {
			BalancedTreeReturn bt = new BalancedTreeReturn();
			bt.height=0;
			bt.isBalanced = true;
			return bt;
		}
//		if(root==null){
//            int height= 0;
//            boolean isBal= true;
//            BalancedTreeReturn ans= new BalancedTreeReturn();
//            ans.height= height;
//            ans.isBalanced= isBal;
//            return ans;
//          }
		
		BalancedTreeReturn leftop=  checkBinaryTreeBalancedBetter(root.left);
		BalancedTreeReturn rightop=  checkBinaryTreeBalancedBetter(root.right);
		BalancedTreeReturn bt = new BalancedTreeReturn();
		boolean isBal = true;
		int height = 1+Math.max(leftop.height, rightop.height);
		if(Math.abs(leftop.height-rightop.height)>1) {
			isBal = false;
		}
		if(!leftop.isBalanced || !rightop.isBalanced) {
			isBal = false;
		}
		bt.height = height;
		bt.isBalanced = isBal;
		return bt;
	}
	
	public static boolean checkBinaryTreeBalanced(BinaryTreeNode<Integer> root) {
		if(root ==null) {
			return true;
		}
		
	
	int liheight = height(root.left);
	int riHeight = height(root.right);
	if(Math.abs(liheight-riHeight)>1) {
		return false;
	}
	boolean isleftBal= checkBinaryTreeBalanced(root.left);
	boolean isrightBal=checkBinaryTreeBalanced(root.right);
	return isleftBal && isrightBal;
	}
	
	public static int height(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int leHi = height(root.left);
		int riHi = height(root.right);
		int maxHeingh = Math.max(leHi, riHi);
		return 1+maxHeingh;
	}
// remove Leaf node
	public static BinaryTreeNode<Integer> removeLeafNode(BinaryTreeNode<Integer> root) {
		if(root ==null) {
			return null;
		}
		if(root.left == null && root.right == null) {
			return null;
		}
	root.left=removeLeafNode(root.left);
	root.right=removeLeafNode(root.right);
		return root;
	}
	public static BinaryTreeNode<Integer> mirrorBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here
		if(root ==null) {
			return null;
		}
		if(root.left == null && root.right==null) {
			System.out.println(root.data);
		}
		mirrorBinaryTree(root.left);
		mirrorBinaryTree(root.right);
		BinaryTreeNode<Integer> temp = root.left;
		root.left = root.right;
		root.right = temp;
		return root;
	}
//	public static void mirrorBinaryTree2(BinaryTreeNode<Integer> root){
//		//Your code goes here
//		if(root ==null ||root.left ==null || root.right==null) {
//			return ;
//		}
//	
//		BinaryTreeNode<Integer> temp = root.left;
//		root.left = root.right;
//		root.right = temp;
//		System.out.print(root.left.data + " "+root.right.data);
//		System.out.println();
//		mirrorBinaryTree2(root.left);
//		mirrorBinaryTree2(root.right);
//		
//	}
}
