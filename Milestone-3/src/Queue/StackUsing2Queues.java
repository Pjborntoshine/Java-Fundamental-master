package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		st.push(17);
		st.push(23);
		st.push(11);
		System.out.println(st.pop());
		System.out.println(st.top());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		
	}

}
 class Stack {

    //Define the data members
		Queue<Integer> q1 ;
		Queue<Integer> q2 ;
		int size;
    public Stack() {
        //Implement the Constructor
    	q1 = new LinkedList<Integer>();
    	q2 = new LinkedList<Integer>();
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
    	return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
    	return size==0;
    }

    public void push(int element) {
        //Implement the push(element) function
    	q1.add(element);
    	size++;
    	
    }

    public int pop() {
        //Implement the pop() function
    	if(!q1.isEmpty()) {
    	while(q1.size()!=1) {
    		q2.add(q1.peek());
    		q1.remove();
    		
    	}
    	int popelem = q1.peek();
    	size=-1;
    	q1.remove();
    	// swapping q1 and q2
    	Queue<Integer> qTemp=q1;
    	q1=q2;
    	q2=qTemp;
    	return popelem;
    	}else {
    		return -1;
    	}
    }

    public int top() {
    	if(q1.isEmpty()) {
    		return -1;
    	}
    		int topElem=-1;
        	while(!q1.isEmpty()) {
        		q2.add(q1.peek());
        		int x = q1.peek();
        		
        		if(q1.size() == 1) {
        			topElem = x;
        		}
        		q1.remove();
        	}
        	
        	
        	
        	size=-1;
        	// swapping q1 and q2
        	Queue<Integer> q=q1;
        	q1=q2;
        	q2=q;
        	return topElem;
        	}
    	
    }
