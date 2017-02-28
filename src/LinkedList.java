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
	
	public int getSize(){
		return listSize;
	}
	
	public int getValue(int index){ //Get the value of the node at a specified index
		Node currentHead = head;
		for(int i=0; i<index+1; i++){ //Until we've reached the index+1 (so we can count from 0..n-1)
			if(currentHead.getNext()!=null) currentHead=currentHead.getNext(); //Move the head if the next isn't null
		}
		return currentHead.getValue();
	}
}
