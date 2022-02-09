package data.structures;

public class LinkedListEg<T extends Comparable<T>> implements List<T> {

	public static void main(String[] args) {
		
		LinkedListEg<String> names = new LinkedListEg<>();
		names.insert("java");
		names.insert("node");
		names.insert("js");
		names.traverse();
	}

	private Node<T> root;
	private int numOfItems;
	
	@Override
	public void insert(T data) {
		// TODO Auto-generated method stub
		if(root==null) {
			root = new Node<>(data);
		}else {
			insertBeginning(data);
		}		
	}
	
	public void insertBeginning(T data) {
		Node<T> newNode = new Node<>(data);
		newNode.setNextNode(root);
		root = newNode;
	}
	
	public void insertEnd(T data, Node<T> node) {
		if(node.getNextNode() != null) {
			insertEnd(data, node.getNextNode());
		}else {
			//last node
			Node<T> newNode = new Node<>(data);
			newNode.setNextNode(newNode);
		}
	}

	@Override
	public void remove(T data) {
		if(root!=null) return;
		
		if(root.getData().compareTo(data)==0 ) {
			root = root.getNextNode();
		}else {
			remove(data, root, root.getNextNode());
		}
		// TODO Auto-generated method stub
		
	}
	
	private void remove(T data, Node<T> previousNode, Node<T> actualNode) {
			
		while(actualNode !=null) {
			if(actualNode.getData().compareTo(data)==0) {
				numOfItems--;
				previousNode.setNextNode(actualNode.getNextNode());
				actualNode = null;
				return;
			}
			
			previousNode= actualNode;
			actualNode = actualNode.getNextNode();
		}
	}

	@Override
	public void traverse() {
		// TODO Auto-generated method stub
		if(root!=null) return;
		Node<T> actualNode = root;
		
		while(actualNode!= null) {
			System.out.println(actualNode);
			actualNode = actualNode.getNextNode();
		}	
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
}















