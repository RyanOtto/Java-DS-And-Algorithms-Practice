import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

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
		
//        BinaryTree tree = new BinaryTree(10);
//    	BSTNode n1 = new BSTNode(5);
//        BSTNode n2 = new BSTNode(15);
//
//        tree.insert(1);   
//        tree.insert(2);
//        tree.insert(3);
//        tree.insert(50);
//        tree.insert(40);
//        
//        tree.inOrder();
//        tree.preOrder();
//        tree.postOrder();
//        
//        System.out.println(tree.search(50).getLeft().getKey());
//		
//		HashMap hm = new HashMap();
//		hm.put(0, 20);
//		hm.put(1, 100);
//		hm.put(1, 150);
//		hm.put(1, 2000);
//		System.out.println(hm.get(0));
//		System.out.println(hm.get(1));
//		System.out.println(hm.get(2));
//		System.out.println(hm.get(3));
		
//		TreeMap tm = new TreeMap();
//	    tm.put("Alison", new Integer(1));
//	    tm.put("Pif", new Integer(2));
//	    tm.put("Sona", new Integer(3));
//	    tm.put("Jose", new Integer(4));
//	    tm.put("Lilian", new Integer(5));
//	    
//	    //Place tm's contents into a set, use an iterator to go through the set, ouptut each key-value pair
//	    Set set = tm.entrySet();
//	    Iterator i = set.iterator();
//	    while(i.hasNext()) {
//	       Map.Entry me = (Map.Entry)i.next();
//	       System.out.print(me.getKey() + ": ");
//	       System.out.println(me.getValue());
		
		int[] myArray = {2,3,1,6,5,7,8};
		System.out.println("Array before sorting: " + Arrays.toString(myArray));
		quickSort(myArray, 0, myArray.length-1);
		System.out.println("Array after sorting: " + Arrays.toString(myArray));
}
	
	
		public static void quickSort(int[] array, int left, int right) {
			if (array == null || array.length == 0) return;
			if (left >= right) return;
	 
			int middle = left + (right - left) / 2;
			int i = left, j = right;
			
			while (i <= j) {
				while (array[i] < array[middle]) i++;
				while (array[j] > array[middle]) j--;
				
				if (i <= j) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					i++;
					j--;
				}
			}
	 
			if (left < j) quickSort(array, left, j);
			if (right > i) quickSort(array, i, right);
		}
	}
