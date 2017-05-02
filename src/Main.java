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
		
		int[] myArray = {2,3,1,6,5,7,8,1,8,10,20,100,50,40,30,300,20,10};
//		System.out.println("Array before sorting: " + Arrays.toString(myArray));
//		quickSort(myArray, 0, myArray.length-1);
//		System.out.println("Array after sorting: " + Arrays.toString(myArray));
		
		System.out.println("Array before sorting: " + Arrays.toString(myArray));
//		quickSort(myArray, 0, myArray.length-1);
//		mergeSort(myArray, 0, myArray.length-1);
//		bubbleSort(myArray);
//		selectionSort(myArray);
//		insertionSort(myArray);
		shellSort(myArray);
		System.out.println("Array after sorting: " + Arrays.toString(myArray));
}
	
	  public static void shellSort(int[] array) {
		    int inner, outer, temp, h=1;
		    
		    while (h <= array.length/3) {
		      h=h*3+1;
		    }
		    while (h > 0) {
		      for (outer=h; outer < array.length; outer++) {
		        temp=array[outer];
		        inner=outer;
		 
		        while(inner > h-1 && array[inner-h] >= temp) {
		          array[inner]=array[inner-h];
		          inner-=h;
		        }
		        array[inner]=temp;
		      }
		      h=(h-1)/3;
		    }
	  }
	
	  
	   public static void insertionSort(int[] array){
		   for(int i=1; i<array.length; i++){
			   int j=i;
			   int insertNum=array[i];
			   while(j>0 && array[j-1] > insertNum){
				   array[j]=array[j-1];
				   j--;
			   }
			   array[j]=insertNum;
		   }
	   }
	
		public static void selectionSort(int[] array){
	        for (int i=0; i<array.length-1; i++){
	        	int min=i;
	            for (int j=i; j<array.length; j++){
	            	if (array[j] < array[min]) min = j; //If we've found new min number, set min index to its index
	            }
	            
	            //Switch array element i with the new minimum value
	            int temp = array[min];  
	            array[min] = array[i]; 
	            array[i] = temp;
	        }
	    }
		
		public static void bubbleSort(int[] array){
			for(int i=array.length-1; i>0; i--){ //Decrease max index each loop
				for(int j=0; j<i; j++){ //For all the elements in that max index, get the highest value to the end
					if(array[j]>array[j+1]){ //To sort in ascending order, switching lower left values with higher right values
						int temp=0;
						temp=array[j+1];
						array[j+1]=array[j];
						array[j]=temp;
					}
				}
			}
		}
		
		public static void quickSort(int[] array, int left, int right) {
			if (array == null || array.length == 0) return;
			if (left >= right) return;
	 
			int middle = (left + right) / 2;
			int i = left, j = right;
			
			while (i < j) {
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
			
	    private static void mergeSort(int[] array, int left, int right) {
	        if(left < right) { //If there's more than 1 element in the list
	            int center = (left + right) / 2; //Center point for list splitting
	            mergeSort(array, left, center); //Sort from beginning to center
	            mergeSort(array, center+1, right); //Sort from center+1 to end
	            merge(array, left, center+1, right); //Merge the two resulting arrays
	        }
	    }
	    
	    private static void merge(int[] array, int leftIndex, int rightIndex, int rightEnd) {

	        int leftArrayEnd = rightIndex - 1; //Left array ends with the beginning of the right array
	        int numElements = rightEnd - leftIndex + 1; //Number of elements equal to end-beginning+1
	        int[] resultArray = new int[numElements];
	        int resultArrayIndex = 0;

	        while (leftIndex <= leftArrayEnd && rightIndex <= rightEnd) { //While both lists have elements to go through
	            if (array[leftIndex] <= array[rightIndex]) { //If current left element is lower
	                resultArray[resultArrayIndex] = array[leftIndex]; //Add it to the result array
	                resultArrayIndex++;
	                leftIndex++; //Deal with the next left list element (if there is one)
	            } else{ //If current right element is lower
	            	resultArray[resultArrayIndex] = array[rightIndex]; //Add it to the result array
	            	resultArrayIndex++;
	            	rightIndex++; //Deal with the next right list element (if there is one)
	            }
	        }
	        
	        //Add leftover left list elements to result array
	        while (leftIndex <= leftArrayEnd) { 
	            resultArray[resultArrayIndex] = array[leftIndex]; 
	            resultArrayIndex++;
	            leftIndex++;
	        }

	        //Add leftover right list elements to result array
	        while (rightIndex <= rightEnd) { 
	            resultArray[resultArrayIndex] = array[rightIndex];
	            resultArrayIndex++;
	            rightIndex++;
	        }

	        //Move backwards to the first position in the original array, setting each position to the result array value in the index
	        for (int i = numElements-1; i >= 0; i--, rightEnd--) array[rightEnd] = resultArray[i];
    }
}