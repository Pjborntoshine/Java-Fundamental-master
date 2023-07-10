package Queue;

import java.util.Stack;

class QueueUsingSt<T>{
	Stack<T> s1=new Stack<T>();
	Stack<T> s2=new Stack<T>();
	public void enqueue(T elem) {
		s1.push(elem);
	}
	public T dequeue(){
		T retElem = null;
		
		while(!s1.isEmpty()) {
			T da=s1.pop();
			s2.push(da);
			if(s1.size()==1) {
				 retElem = s1.pop();
				 return retElem;
			}
		}
		 return retElem;
	}
}
public class QueueUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingSt<Integer> qst = new QueueUsingSt<Integer>();
		qst.enqueue(17);
		qst.enqueue(23);
		qst.enqueue(11);
		System.out.print(qst.dequeue());
		
	}

}
