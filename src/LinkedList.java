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
	
	public Node get(int index){
		Node currentHead = head;
		if(currentHead==null) return null;
		else for(int i=0; i<index+1; i++){ //Until we've reached the index+1 (so we can count from 0..n-1)
			if(currentHead.getNext()!=null) currentHead=currentHead.getNext(); //Move the head if the next isn't null
			else return null;
		}
		return currentHead;
	}
	
	public void delete(int index){ //Delete a node at specified index
		Node currentHead = head;
		if(listSize==1){
			head=null;
			listSize--;
			return;
		}
		else for(int i=0; i<index; i++){ //Find previous node
			if(currentHead.getNext()!=null) currentHead=currentHead.getNext(); 
			else return;
		}
		currentHead.setNext(currentHead.getNext().getNext());//Once node in the middle is found, set its head to the next's next
		listSize--;
	}
	
	public String toString(){
		String result="";
		Node currentHead=head;
		while(currentHead.next!=null){
			currentHead=currentHead.next;
			result=result+currentHead.getValue()+" ";
		}
		return result;
	}
}
