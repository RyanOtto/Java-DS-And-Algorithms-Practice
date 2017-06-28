public class LinkedList {
	private Node head;
	private int listSize;
	
	public LinkedList(){
		head = new Node(null, 0);
		listSize = 0;
	}
	
	public void add(int value){ //Add at the end
		Node newNode = new Node(null, value);
		Node current = head;
		while(current.getNext()!=null){ //Go to last element
			current=current.getNext();
		}
		current.setNext(newNode); //Set old last node's next to the new last node
		listSize++;
	}
	
	public void add(int index, int value){ //Add at a specified index
		Node insert=new Node(null,value);
		Node temp=head;
		for(int i=0; i<index; i++){
			if(temp.getNext()!=null) temp=temp.getNext(); //Move to specified index-1
			else return;
		}
		if(temp.getNext()==null) temp.setNext(insert); //If at the end, add to the end
		else{ //If not at the end
			insert.setNext(temp.getNext());
			temp.setNext(insert);
		}
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
		Node current = head;
		if(listSize==1){
			head=null;
			listSize--;
			return;
		}
		else for(int i=0; i<index; i++){ //Find previous node
			if(current.getNext()!=null) current=current.getNext(); 
			else return;
		}
		current.setNext(current.getNext().getNext()); //Link previous node to the one two spots ahead, thus removing the middle node
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