package PQ_2DoneByMe;
// re implementing min priority queue

import java.util.ArrayList;

public class PQ {

	ArrayList<Integer> heap;

	public PQ() {
	heap = new ArrayList<>();
	}
	
	int getMin() {
		return heap.get(0);
	}
	
	boolean isEmpty() {
		if(heap.size() == 0) {
			return true;
		}
		return false;
	}
	
	void insertheap(int element) {
		heap.add(element);
		int cInd = heap.size()-1;
		int pInd = (cInd-1)/2;
		while(cInd > 0) {
			// swapping
			if(heap.get(cInd) < heap.get(pInd)) {
				int temp = heap.get(cInd);
				heap.set(cInd, heap.get(pInd));
				heap.set(pInd, temp);
				cInd = pInd;
				pInd = (cInd-1)/2;
			}else {
				return;
			}
		}
		
		
		
	}
	int removeMin() {
		// removing min element
		int removed = heap.get(0);
		// setting last to first
		
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		// indexing 
		int pInd = 0;
		int lInd = 2*pInd+1;
		int rInd = 2*pInd+2;
		while(lInd < heap.size()) {
			// swapping
			int minInd = pInd;
			if(heap.get(lInd) < heap.get(minInd)) {
				minInd = lInd;
			}
			if(rInd<heap.size() && (heap.get(rInd) < heap.get(minInd))) {
				minInd = rInd;
			}
			if(minInd == pInd) {
				break; 
			}
			// swapp
			int temp =heap.get(minInd);
			heap.set(minInd,heap.get(pInd));
			heap.set(pInd, temp);
			pInd = minInd;
			lInd = 2*pInd+1;
			rInd = 2*pInd+2;
		}
	
		return removed;
	}
	public  void print() {
		for(int i =0;i<heap.size();i++) {
			System.out.print(heap.get(i) + " ");
			
		}
	}
}
