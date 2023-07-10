package OOPS_1;

import java.util.Iterator;

public class DynamicArray {
	private int data[];
	private int nextElementIndex;
	private int checkmaxdataelem;
	public DynamicArray() {
		data = new int[5];
		nextElementIndex = 0;
		checkmaxdataelem=5;
	}
	public int size() {
		return nextElementIndex; // returning the size 
	}
	public boolean iEmpty() {
		return nextElementIndex==0; // checking if index value is 0 or not
	}
	public int get(int i) {
		if(i>=nextElementIndex) {
			return 0;
		}
		return data[i];
	}
	public int set(int elem,int index) {
		if(index>nextElementIndex) {
			return -1;
		}
		data[index] = elem;
		return data[index];
	}
	public void add(int element) {
		/*if(nextElementIndex == checkmaxdataelem) {
			// done by me
			checkmaxdataelem = checkmaxdataelem*2;
			int data2[] = new int[checkmaxdataelem];
			for(int i=0;i<data.length;i++) {
				data2[i] = data[i];
			}
			data = data2;
			data[nextElementIndex] = element;nextElementIndex++;
			
			System.out.println(data2 +" "+ data);
			 return;
			 */
			
			
		//}
		// Cn
	if(nextElementIndex == data.length) {
		doubleCapaity();
	}
	
		data[nextElementIndex] = element;
		nextElementIndex++;
	}
	
	public void add(int ind,int elem) {
		// adding and shifting element @ right	
		int temp[] = data;
	
		if(nextElementIndex == data.length)
		{
			doubleCapaity();
		}
		data[ind] = elem;
		for(int i=ind+1;i<data.length;i++) {
			data[i] = temp[i];
		}
		for(int i=0;i<data.length;i++) {
			System.out.println(i+" -> "+ data[i]);
		}
	}
	private void doubleCapaity() {
		// TODO Auto-generated method stub
		int temp[] = data;
		data = new int[2*temp.length];
		for(int i=0;i<temp.length;i++) {
			data[i] = temp[i];
		}
		
	}
	public boolean contain(int ind,int elem) {
			if(data[ind]!=0) {
//				System.out.println(data[ind]+" "+ elem);
				return true;
			}
			return false;
	}
	public int  remove() {
		// checking if element is empty or not
		if(nextElementIndex == 0) {
			return -1;
		}
		int temp = data[nextElementIndex-1];
		data[nextElementIndex-1]=0;
		nextElementIndex--;
		return temp;
//		int removeelem = data[nextElementIndex];
//		data[nextElementIndex] = 0;
//		return removeelem;
	}
	
	
	public void  remove(int ind) {
		if(ind >= nextElementIndex) {
			System.out.println("invalid");
			return;
		}
		int temp[] = data;
		data[ind] = -1;
		for(int i=ind;i<data.length-1;i++) {
			data[i] =temp[i+1] ;
		}
		nextElementIndex--;
		for(int i=0;i<nextElementIndex;i++) {
			System.out.println(i +" -> "+ data[i]);
		}
	}

}