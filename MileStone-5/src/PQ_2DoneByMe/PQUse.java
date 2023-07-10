package PQ_2DoneByMe;

public class PQUse {

	public static void main(String[] args) {
//		heapSort1();
		int[] arr = {1,5,3,6,2,4,0};
		inplaceHeapSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
//	// heapSort one way T.C - O(nlogn) sC - O(n)
	public static void inplaceHeapSort(int arr[]) {
		int n = arr.length;
		for(int i=(n/2)-1;i>=0;i--) {
			downHeapify(arr,i,n);
		}
		// remove element from starting one by one and put them to respctive last position 
		for(int i=n-1;i>=0;i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			downHeapify(arr,0,i);
		}
		
	}

	private static void downHeapify(int[] arr, int i, int n) {
		// TODO Auto-generated method stub
		int parentIndex = i;
		int leftChildInd = 2*i+1;
		int rgtChildInd = 2*i+2;
		while(leftChildInd<n) {
			int minIndex = parentIndex;
			if(arr[leftChildInd] < arr[minIndex]) {
				minIndex = leftChildInd;
			}
			if(rgtChildInd<n && arr[rgtChildInd] < arr[minIndex]) {
				minIndex = rgtChildInd;
			}
			if(minIndex == parentIndex) {
				return;
			}
			int temp = arr[parentIndex];
			arr[parentIndex] = arr[minIndex];
			arr[minIndex] = temp;
			parentIndex = minIndex;
			leftChildInd = 2*parentIndex+1;
			rgtChildInd = 2*parentIndex+2;
			
		}
	
	}
	
//		public static void InplaceheapSort1() {
//			int[] arr = {10,5,8,1,4};
//			PQ pq = new PQ();
//			for(int i=0;i<arr.length;i++) {
//				pq.insertheap(arr[i]);
//			}
//			pq.print();
//		}
	

	// heapSort one way T.C - O(nlogn) sC - O(n)
	public static void heapSort1() {
			
		// TODO Auto-generated method stub
				int[] arr = {1,5,3,6,2,4,0};
				PQ pq = new PQ();
				for(int i=0;i<arr.length;i++) {
					pq.insertheap(arr[i]);
				}
//				pq.print();
//				System.out.println();
//				pq.removeMin();
//				pq.print();
				for(int i=0;i<arr.length;i++) {
					int min = pq.removeMin();
					arr[i] = min;
				}
				for(int i=0;i<arr.length;i++) {
					System.out.print(arr[i] + " ");
				}
		
	}

}
