package data.structures;

public class LinkedListEg<T extends Comparable<T>> implements List<T> {

	public static void main(String[] args) {
		
		LinkedListEg<Person> people = new LinkedListEg<>();

		people.insert(new Person(22,"Enok"));
		people.insert(new Person(24,"Aman"));
		people.insert(new Person(24,"Bk"));
		people.insert(new Person(24,"Malik"));
		people.insert(new Person(24,"Berne"));
		System.out.println(people.size());
//		people.remove(p1);
		System.out.println(people.findMiddle());
		System.out.println(people.size());
//		people.traverse();
		
		

		
	}
	
	private Node<T> root;
	private int items;

	@Override
	public void insert(T data) {
		// TODO Auto-generated method stub
		items++;
		if(root==null) root = new Node<>(data);
		
		else {
			insertEnd(data);
		}
		
	}
	private void insertBeginning(T data) {
		Node<T> newNode = new Node<>(data);
		newNode.setNextNode(root);
		root = newNode;
	}
	private void insertEnd(T data) {
		Node<T> newNode = new Node<>(data);
		Node<T> lastNode = root;
		while(lastNode.getNextNode()!=null) {
			lastNode = lastNode.getNextNode();
		}
		
		lastNode.setNextNode(newNode);
		newNode.setNextNode(null);
		
		
	}

	@Override
	public void remove(T data) {
		// TODO Auto-generated method stub
		items--;
		if(root==null) return;
		if(root.getData().compareTo(data)==0) root = root.getNextNode();
		else {
			remove(data, root, root.getNextNode());
		}
		
	}

	private void remove(T data, Node<T> previousNode, Node<T> actualNode) {
		
		while(actualNode !=null) {
			if(actualNode.getData().compareTo(data)==0) {
				items--;
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
		if(root ==null) return;
		Node<T> actualNode = root;
		
		while(actualNode != null) {
			System.out.println(actualNode);
			actualNode= actualNode.getNextNode();
		}
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return items;
	}

	public T findMiddle(){
		Node<T> actualNode = root;
		if(root==null) return null;
		if(items%2==0) return null;
		else {
			
			for(int i=1;actualNode!=null && i<items/2+1;i++) {
				actualNode = actualNode.getNextNode();
			}
			
			
		}
		return actualNode.getData();
		
	}
	
}















