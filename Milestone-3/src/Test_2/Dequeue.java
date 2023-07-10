package Test_2;
import java.util.LinkedList;
import java.util.Queue;

public class Dequeue {
		private int data[];
	    private int front;
	    private int rear;
	    private int size;
	public Dequeue(int size) {
		data = new int[10];
		front = -1;
		rear = 0;
		this.size = size;
	}
	public void insertFront(int elem) {
		 if (isFull())
	        {
	            System.out.println("Overflow");
	            return;
	        }
	  
	        // If queue is initially empty
	        if (front == -1)
	        {
	            front = 0;
	            rear = 0;
	        }
	         
	        // front is at first position of queue
	        else if (front == 0)
	            front = size - 1 ;
	  
	        else // decrement front end by '1'
	            front = front-1;
	  
	        // insert current element into Deque
	        data[front] = elem ;
		
	}
	public void insertRear(int elem){
		if(isFull()) {
			System.out.println("-1");
			return;
		}
		if(front == -1) {
			rear =0;
			front = 0;
		}
		else {
			if(rear == size-1) {
				rear = 0;
			}else {
				rear=rear+1;
			}
			data[rear] = elem;
			System.out.println("dsa" + data[rear]);
	}
		}
	boolean isFull()
    {
        return ((front == 0 && rear == size-1)||
            front == rear+1);
    }
	
	void deletefront()
    {
        // check whether Deque is empty or not
        if (isEmpty())
        {
            System.out.println("Queue Underflow\n");
            return ;
        }
  
        // Deque has only one element
        if (front == rear)
        {
            front = -1;
            rear = -1;
        }
        else
            // back to initial position
            if (front == size -1)
                front = 0;
  
            else // increment front by '1' to remove current
                // front value from Deque
                front = front+1;
    }
  
    // Delete element at rear end of Deque
    void deleterear()
    {
        if (isEmpty())
        {
            System.out.println(" Underflow");
            return ;
        }
  
        // Deque has only one element
        if (front == rear)
        {
            front = -1;
            rear = -1;
        }
        else if (rear == 0)
            rear = size-1;
        else
            rear = rear-1;
    }
  
    // Returns front element of Deque
    int getFront()
    {
        // check whether Deque is empty or not
        if (isEmpty())
        {
            System.out.println(" Underflow");
            return -1 ;
        }
        return data[front];
    }
  
    // function return rear element of Deque
    int getRear()
    {
        // check whether Deque is empty or not
        if(isEmpty() || rear < 0)
        {
            System.out.println(" Underflow\n");
            return -1 ;
        }
        return data[rear];
    }
	
    boolean isEmpty ()
    {
        return (front == -1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dequeue dq = new Dequeue(10);
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<arr.length;i++) {
			dq.insertRear(arr[i]);
		}
		//dq.insertFront(12);
		
	}

}
