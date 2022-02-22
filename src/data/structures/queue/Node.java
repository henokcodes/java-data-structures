package data.structures.queue;

public class Node<T extends Comparable<T>> {

	private T data;
	private Node<T> nextNode;
		public Node(T data) {
			this.data = data;
		}
		public T getData() {
			return data;
		}
		public void setData(T data) {
			this.data = data;
		}
		public Node<T> getNext() {
			return nextNode;
		}
		public void setNext(Node<T> nextNode) {
			this.nextNode = nextNode;
		}
		
		@Override
		public String toString(){
			return this.data.toString();
			}
}
