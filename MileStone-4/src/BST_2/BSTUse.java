package BST_2;

public class BSTUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST b = new BST();
		b.insert(5);
//		b.insert(2);
		b.insert(7);
		b.insert(1);
		b.insert(3);
		b.insert(6);
		b.insert(8);
		b.printTree();
		System.out.println("***********" + b.size());
		System.out.println(b.delete(5) + " " + b.size());
		b.printTree();
//		System.out.println(b.delete());
//		System.out.println(b.isPresent(5));
//		b.delete(5);
//		System.out.println(b.isPresent(5));
//		b.printTree();
	}

}
