package PQ_2_Assignments;

import java.util.ArrayList;

import prorityDoneBtMe.PriorityQueueException;

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
			 int ans=heap.get(0);
		        heap.set(0,heap.get(heap.size()-1));
		        heap.remove(heap.size()-1);
		        
		        int parentindex=0;
		        int leftchildindex=2*parentindex+1;
		        int rightchildindex=2*parentindex+2;
		        
		        while(leftchildindex<heap.size()-1)
		        {
		            int maxindex=parentindex;
		            if(heap.get(leftchildindex)>heap.get(parentindex))
		                maxindex=leftchildindex;
		            if(heap.get(rightchildindex)>heap.get(maxindex))
		                maxindex=rightchildindex;
		            
		            if(maxindex==parentindex)
		                break;
		            
		            int temp=heap.get(maxindex);
		            heap.set(maxindex,heap.get(parentindex));
		            heap.set(parentindex,temp);
		            parentindex=maxindex;
		            leftchildindex=2*parentindex+1;
		        	rightchildindex=2*parentindex+2;
		            
		            
		            
		        }
		        return ans;

		}
		

		public  void print() {
			for(int i =0;i<heap.size();i++) {
				System.out.print(heap.get(i) + " ");
				
			}
		}
}
