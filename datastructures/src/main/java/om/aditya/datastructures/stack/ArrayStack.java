package om.aditya.datastructures.stack;

import java.util.ArrayList;
import java.util.List;

public class ArrayStack<E> implements Stack<E> {
	
	private int count = 0 ;
	public List<E> items = new ArrayList<E>(10);
    private int top = 0;
    
	public void push(E item) {
	
	 	items.add(top,item);
		count++;
	}

	public E pop() {
		// TODO Auto-generated method stub
		E data = items.get(top);
		top = top-1;
		count--;
		return data;
	}

	public E peek() {
		// TODO Auto-generated method stub
		return items.get(top);
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top==0;
	}

	public int size() {
		// TODO Auto-generated method stub
		return count;
	}
			

}
