package Trees;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeUse1 {
	//start numberOfNode
		public static int numberOfNode(TreeNode<Integer> root) {
			
			int count = 1;
			for(int i=0;i<root.children.size();i++) {
				 int childCount = numberOfNode(root.children.get(i));
				count += childCount;
			}
			return count;
			
		}
	//end numberOfNode
	
	
	// Start printing generic tree
	
	public static void printTree2(TreeNode<Integer> root) {
		if(root == null ) {
			return; // this is not base case it is spcial case i.e when root commming is null
		}
		// since there can a be case where root have no childen so it loop will act as base case here
		System.out.print(root.data +": ");
		
		for(int i=0;i<root.children.size();i++) {
			TreeNode<Integer> node= root.children.get(i);
			System.out.print(node.data+" ");
		}
		System.out.println();
		for(int i=0;i<root.children.size();i++) {
			TreeNode<Integer> node= root.children.get(i);
			printTree2(node);
		}
	}
	
	
	
	public static void printTree1(TreeNode<Integer> root) {
		if(root == null ) {
			return; // this is not base case it is spcial case i.e when root commming is null
		}
		// since there can a be case where root have no childen so it loop will act as base case here
		System.out.print(root.data +" ");
		for(int i=0;i<root.children.size();i++) {
			TreeNode<Integer> node= root.children.get(i);
			printTree1(node);
		}
	}
	
	
	//Start Take Input By Me
	public static TreeNode<Integer> takeInputByMe() {
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		if(rootData == -1) {
			return null;
		}
		TreeNode<Integer> rootNode = new TreeNode<>(rootData);
		Queue<TreeNode<Integer>> queueLi = new LinkedList<>();
		queueLi.add(rootNode);
		while(!queueLi.isEmpty()) {
			TreeNode<Integer> node =queueLi.poll();
			System.out.println("Enter No children  of " + node.data);
			int noChild = s.nextInt();
			for(int i=0;i<noChild;i++) {
				System.out.println("enter " + i + "th child of" + node.data);
				int childData = s.nextInt();
				TreeNode<Integer> nodeChild = new TreeNode<Integer>(childData);
				node.children.add(nodeChild);
				//putting into ququq
				queueLi.add(nodeChild);
			}
		}
		return rootNode;
	}
	//END Take Input By Me
	// Start TakeInput Sir way
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
	
	//End TakeInput Sir way
	
	// End printing generic tree
	
	//start Print Tree Level-wise
		
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
	
	
	//END Print Tree Level-wise
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = new TreeNode<Integer>(4);
		TreeNode<Integer> node1 = new TreeNode<Integer>(2);
		TreeNode<Integer> node2 = new TreeNode<Integer>(3);
		TreeNode<Integer> node3 = new TreeNode<Integer>(1);
		TreeNode<Integer> node4 = new TreeNode<Integer>(5);
		TreeNode<Integer> node5 = new TreeNode<Integer>(6);
		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);
		node2.children.add(node4);
		node2.children.add(node5);
		// hottinh print 
		//printTree1(root);
		printTree2(root);
		System.out.println("**********");
		System.out.println(numberOfNode( root));
		System.out.println("*************");
		System.out.println(sumOfAllNode(root));
		
		System.out.println("print input---------------");
//		TreeNode<Integer> rData = takeInputByMe();
//		printTree2(rData);
//		TreeNode<Integer> rData = takeInput();
//		printTree2(rData);
		//printLevelWise(root);
		//System.out.println(numNodeGreater(root,4));
		//System.out.println(getHeight(root));
//		System.out.println(countLeafNodes(root));
//		printPostOrder(root);
		removeLeafNodes(root);
	}
	
	// remove leaf Node In tree
	
	public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root) {
		if(root == null) {
			return null;
		}
		if(root.children.size() == 0) {
			return null;
		}
		for(int i=0;i<root.children.size();i++) {
			TreeNode<Integer> childNode = removeLeafNodes(root.children.get(i));
			if(childNode!=null && childNode.children.size() == 0) {
				// looping and swapping theparent child
				for(int j=0;j<root.children.size();j++) {
					root.children.set(j, root.children.get(j+1));
					
				}
				// removing last extra element
				root.children.remove(root.children.size()-1);
				i--;
			}
		}
		 for (int i = 0;
		         i < root.children.size();
		         i++) {
		  
		        // call function for root.children
		        root.children.set(i,removeLeafNodes(root.children.get(i)));
		        
		    }
		 return root;
	}
	//*************
	
	//************* start   Post-order Traversal
	public static void printPostOrder(TreeNode<Integer> root){
		if(root == null) {
			return;
		}
		for(int i=0;i<root.children.size();i++) {
			printPostOrder(root.children.get(i));
		}
		System.out.print(root.data + " ");
	}

	//************* End   Post-order Traversal
	//************* start   Count leaf nodes
	public static int countLeafNodes(TreeNode<Integer> root){

		// Write your code here
		
		if(root.children.size() == 0) {
			
			return 1;
		}
		int count = 0;
		for(int i=0;i<root.children.size();i++) {
			  //System.out.println(root.children.get(i).data + " -- "+ root.data);
	             count += countLeafNodes(root.children.get(i));
	           
	        }
		return count;

	}
		
	//************* end   Count leaf nodes
	
	//************* start  Find Height
	public static int getHeight(TreeNode<Integer> root){
		if(root == null) {
			return 0;
		}
		if(root.children.size() == 0) {
			// no children
			return 1;
		}
		int height=0;
		  for(int i=0;i<root.children.size();i++) {
			  System.out.println(root.children.get(i).data + " -- "+ root.data);
	            int h2height = getHeight(root.children.get(i));
	             height = Math.max(height, h2height);
	        }
		  System.out.println("height" + height);
		  return height +1;
	}
//	public static int hgetHeightHelper(TreeNode<Integer> root){
//		
//	}
	
	//************* End  Find Height
	
	//************* start  Number of nodes greater than x

	
	public static int numNodeGreater(TreeNode<Integer> root,int x){
		 int count = 0;
	        // Write your code here	
	        if(root == null) {
	            return 0;
	        }
	        // int cont=1;


	        if(root.data>x) {
	            count++;

	        }
	        // int ret = 0;
	        for(int i=0;i<root.children.size();i++) {
	            count+= numNodeGreater(root.children.get(i) ,x);
	        }

	        //System.out.println("roo" + root.data + " cnt" + cont);
	        return count ;
	        
	}
	
	


	//************* End  Number of nodes greater than x
	//************* start Sum of all nodes
	static int sumVal=0;
	public static int sumOfAllNode(TreeNode<Integer> root){
		//sumOfAllNodeHelper(root,0);
		sumVal +=root.data;
		for(int i=0;i<root.children.size();i++) {
			int sumLast = sumOfAllNode(root.children.get(i));
			
		}
		return sumVal ;
	}
//	public static int sumOfAllNodeHelper(TreeNode<Integer> root,int sum){
//		
//		for(int i=0;i<root.children.size();i++) {
//			int sumVal= sumOfAllNodeHelper(root.children.get(i,sum));
//		}
//	}
	
	//************* End Sum of all nodes
}
