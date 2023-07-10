package prorityDoneBtMe;

import java.util.ArrayList;

public class MaxPQ {
	ArrayList<Integer> heap;
	
	
	public MaxPQ() {
		heap = new ArrayList<>();
	}

		// Complete this class
		boolean isEmpty() {
			// Implement the isEmpty() function here
			if(heap.size()==0) {
				return true;
			}
			return false;
			
		}

		int getSize() {
			// Implement the getSize() function here
			return heap.size();
		}

		int getMax() throws PriorityQueueException{
			// Implement the getMax() function here
			if(isEmpty()) {
				throw new PriorityQueueException();
			}
			return heap.get(0);
		}

		void insert(int element) throws PriorityQueueException {
			// Implement the insert() function here
			
			heap.add(element); // added in the last;
			int childIndex = heap.size()-1; // last index 
			int parentInd = (childIndex-1)/2;
			
			while(childIndex > 0) {
//				comparing and  swapping to top
				if(heap.get(childIndex) > heap.get(parentInd)) {
					// swapp
					int temp = heap.get(childIndex);
					heap.set(childIndex, heap.get(parentInd));
					heap.set(parentInd, temp);
					childIndex = parentInd;
					parentInd = (childIndex-1)/2;
				}else {
					return;
				}
			}
//			
		}

		int removeMax() {
			// Implement the removeMax() function here
			if(isEmpty()) {
				return -1;
				
			}
			int removeelem = heap.get(0);//
			heap.set(0, heap.get(heap.size()-1));
			heap.remove(heap.size()-1);
//			indexing
			int pInd = 0;
			int lInd = 2*pInd+1;
			int rInd = 2*pInd+2;
			
			while(lInd<heap.size()) {

				
				// loopinp
				int maxInd = pInd;
				if(heap.get(lInd)>heap.get(maxInd)) {
					maxInd = lInd;
				}
				if(rInd<heap.size() && (heap.get(rInd) > heap.get(maxInd))) {
					maxInd = rInd;
				}
				if(maxInd == pInd) {
					break;
				}
				
				int temp = heap.get(maxInd);
				heap.set(maxInd, heap.get(pInd));
				heap.set(pInd, temp);
				pInd = maxInd;
				lInd = 2*pInd+1;
				rInd = 2*pInd+2;
				
			}

			
			
			
			return removeelem;
		}
		

		public  void print() {
			for(int i =0;i<heap.size();i++) {
				System.out.print(heap.get(i) + " ");
				
			}
		}
}
