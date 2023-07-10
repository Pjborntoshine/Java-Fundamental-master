package Queue;

//Circular  Queue Implementation
public class QueueUsingArray {
	 private int data[];
	    private int front;
	    private int rear;
	    private int size;
	    public QueueUsingArray(){

	        data= new int[5];
	        front= -1;
	        rear= -1;
	    }

	    public QueueUsingArray(int capacity){

	        data= new int[capacity];
	        front= -1;
	        rear= -1;
	    }

	    public int size(){
	      return size;
	    }

	    public boolean isEmpty(){
	        return size==0;
	    }

	    public void enqueue(int elem) throws QueueFUllException{
	      if(size== data.length){
	        //throw new QueueFUllException();
	    	  doubleCapacity();
	      }
	      if(size==0){
	        front=0;
	      }
	        rear++;
	        if(rear == data.length) {
	        	rear = 0;
	        }
	        data[rear]= elem;
	        size++;
	    }

	    private void doubleCapacity() {
			// TODO Auto-generated method stub
			int temp[] = data;
			data =  new int[2*temp.length];
			int index=0;
			for(int i=front;i<temp.length;i++) {
				data[index++] = temp[i];
			}
			for(int i=0;i<front-1;i++) {
				data[index++] = temp[i]; 
			}
			front=0;
			rear = temp.length-1;
		}

		public int front() throws QueueEmptyException{
	        if(size==0){
	            throw new QueueEmptyException();
	        }
	        return data[front];
	    }

	    public int dequeue() throws QueueEmptyException{
	      if(size == 0){
	        throw new QueueEmptyException();
	        }
	        int temp= data[front];
	        front++;
	        if(front == data.length) {
	        	front = 0;
	        	
	        }
	        size--;
	        if(size==0){
	            front=-1;
	            rear= -1;
	        }
	        return temp;
	    }
	
}



//// Queue Implementation
//public class QueueUsingArray {
//	 private int data[];
//	    private int front;
//	    private int rear;
//	    private int size;
//	    public QueueUsingArray(){
//
//	        data= new int[5];
//	        front= -1;
//	        rear= -1;
//	    }
//
//	    public QueueUsingArray(int capacity){
//
//	        data= new int[capacity];
//	        front= -1;
//	        rear= -1;
//	    }
//
//	    public int size(){
//	      return size;
//	    }
//
//	    public boolean isEmpty(){
//	        return size==0;
//	    }
//
//	    public void enqueue(int elem) throws QueueFullException{
//	      if(size== data.length){
//	        throw new QueueFullException();
//	      }
//	      if(size==0){
//	        front=0;
//	      }
//	        rear++;
//	        data[rear]= elem;
//	        size++;
//	    }
//
//	    public int front() throws QueueEmptyException{
//	        if(size==0){
//	            throw new QueueEmptyException();
//	        }
//	        return data[front];
//	    }
//
//	    public int dequeue() throws QueueEmptyException{
//	      if(size == 0){
//	        throw new QueueEmptyException();
//	        }
//	        int temp= data[front];
//	        front++;
//	        size--;
//	        if(size==0){
//	            front=-1;
//	            rear= -1;
//	        }
//	        return temp;
//	    }
//	
//}


//public class QueueUsingArray {
//	int qudata [];
//	int front;
//	int rear;
//	public QueueUsingArray() {
//		qudata = new int[10];
//		front = 0;
//		rear = 0;
//	}
//	public void enqueue(int elem) {
//		if(rear == qudata.length) {
//		int[] temparr = qudata;
//			qudata = new int[temparr.length + 5];
//			for(int i=0;i<temparr.length;i++) {
//				qudata[i] = temparr[i];
//			}
//		}
//		qudata[rear] = elem;
//		rear++;
//	}
//	public int dequeue() {
//		int tempelem = qudata[front];
//		for(int i=0;i<qudata.length-1;i++) {
//			qudata[i] = qudata[i+1];
//		}
//		return tempelem;
//	}
//	public int front() {
//		return qudata[front];
//	}
//		
//	public boolean isEmpty() {
//		if(rear == 0) {
//			return true ;
//		}
//		return false;
//	}
//	public void printQueue() {
//		for(int i=0;i<qudata.length;i++) {
//			System.out.println(qudata[i]);
//		}
//	}
//}
