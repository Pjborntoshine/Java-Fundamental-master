package prorityDoneBtMe;

public class MaxPqUse {

	public static void main(String[] args) throws PriorityQueueException {
		// TODO Auto-generated method stub
		MaxPQ pq = new MaxPQ();
		pq.insert(0);
		pq.insert(2);
		pq.insert(3);
		pq.insert(4);
		
		pq.print();
		pq.removeMax();
		System.out.println();
		pq.print();
	}

}
