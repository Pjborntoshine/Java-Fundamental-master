package LinkedList_1;

import java.util.ArrayList;

public class RemoveConsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
	 ArrayList<Integer>al = 	removeDuplicatr(arr);
	for(int i:al) {
		System.out.println(i);
	}
	 for(int i=0;i<al.size();i++) {
		 System.out.println(al.get(i));
	 }
	}

	private static ArrayList<Integer> removeDuplicatr(int[] arr) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		al.add(arr[0]);
		for(int i=1;i<arr.length;i++) {
			if(arr[i] != arr[i-1]) {
				al.add(arr[i]);
			}
		}
		return al;
	}

}
