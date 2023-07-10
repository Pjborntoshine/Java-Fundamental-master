package PQ_2_Assignments;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import prorityDoneBtMe.PriorityQueueException;

public class Asignments {

	public static void main(String[] args) throws PriorityQueueException {
		// TODO Auto-generated method stub
//		int input[] = {42,20,18, 6, 14, 11, 9, 4};
//		System.out.println(checkMaxHeap(input));
		int input[] = {8,9,8,8,12};
		System.out.println(buyTicket(input,3));
	}
	
	public static int buyTicket(int input[], int k) throws PriorityQueueException {
		MaxPQ pq = new MaxPQ();
		Queue<Integer> queue = new LinkedList<Integer>();
//		System.out.println(input[k]);
		for(int i=0;i<input.length;i++) {
			pq.insert(input[i]);
			queue.add(i);
		}
		int sec=0;
		while(true) {
			if(input[queue.peek()] < pq.getMax()) {
//				System.out.println("here" + input[queue.peek()] + " " + pq.getMax());
				int temp  = queue.poll();
				queue.add(temp);
			}
			else {
				
				sec++;
				pq.removeMax();
				queue.poll();
				if(k == queue.peek()) {
					sec++;
					break;
				}
			}
			
		}
//			while(!queue.isEmpty()) {
//				System.out.print(queue.poll() + " ");
//			}
//			System.out.println();
//		
			
			return sec;
		
	}
	
	
//	Kth largest element
	public static int kthLargest(int n, int[] input, int k) {
		// Write your code here
		ArrayList<Integer> arr = new ArrayList<Integer>();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		//adding first k elemet to heap
		for(int i=0;i<k;i++) {
		pq.add(input[i]);	
		}
		for(int i=k;i<input.length;i++) {
			if(pq.peek()<input[i]) {
				pq.poll();
				pq.add(input[i]);
			}
		}
		while(!pq.isEmpty()) {
			arr.add(pq.poll());
		}
		return arr.get(0);
	}
	//Check Max-Heap

	public static boolean checkMaxHeap(int arr[])  {
		// check maq PQ
		int pInd = 0;
		int lCInd = 2*pInd+1;
		int rCInd = 2*pInd+2;
		while(lCInd<arr.length) {
			if(arr[lCInd] > arr[pInd] || (rCInd<arr.length && arr[rCInd] > arr[pInd])) {
				return false;
			}
			pInd=pInd+1;
			lCInd = 2*pInd+1;
			rCInd = 2*pInd+2;
		}
		return true;
	}
}
