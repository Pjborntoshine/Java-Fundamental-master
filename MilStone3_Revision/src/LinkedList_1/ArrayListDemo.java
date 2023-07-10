package LinkedList_1;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> al = new ArrayList<>(20); // capacity = 20
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(1, 15);
		al.set(1, 5);
//		al.remove(0);
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println();
		// enhance for loop
		for(int i:al) {
			System.out.println(i);
		}
		System.out.println(al.get(1));
	}

}
