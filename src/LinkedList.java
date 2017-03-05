//TODO: getAll(LinkedList myList)

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
	
	public int getValue(int index){ //Get the value of a node at specified index
		Node currentHead = head;
		if(currentHead==null) return -1;
		else for(int i=0; i<index+1; i++){ //Until we've reached the index+1 (so we can count from 0..n-1)
			if(currentHead.getNext()!=null) currentHead=currentHead.getNext(); //Move the head if the next isn't null
			else return -1;
		}
		return currentHead.getValue();
	}
	
	public void delete(int index){ //Delete a node at specified index
		Node currentHead = head;
		Node temp;
		if(listSize==1){
			head=null;
			listSize--;
			return;
		}
		else for(int i=0; i<index; i++){ //Find previous node
			if(currentHead.getNext()!=null) currentHead=currentHead.getNext(); 
			else return;
		}
		currentHead.setNext(currentHead.getNext().getNext());//Once node is found, set its head to the next's next
		listSize--;
	}
}
