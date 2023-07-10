package BST_1;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

import Binary_tree_1.BinaryTreeNode;
class bstToLlHelp{
	LinkedListNode<Integer> head;
	LinkedListNode<Integer> tail;
	public bstToLlHelp(LinkedListNode<Integer> head, LinkedListNode<Integer> tail) {
		
		this.head = head;
		this.tail = tail;
	}
	
}
public class BSTUse {
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
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
//		BinaryTreeNode<Integer> rootleft = new BinaryTreeNode<Integer>(2);
//		BinaryTreeNode<Integer> rootright = new BinaryTreeNode<Integer>(3);
//		root.left = rootleft;
//		root.right = rootright;
		BinaryTreeNode<Integer> root= TakeTreeInput();
		//System.out.println(isBSTs(root));
//		elementsInRangeK1K2(root,6,8);
		//System.out.println(isBST(root));
//		int arr[] = {1,2, 3, 4, 5, 6, 7};
//		System.out.println(arr.length);
//		BinaryTreeNode<Integer> root =  SortedArrayToBST(arr,arr.length-1);
//		printTreeDetail(root);
		//IsBSTREturn ans = isBST2(root);
//		System.out.println(ans.min +" " + ans.max + " " + ans.isBST);
//		LinkedListNode<Integer> head =  constructLinkedListhelp2(root);
//		printLL(head);
//		System.out.println(getLCA(root,6,10));
		
		replaceWithLargerNodesSum(root);
	}
	/**********************Start Replace with Sum of greater nodes****************************
	 * 
	 */
	
	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		// Write your code here
		if(root == null) {
			return;
		}
		//replaceWithLargerNodesSum(root);
		int sum = sumNreplace(root,0);
//		System.out.println(root.data + "---" + sum);
//		replaceWithLargerNodesSum(root.left);
		printTreeDetail(root);

	}
	
	
	private static int sumNreplace(BinaryTreeNode<Integer> root,int sum) {
		// TODO Auto-generated method stub
		if(root == null) {
			return sum;
		}
		 sum = sumNreplace(root.right,sum);
		 sum+= root.data;
		 root.data = sum;
		//System.out.println("rd -- " + root.data);
		 sum = sumNreplace(root.left,sum);
		
		return sum;
	}

	/**********************END Replace with Sum of greater nodes****************************
	 * 
	 */
	private static void printLL(LinkedListNode<Integer> head) {
		// TODO Auto-generated method stub
		if(head == null ) {
			return;
		}
		LinkedListNode<Integer> temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	/**********************Start Assignment LCA of BST****************************
	 * https://www.geeksforgeeks.org/lowest-common-ancestor-in-a-binary-search-tree/  == help
	 * 
	 */
	public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
		if(a==-1 && b==-1) {
			return root.data;
		}
		int ans =  getLCA1(root,a,b);
		return ans;
	}
	
	public static int getLCA1(BinaryTreeNode<Integer> root, int a, int b) {
			if(root ==null) {
				return -1;
			}
			if(root.data>=a && root.data>=b) {
				// calling on right 
				return getLCA(root.left,a,b);
			}
			if(root.data<a && root.data<b) {
				// calling on right 
				return getLCA(root.right,a,b);
			}else {
				return root.data;
			}
			
				
			
		}

	
