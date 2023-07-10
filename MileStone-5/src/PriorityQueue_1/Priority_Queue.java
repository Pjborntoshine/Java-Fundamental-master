package PriorityQueue_1;

import java.util.ArrayList;

public class Priority_Queue<T> {
	// careating arraylist od ELement class of type T
	private ArrayList<Element<T>> heap;

	public Priority_Queue() {

		heap = new ArrayList<>();
	}
	
	public void insert(T value,int priority) {
		Element<T> e = new Element(value, priority);
		heap.add(e);
		int childIndex = heap.size()-1;
		int parentIndex = (childIndex -1)/2;
		
		while(childIndex >0){
			if(heap.get(childIndex).priority < heap.get(parentIndex).priority)
			{
				// swapping
				Element<T> temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex -1)/2;
			}else {
				return ;
			}
		}
		
	
		
		
		
	}
	
	public T getMin() throws PriorityQueueException{
		if(isEmpty()) {
			throw new PriorityQueueException();
		}
		return heap.get(0).value;
	}
	
	public T removeMin() throws PriorityQueueException {

		if(isEmpty()) {
			throw new PriorityQueueException();
		}
		
		// Elemen need to br removed
		Element<T> removed = heap.get(0);
		T ans = removed.value;
		// setting last elemet from last to first;
		heap.set(0, heap.get(heap.size()-1));
		// removing last element
		heap.remove(heap.size()-1);
		
		// step:2: maintaning index of parent L,R child
		int parentIndex = 0;
		int leftChildIndex = 2*parentIndex+1;
		int rightChildIndex = 2*parentIndex+2;
		
		while(leftChildIndex<heap.size()) { 
		
			int minIndex = parentIndex;
			
			if(heap.get(leftChildIndex).priority < heap.get(minIndex).priority) {
				minIndex = leftChildIndex;
			}
			
			if(rightChildIndex<heap.size() && (heap.get(rightChildIndex).priority < heap.get(minIndex).priority)) {
				minIndex = rightChildIndex;
			}
			
			if(minIndex == parentIndex) {
				break;
			}
			
			// swapping
			Element<T> temp = heap.get(minIndex);
			heap.set(minIndex, heap.get(parentIndex));
			heap.set(parentIndex, temp);
			
			parentIndex = minIndex;
			leftChildIndex = 2*parentIndex +1;
			rightChildIndex = 2*parentIndex +2;
			
		}
		
		return ans;
	}
	
	// done by me
	public T removeMinByMe() {
		if(heap.isEmpty()) {
			return null;
		}
		//swapping min and the last elements
		Element<T> temp = heap.get(0);
		heap.set(0, heap.get(heap.size()-1));
		heap.set(heap.size()-1, temp);
		
		// step 2 removing the last element
		heap.remove(heap.size()-1);
		
		int childIndx=0;
		int parentInd =(childIndx-1)/2;
		int i=0;
		// looping unitll reached to last
		while(i < heap.size()-1) {
			//getting min among children
//			Element<T> minPriority = null;
//			Element<T> temp = heap.get(i);
//			if(heap.get(2*i+1).priority < heap.get(2*i+2).priority) {
//				minPriority = heap.get(2*i+1);
//				i = 2*i+1;
//			}else {
//				minPriority = heap.get(2*i+2);
//				i = 2*i+2;
//			}
//			// swapping 
//			heap.set(i, minPriority)
//			
		}
		
		return  temp.value;
		
	}
	
	
	
	
	public int size() {
		return heap.size();
	}
	
	public boolean isEmpty() {
		if(heap.size() == 0) {
			return true;
		}
		return false;
	}
	
	
	public  void print() {
		for(int i =0;i<heap.size();i++) {
			System.out.print(heap.get(i).value + " ");
			
		}
	}
	
}
