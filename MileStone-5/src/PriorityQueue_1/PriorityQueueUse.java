package PriorityQueue_1;

public class PriorityQueueUse {

	public static void main(String[] args) throws PriorityQueueException {
		// TODO Auto-generated method stub
		Priority_Queue<String> pq = new Priority_Queue();
		pq.insert("abc", 15);
		pq.insert("def", 13);
		pq.insert("fas", 90);
		pq.insert("defasdas", 1);
		pq.insert("asdasdas", 120);
	
		pq.print();
		
		while(!pq.isEmpty()) {
			try {
				System.out.println(pq.getMin());
			} catch (PriorityQueueException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pq.removeMin();
		}
	}
	

}
