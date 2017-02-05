
public class Main {

	public static void main(String[] args) {
		Node nodeOne = new Node(null, 0);
		Node nodeTwo = new Node(null, 1);
		nodeOne.setNext(nodeTwo);
		LinkedList myList = new LinkedList();
		//Set value of head node to 100
		//println myList.get(0)
		System.out.println(nodeOne.getNext().getValue());
	}

}
