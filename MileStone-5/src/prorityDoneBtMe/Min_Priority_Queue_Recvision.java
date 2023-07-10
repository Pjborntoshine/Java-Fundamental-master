package prorityDoneBtMe;

import java.util.ArrayList;

import javax.swing.text.AbstractDocument.LeafElement;

public class Min_Priority_Queue_Recvision<T> {
	ArrayList<Element<T>> heap;

	public Min_Priority_Queue_Recvision() {
		heap = new ArrayList<>();
	}
	
	
	// insert function
	

	
	public void insert(T value,int priority) {
		Element<T> e = new Element(value, priority);
		heap.add(e);
		
		int childIndex = heap.size()-1;
		int parentIndex = (childIndex-1)/2;
		
		while(childIndex>0) {
			if(heap.get(childIndex).priority < heap.get(parentIndex).priority) {
				Element<T> temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				// updating the index
				childIndex = parentIndex;
				parentIndex = (childIndex-1)/2;
			}else {
				return;
			}
		}
		
	}
//// insert rev2
//	public void insert2(T value,int priority) {
//	Element<T> e = new Element(value, priority);
//	// adding to head;
//	heap.add(e);
//	// indixing child and parent
//	int childIndex = heap.size()-1;
//	int parentIndex = (childIndex-1)/2;
//	while(childIndex >0) {
//		if(heap.get(childIndex).priority < heap.get(parentIndex).priority) {
//			// swapping the child and aprent
//			Element<T> temp = heap.get(childIndex);
//			heap.set(childIndex, heap.get(parentIndex));
//			heap.set(childIndex, temp);
//			childIndex = parentIndex;
//			parentIndex = (childIndex-1)/2;
//			
//		}else {
//			return;
//		}
//		
//	}
//	
//	}
////	insert rev 2
	
	public T  getMin() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return null;
		}
		T ans = heap.get(0).value;
		return ans;
		
		
	}
		
	public boolean isEmpty() {
		if(heap.size() == 0) {
			return true;
		}
		return false;
	}
	
	public int size() {
		return heap.size();
	}
	
	public T removeMin() {
		if(isEmpty()) {
			System.out.println("PQ is Empty");
			return null;
		}
		Element<T> removed = heap.get(0);
		T ans = removed.value;
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		
		int parentIndex = 0;
		int lftInd = 2*parentIndex +1;
		int rgtInd =  2*parentIndex +2;
		
		while(lftInd>heap.size()) {
		// finding min
		int minInd = parentIndex;
		if(heap.get(lftInd).priority < heap.get(minInd).priority) {
			minInd = lftInd;
		}
		if(rgtInd<heap.size() && (heap.get(rgtInd).priority < heap.get(minInd).priority)) {
			minInd = rgtInd;
		}
		// when parent ind == min ind
		if(minInd == parentIndex ) {
			break;
		}
		// swapping min and parent ind
		Element<T> temp = heap.get(minInd);
		heap.set(minInd, heap.get(parentIndex));
		heap.set(parentIndex, temp);
		parentIndex = minInd;
		lftInd = 2*parentIndex+1;
		rgtInd = 2*parentIndex +2;
	}
		
		
		return ans;
		
		
	}
	
	

	public  void print() {
		for(int i =0;i<heap.size();i++) {
			System.out.print(heap.get(i).value + " ");
			
		}
	}
}
