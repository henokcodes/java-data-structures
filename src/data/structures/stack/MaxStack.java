package data.structures.stack;

//import java.util.*;

public class MaxStack {
	
	 private Stack<Integer> mainStack;
	 private Stack<Integer> maxStack;

	 
	 
	 public static void main(String[] args) {
			
		 MaxStack s = new MaxStack();
		    s.push(20);
		    System.out.println(s.getMaxItem());
		    s.push(10);
		    System.out.println(s.getMaxItem());
		    s.push(50);
		    System.out.println(s.getMaxItem());
		}
	 
	 public MaxStack() {
		 this.mainStack = new Stack<>();
		 this.maxStack = new Stack<>();
	 }
	 
	 public void push(int item) {
		 
		 //push the new item into the main stack
		 mainStack.push(item);
		 
		 //first item is the same in both stacks
		 if(mainStack.size()==1) {
			 maxStack.push(item);
			 return;
		 }
		 
		 //if the item is the largest, insert it into max stack
		 if(item>maxStack.peek()){
			 maxStack.push(item);
		 }else {
			 maxStack.push(maxStack.peek());
		 }
	 }
	 
	 public int pop() {
		 maxStack.pop();
		 return mainStack.pop();
		 }
	 public int getMaxItem() {
		 return maxStack.peek();
	 }
}