//		public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
//			if(root == null) {
//				return -1;
//			}
//			 LCAHelpClass  an = getLCAHelp(root,a,b);
//			return -1;
//		}
//		
//		private static LCAHelpClass getLCAHelp(BinaryTreeNode<Integer> root, int a, int b) {
//			// TODO Auto-generated method stub
//			if(root == null) {
//				LCAHelpClass lhc = new LCAHelpClass(-1,-1,-1,-1);
//				return lhc;
//			}
//			LCAHelpClass hl= new LCAHelpClass(); 
//			if(root.data == a) {
//				hl.ancA = root.data;
//			}
//			if(root.data == b) {
//				hl.ancB = root.data;
//			}
//			LCAHelpClass leftLch = getLCAHelp(root.left,a,b);
//			LCAHelpClass rgtLch = getLCAHelp(root.right,a,b);
//			if( leftLch.foundEleA == rgtLch.foundEleB) {
//				hl.foundEleA = leftLch.foundEleA;
//				hl.foundEleA = rgtLch.foundEleB;
//				return hl;
//			}
//			if( )
//			return null;
//		}
	
	/**********************Start Assignment LCA of BST****************************
	 * 
	 */
	
	

	/**********************Start Assignment SST TO LL****************************
	 * 
	 */
	
	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
		bstToLlHelp help=  constructLinkedListhelp(root);
		return help.head;
	}
	
	private static LinkedListNode<Integer> constructLinkedListhelp2(BinaryTreeNode<Integer> root) {
		if(root ==null)
		{
			LinkedListNode<Integer> ret = null;
			return ret;
		}
		LinkedListNode<Integer> rnode = new LinkedListNode<>();
		rnode.data = root.data;
		LinkedListNode<Integer> smll = constructLinkedListhelp2(root.left);
		
		LinkedListNode<Integer> smrl = constructLinkedListhelp2(root.right);
		LinkedListNode<Integer> temp = smll;
		if(smll ==null) {
			smll = rnode;
		}else {
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = rnode;
			
		}
		rnode.next = smrl;
		return smll;
	}
	public static boolean fl =false;
	private static bstToLlHelp constructLinkedListhelp(BinaryTreeNode<Integer> root) {
		// TODO Auto-generated method stub
		if(root ==null) {
			LinkedListNode<Integer> head = null;
			LinkedListNode<Integer> tail = null;
			bstToLlHelp bst = new bstToLlHelp(head, tail);
			return bst; 
		}
	
		
		bstToLlHelp leftcl =  constructLinkedListhelp(root.left);
		LinkedListNode<Integer> head =new LinkedListNode<Integer>();
		LinkedListNode<Integer> tail =new LinkedListNode<Integer>();
		//head.data = root.left.data;
		
		if(root.left==null && root.right ==null){
			if(!fl) {
				// we are root level
				head.data = root.left.data;
				tail.data = root.left.data;
			}else {
				tail.data = root.right.data;
			}
		
		}
		bstToLlHelp rightcl =constructLinkedListhelp(root.right);
		
		
		return null;
	}
	
	
	
	/**********************END Assignment SST TO LL****************************
	 * 
	 */
	

	/**********************Start Construct BST****************************
	 * 
	 */
	
	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
		BinaryTreeNode<Integer> root =  SortedArrayToBSTHelp(arr,n,0,arr.length-1);
		return root;
	}
	public static BinaryTreeNode<Integer> SortedArrayToBSTHelp(int[] arr, int n,int si,int ei){
		if(si > ei) {
			return null;
		}
		int mp = (si+ei)/2;
		//System.out.println("si" + si + "ei" + ei + "mp" + mp);
		int rootData = arr[mp];
		//System.out.println("rootData" + rootData);
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		root.left =  SortedArrayToBSTHelp(arr,n,si,mp-1);
		root.right =  SortedArrayToBSTHelp(arr,n,mp+1,ei);
		return root;
	}
	
	/**********************End Construct BST****************************
	 * 
	 */
	
	/**********************Start Check if binary tree is BST? ****************************
	 * 
	 */
	// sir's way method - 3
	public static boolean isBST3(BinaryTreeNode<Integer> root,int minRange,int maxRange) {
		if(root == null) {
			return true;
		}
		if(root.data<minRange || root.data>maxRange) {
			return false;
		}
		
		boolean isLeftWithRange = isBST3(root.left,minRange,root.data-1);
		boolean isRightWithRange = isBST3(root.right,root.data,maxRange);
		return isLeftWithRange && isRightWithRange;
	}
	// sir's way method - 2 (TODO:Need to check this SOl)
	public static IsBSTREturn isBST2(BinaryTreeNode<Integer> root) {
		if(root == null) {
			IsBSTREturn ans = new IsBSTREturn(Integer.MIN_VALUE, Integer.MAX_VALUE, true);
			return ans;
		}
		IsBSTREturn leftAns= isBST2(root.left);
		IsBSTREturn rightAns= isBST2(root.right);

         int min= Math.min(root.data, Math.min(leftAns.min, rightAns.min));
         int max= Math.max(root.data, Math.min(leftAns.max, rightAns.max));
         boolean isBST= true;
         if(leftAns.max>=root.data){
             isBST= false;
         }
         if(rightAns.min<root.data){
             isBST= false;
         }
         if(!leftAns.isBST){
             isBST= false;
         }
         if(rightAns.isBST){
             isBST= false;
         }
         IsBSTREturn ans = new IsBSTREturn(min,max,isBST);
         return ans;
		
	}
	// sir's way method - 1
	public static boolean isBSTs(BinaryTreeNode<Integer> root) {
		if(root ==null) {
			return true;
		}
		// finding maxLeft and comapre with root
		int leftMax = maxinumIntree(root.left);
		if(leftMax>=root.data) {
			return false;
		}
		int rightMin = minInRight(root.right);
		if(rightMin<root.data) {
			return false;
		}
		boolean isLeft = isBSTs(root.left);
		boolean isRight = isBSTs(root.right);
		return isLeft && isRight;
	}
	
	private static int minInRight(BinaryTreeNode<Integer> root) {
		if(root ==null) {
			return Integer.MAX_VALUE;
		}
		int leftData = minInRight(root.left);
		int rightData = minInRight(root.right);
		int retVal = Math.min(root.data, Math.min(leftData, rightData));
		return retVal;
	}

	private static int maxinumIntree(BinaryTreeNode<Integer> root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int left = maxinumIntree(root.left);
		int right = maxinumIntree(root.right);
		int retAns = Math.max(root.data,Math.max(left, right));
		return retAns;
	}

	public static boolean isBST(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return true;
		}
		boolean lflag = true,rflag = true;
		if(root.left!=null) {
			if(root.data>root.left.data) {
				lflag = true;
			}else {
				lflag = false;
			}
		}
		if(root.right!=null) {
			if(root.data<root.right.data) {
				rflag = true;
			}else {
				rflag = false;
			}
		}
			
			boolean fComp = false;
			if(lflag && rflag) {
				fComp = true;
			}
			boolean lRet= isBST(root.left);
			boolean rRet= isBST(root.right);
			if(fComp && lRet && rRet) {
				return true;
			}
			return false;
		
	}
	
	
	/**********************End Check if binary tree is BST? ****************************
	 * 
	 */
	
	
	/**********************Start Elements Between K1 and K2 ****************************
	 * 
	 */
	// sol by sir
	public static void printInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2){
		if(root == null) {
			return;
		}
		if(root.data<k1) {
			printInRangeK1K2(root.right,k1,k2);
		}else if(root.data>k2) {
			printInRangeK1K2(root.left,k1,k2);
		}else {
			System.out.print(root.data+" ");
			printInRangeK1K2(root.left,k1,k2);
			printInRangeK1K2(root.right,k1,k2);
		}
	}
	
	static LinkedList<Integer> op = new LinkedList<Integer>();
	public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2){
		elementsInRangeK1K2help(root,k1,k2);
		 Collections.sort(op);
		 for(int i=0;i<op.size();i++) {
//			 System.out.print(op.get(i)+" ");
		 }
	}
	public static void elementsInRangeK1K2help(BinaryTreeNode<Integer> root,int k1,int k2){
		if(root == null) {
			return;
		}
		if(root.data>=k1 && root.data<=k2) {
			//System.out.print(root.data + " ");
			op.add(root.data);
		}
			
		if(root.data<=k1) {
			elementsInRangeK1K2help(root.right,k1,k2);
		}else if(root.data>=k2) {
			elementsInRangeK1K2help(root.left,k1,k2);
		}
		else {
			elementsInRangeK1K2help(root.left,k1,k2);
			elementsInRangeK1K2help(root.right,k1,k2);
		}
	}
	/**********************End Elements Between K1 and K2 ****************************
	 * 
	 * @param root
	 * @param k
	 * @return
	 */
// Need to create take and print function in revision 2mmro evening
	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
		if(root ==null){
            return false;
        }
        
       if(k == root.data){
            return true;
        }
        else if(k<root.data){
           return searchInBST(root.left,k);
        }
         else if(k>root.data){
            return searchInBST(root.right,k);
        }
       return false;
	}
	
}
