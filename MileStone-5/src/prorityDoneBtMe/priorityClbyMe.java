package prorityDoneBtMe;

import java.util.ArrayList;

public class priorityClbyMe {
	ArrayList<Integer> arr;
	
	public priorityClbyMe() {
		super();
		this.arr = new ArrayList<>();
	}

	public  void insert(int data) {
		if(arr.size() ==0 || arr.size() ==1 || arr.size() ==2) {
			arr.add(data);
			return;
		}
		arr.add(data);
		int j=0;
		boolean isswapped = false;
		for(int i = arr.size()-1;i>0;i = (i-1)/2) {
		if(arr.get(i)<data) {
			int temp = arr.get(i);
//			arr
			
		}
		break;
			
		}
		
		System.out.println("j--" + j );
	}
	public  void print() {
		for(int i =0;i<arr.size();i++) {
			System.out.println(arr.get(i));
			
		}
	}
}
