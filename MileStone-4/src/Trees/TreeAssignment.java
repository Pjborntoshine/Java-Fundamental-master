package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeAssignment {

	public static TreeNode<Integer> takeInput() {
		Scanner s = new Scanner(System.in);
		Queue<TreeNode<Integer>> pendngQueue = new LinkedList<>();
		System.out.println("Enter root Data");
		int rootData = s.nextInt();
		if(rootData==-1) {
			return null;
		}
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendngQueue.add(root);
		while(!pendngQueue.isEmpty()) {
			TreeNode<Integer> front = pendngQueue.poll();
			System.out.println("Enter no of children for:" + front.data);
			int numChild = s.nextInt();
			for(int i=0;i<numChild;i++) {
				System.out.println("Enter the " + i +"th child data for:" + front.data);
				int childData = s.nextInt();
				TreeNode<Integer> childNode = new TreeNode<Integer>(childData);
				front.children.add(childNode);
				pendngQueue.add(childNode);
			}
		}
		return root;
	}
	
	
	
	public static void printLevelWise(TreeNode<Integer> root){
		
		if(root == null) {
			return ;
		}
		Queue<TreeNode<Integer>> penNode = new LinkedList<>();
		penNode.add(root);
		System.out.println(root.data);
		penNode.add(null);
		while(!penNode.isEmpty()) {
			TreeNode<Integer> frnt = penNode.poll();
			if(frnt == null) {
				if(penNode.isEmpty()) {
					break;	
				}else {
					System.out.println("");
					penNode.add(null);
				}
				
			}else {
				for(int i=0;i<frnt.children.size();i++) {
					System.out.print(frnt.children.get(i).data + " ");
					penNode.add(frnt.children.get(i));
				}
			}
		
			
			
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root =  takeInput();
//		System.out.println(checkIfContainsX(root,40));
		//System.out.println(maxSumNode(root).data);
//		System.out.println(findNextLargerNode(root,18).data);
//		System.out.println(findSecondLargest(root).data);
//		System.out.println(countLeafNodes(root));
		replaceWithDepthValue(root);
		printLevelWise(root);
	}
	
	
	/************ start Replace node with depth
	 * 
	 */
	
	static int track=0;
	public static void replaceWithDepthValue(TreeNode<Integer> root){

		// Write your code here
		if(root == null) {
			return ;
		}
		
		Queue<TreeNode<Integer>> penNode = new LinkedList<TreeNode<Integer>>();
		root.data = track;
		penNode.add(root);
		penNode.add(null);
//		System.out.println(track);
		track++;
		while(!penNode.isEmpty()) {
			TreeNode<Integer> rData = penNode.poll();
			if(rData == null) {
				if(penNode.isEmpty()) {
					break;
				}else {
					track +=1;
					//System.out.println();
					penNode.add(null);
				}
			}else {
				for(int i=0;i<rData.children.size();i++) {
					//System.out.print(track + " ");
					rData.children.get(i).data = track;
					penNode.add(rData.children.get(i));
				}
			}
		}
		
//		for(int i=0;i<root.children.size();i++) {
//			replaceWithDepthValue(root.children.get(i));
//		}
		
		
	}
	
	
	
	/************ end Replace node with depth
	 * 
	 */
	
	
	
	/************ start Count leaf Nodes
	 * 
	 */
	

	public static int countLeafNodes(TreeNode<Integer> root){
		// Write your code here
		if(root == null) {
			return 0;
		}
		int ans = 0;
		if(root.children.size() == 0) {
			ans+=1;
			
		}
		for(int i=0;i<root.children.size();i++) {
			 ans +=  countLeafNodes(root.children.get(i));
		}
		return  ans;
	}
	
	
	
	/************ end Count leaf Nodes
	 * 
	 */
	
	/************ Second Largest Element In Tree
	 * 
	 */
	
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
		// Write your code here
		SecLargWrapp secLarWrp = findSecondLargestHelper(root);
		System.out.println(secLarWrp.large.data + " == ");
		return secLarWrp.sec;

	}
	
	private static SecLargWrapp findSecondLargestHelper(TreeNode<Integer> root) {
		SecLargWrapp ans = new SecLargWrapp(); 
		if(root == null) {
			ans.large = new TreeNode(Integer.MIN_VALUE);
			ans.sec = new TreeNode(Integer.MIN_VALUE);
			return ans;
		}
		ans.large = root;
		ans.sec = null;
		for(int i=0;i<root.children.size();i++) {
			SecLargWrapp retc= findSecondLargestHelper(root.children.get(i));
			
			if(root.data < retc.large.data) {
				//1.cond root< child
				ans.large = retc.large;
			}
			
			
				if(retc.sec == null) {
					ans.sec = root;
				}else if(root.data> retc.sec.data) {
					
				}

			

		
		}
		return ans;
	}
	/************ Second Largest Element In Tree
	 * 
	 */
	
	
	

	/*** Start Next larger element ***/
	
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		TreeNode<Integer> ans = null;
		if(root == null) {
			return ans;
		}
		
		if(root.data>n) {
			ans = root;
		}else {
			ans = null;
		}
			for(int i =0;i<root.children.size();i++) {
				TreeNode<Integer> retNode = findNextLargerNode(root.children.get(i),n);
				
				if(retNode!=null) {
					//System.out.println("retNode" + retNode.data);
					// need to rember
					if(ans == null || ans.data>retNode.data) {
						ans = retNode;
					}
				}
				
		 }
			
		
		return ans;
	}
	
	
	
