package data.structures.queue;

import data.structures.stack.Stack;

public class Queue<T extends Comparable<T>> {
	
	private Node<T> firstNode;
	private Node<T> lastNode;
	private int count=0;
	
	
	
public static void main(String[] args) {
		
	Queue<String> names = new Queue<>();
		names.enqueue("java");
		names.enqueue("node");
		names.enqueue("js");
		
		System.out.println(names.size());
		
		System.out.println(names.dequeue());
		System.out.println(names.dequeue());
		System.out.println(names.dequeue());

		

	}
	
	
	
	
	
	public boolean isEmpty() {
		return this.firstNode==null;
				
	}
	
	public int size() {
		return this.count;
	}
	
	
	//O(1)
	public void enqueue(T newData) {
		this.count++;
		
		Node<T> oldLastNode = this.lastNode;
		this.lastNode = new Node<>(newData);
		this.lastNode.setNext(null);
		
		if(isEmpty()) {
			this.firstNode = this.lastNode;
		}else {
			oldLastNode.setNext(this.lastNode);
		}
	}
	
	public T dequeue() {
		
		this.count--;
		
		T dataToDequeue = this.firstNode.getData();
		this.firstNode = this.firstNode.getNext();
		
		if(isEmpty()) this.lastNode = null;
		
		return dataToDequeue;
		
	}
	
	//Queue implementation using Array
//	private T[] queue;
//	   private Node<T> root;
//	    private int count;
//	    
//	    public Queue(){
//	        queue = (T[]) new Object[1];
//	    }
//
//
//	    public void enqueue(T data){
//	        
//	       
//	         if(count == queue.length){
//	            resize(count*2);
//	        }
//	        queue[count++]= data;
//
//
//	    }
//
//	    private void resize(int capacity){
//
//	        System.out.println("resizing");
//	        T[] newQueue = (T[]) new Object[capacity];
//
//	        for(int i=0;i<count;i++)
//	            newQueue[i] = queue[i];
//
//
//	        queue = newQueue;
//
//	    }
//
//	    public T dequeue(){
//
//	        if(root==null) return null;
//	       
//	        T item = queue[--count];
//
//	        queue[count] = null;
//
//	         if(count/4 == queue.length) resize(queue.length/2);
//
//
//	         
//	    return item;
//	    }
//	    public T peek(){
//
//	       
//	        if(root==null) return null;
//	        int firstItem = count-1;
//	        T item = queue[firstItem];
//
//
//	         
//	    return item;
//
//	    }
//
//	    public boolean isEmpty(){
//	        return count==0;
//	    }
//	    public int size(){
//	        return count;
//	    }

	

}
