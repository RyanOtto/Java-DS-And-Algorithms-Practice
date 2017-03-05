
public class Main {

	public static void main(String[] args) {
		LinkedList myList = new LinkedList();
		myList.add(20);
		myList.add(40);
		myList.add(60);
		myList.add(80);
		myList.add(100);
		System.out.println(myList.getValue(1));
		System.out.println("Size: " + myList.getSize());
		myList.delete(1); //Delete the 40
		myList.delete(0); //Delete the 20
		System.out.println("Size: " + myList.getSize());
		System.out.println(myList.getValue(0));
//		System.out.println(myList.getValue(7));
	}

}
