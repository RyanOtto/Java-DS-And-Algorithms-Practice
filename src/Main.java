
public class Main {

	public static void main(String[] args) {
		
//		LinkedList myList = new LinkedList();
//		myList.add(20);
//		myList.add(40);
//		myList.add(60);
//		myList.add(80);
//		myList.add(100);
//		System.out.println(myList.get(1).getValue());
//		System.out.println("Size: " + myList.getSize());
//		myList.delete(1); //Delete the 40
//		myList.delete(0); //Delete the 20
//		System.out.println("Size: " + myList.getSize());
//		System.out.println(myList.get(0).getValue());
//		System.out.println(myList.toString());
//		System.out.println(myList.getValue(7));
		
		Queue myQueue = new Queue();
		myQueue.enqueue(1);
		myQueue.enqueue(30);
		System.out.println(myQueue.peek().getValue());
		myQueue.dequeue();
		System.out.println(myQueue.peek().getValue());
	}

}
