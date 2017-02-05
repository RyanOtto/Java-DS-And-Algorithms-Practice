//TODO: getSize method
//TODO: delete method (index)
//TODO: get method (index)
//TODO: switch method?

public class LinkedList {
	private Node head;
	private int listSize;
	
	public LinkedList(){
		head = new Node(null, 0);
		listSize = 0;
	}
	
	public void add(int value){
		Node newNode = new Node(null, value);
		Node currentHead = head;
		while(currentHead.getNext()!=null){ //Go to last element
			currentHead=currentHead.getNext();
		}
		currentHead.setNext(newNode);
		listSize++;
	}
}
