
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
		
//		Queue myQueue = new Queue();
//		myQueue.enqueue(1);
//		myQueue.enqueue(30);
//		System.out.println(myQueue.peek().getValue());
//		myQueue.dequeue();
//		System.out.println(myQueue.peek().getValue());
		
//		Stack myStack = new Stack();
//		myStack.push(20);
//		System.out.println( myStack.peek().getValue() );	
//		myStack.push(40);
//		System.out.println( myStack.peek().getValue() );	
//		myStack.push(60);
//		System.out.println( myStack.peek().getValue() );
		
        BinaryTree tree = new BinaryTree(10);
    	BSTNode n1 = new BSTNode(5);
        BSTNode n2 = new BSTNode(15);

        tree.add(tree.getRoot(), n1, "left");   
        tree.add(tree.getRoot(), n2, "right");            
        
        System.out.println(tree.getRoot().getKey());
        System.out.println(tree.getRoot().getLeft().getKey());
        System.out.println(tree.getRoot().getRight().getKey());
	}
}