//	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
//		// Write your code here
//		if(root == null) {
//			return null;
//		}
//		findNextLargerNodeHelpercl ans= findNextLargerNodeHelper(root,n);
//		return ans.node;
//	}
//	
//	private static findNextLargerNodeHelpercl findNextLargerNodeHelper(TreeNode<Integer> root, int n) {
//		// TODO Auto-generated method stub
//		findNextLargerNodeHelpercl an = new findNextLargerNodeHelpercl();
//		if(root.data>x) {
//			an.node = root;
//			int sub = root.data - n;
//			an.diff = sub;
//		}else {
//			an.node = null;
//			
//		}
//		
//		System.out.println("sub " + sub + " rd " + root.data);
//		
//		for(int i=0;i<root.children.size();i++) {
//			findNextLargerNodeHelpercl ret=	findNextLargerNodeHelper(root.children.get(i),n);
//			
//			if(ret.diff<an.diff ) {
//				System.out.println("aaaaa - " + ret.diff);
//				an = ret;
//			}
//		}
//		System.out.println("an -- " + an.diff +"--=="+ an.node.data);
//		return an;
//	}

	
	/*** END Next larger element ***/
	

	/******* start Structurally identical **/
	
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){
		boolean ans = true;
		if(root1.data != root2.data) {
			return false;
		}
		for(int i=0;i<root1.children.size();i++) {
			boolean ans2= checkIdentical(root1.children.get(i), root2.children.get(i));
			if(!ans2) {
				return false;
			}
		}
		return ans;
		// Write your code here
//		boolean ans = false;
//		if(root1.children.size() == root2.children.size()) {
//			for(int i=0;i<root1.children.size();i++) {
//				if(root1.children.get(i).data == root2.children.get(i).data) {
//					ans = true;
//				}
//			}
//			for(int i=0;i<root1.children.size();i++) {
//				boolean ans2= checkIdentical(root1.children.get(i), root2.children.get(i));
//				if(!ans2) {
//					return false;
//				}
//			}
//		}
//		else {
//			return false;
//		}
//	
//		
//		return ans;
	}
	
	/******* End Structurally identical **/
	
	
	/******* start Node having sum of children and node is max **/
	
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		// Write your code here
		maxSumHelper ans =  maxSumNodehelper(root);
		System.out.println("----"+ ans.sum);
		return ans.maxnode;
	}
	
	private static maxSumHelper maxSumNodehelper(TreeNode<Integer> root) {
		// TODO Auto-generated method stub
		if(root == null) {
			maxSumHelper ssh = new maxSumHelper(null, Integer.MIN_VALUE);
			return ssh;
		}
		
		maxSumHelper ans = new maxSumHelper();
		
		
		int sum=root.data;
		for(int i =0;i<root.children.size();i++) {
			sum+= root.children.get(i).data;
		}
		ans.maxnode = root;
		ans.sum = sum;
		for(int i =0;i<root.children.size();i++) {
			maxSumHelper ssh2 = maxSumNodehelper(root.children.get(i));
			// comparing with sum;
			if(ssh2.sum>ans.sum) {
				ans = ssh2;
			}
		}
		//System.out.println("test reruen " + ssh2.sum + " === "+ ssh2.maxnode);
		return ans;
	}

	
	
	/******* end Node having sum of children and node is max **/
	

	/*******Start Check if generic tree contain element x******  */
	
	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
		// Write your code here
		if(root == null) {
			return false;
		}
		boolean retVal = false;
		if(root.data == x) {
			retVal = true;
			return retVal;
		}
	
		for(int i=0;i<root.children.size();i++) {
			retVal =  checkIfContainsX(root.children.get(i),x);
			if(retVal == true) {
				return true;
			}
		}
		return retVal ;
	}
	
	/*******End Check if generic tree contain element x******  */
	

}
