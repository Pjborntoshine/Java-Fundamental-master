import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.*;
public class PQ_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {4,3,7,6,9,10,1,2};
//		PriorityQueue<Integer> pq = new PriorityQueue<>();
////		pq.add() // for adding data
////		pq.peek() to getMin
////		pq.poll() remove it will not throw the exception but element() will  throw
////		pq.isEmpty() // to 
//		
//		for(int i=0;i<arr.length;i++) {
//			pq.add(arr[i]);
//		}
//		
//		
////		System.out.println(pq.peek());
//		while(!pq.isEmpty()) {
//			System.out.println(pq.peek());
//			pq.poll();
//		}
		int input[] = {2,12,9,16,10,5,3,20,25,11,1,8,6 };
		int k = 4;
		ArrayList<Integer> ans= kLargest(input,k);
//		ArrayList<Integer> ans = kSmallest(input.length,input,k);
		for(Integer i: ans) {
			System.out.println(i);
		}
	}
// K Smallest Elements
	public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
		// Write your code here
		ArrayList<Integer> arr = new ArrayList<Integer>();
		 PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
	            public int compare(Integer lhs, Integer rhs) {
	                if (lhs < rhs) return +1;
	                if (lhs.equals(rhs)) return 0;
	                    return -1;
	            }
	        });
		 
		 for(int i=0;i<k;i++) {
				pq.add(input[i]);	
			}
			for(int i=k;i<input.length;i++) {
				if(pq.peek()>input[i]) {
					pq.poll();
					pq.add(input[i]);
				}
			}
			while(!pq.isEmpty()) {
				arr.add(pq.poll());
			}
		return arr;
	}
	// K largest Elements
	public static ArrayList<Integer> kLargest(int input[], int k){
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
		return arr;
	}

}
