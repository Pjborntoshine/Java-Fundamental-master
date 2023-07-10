package Trees;

import java.util.ArrayList;

public class TreeNode<T> {
	T data;
	ArrayList<TreeNode<T>> children;
	public TreeNode(T data) {
		super();
		this.data = data;
		this.children = new ArrayList<>();
	}
	public TreeNode() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
