package data.structures.stack;

import data.structures.LinkedListEg;

public class Stack<T> {
	
	private T[] stack;
	private int count;
	
public static void main(String[] args) {
		
		Stack<String> names = new Stack<>();
		names.push("java");
		names.push("node");
		names.push("js");


		while(!names.isEmpty()) System.out.println(names.pop());
	}
	
	public Stack() {
		stack = (T[]) new Object[1];
	}
	
	//we just have to add the new Item to the end of the array 0[1]
	public void push(T newData) {
		//Arrays are not dynamic DS
		// we have to resize the arr if necessary
		if(count == stack.length) resize(2*stack.length);
		
		stack[count++] = newData;
	}
	
	public void resize(int capacity) {
		
		System.out.println("Resizing arra");
		T[] stackCopy = (T[]) new Object[capacity];
		
		for(int i=0;i<count;++i) stackCopy[i] = stack[i];
		
		stack = stackCopy;
		
	
	}
	
	public T pop() {
		if(isEmpty()) return null;
		
		T item = stack[--count];
		
		stack[count] = null;

		if(count >0 && count == stack.length/4) resize(stack.length/2);
		
		
		return item;
	}
	
	public boolean isEmpty() {
		return count==0;
	}
	
	public int size() {
		return count;
	}
	
}
