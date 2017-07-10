import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

public class TestStructuresModule {
	@Test
	public void testShellsort(){
		int[] unsortedArray={3,1,5,2,4,0};
		int[] sortedArray={0,1,2,3,4,5};
		Main.shellSort(unsortedArray);
		assertEquals(Arrays.toString(unsortedArray), Arrays.toString(sortedArray));
	}
	
	@Test
	public void testInsertionsort(){
		int[] unsortedArray={3,1,5,2,4,0};
		int[] sortedArray={0,1,2,3,4,5};
		Main.insertionSort(unsortedArray);
		assertEquals(Arrays.toString(unsortedArray), Arrays.toString(sortedArray));
	}
	
	@Test
	public void testSelectionsort(){
		int[] unsortedArray={3,1,5,2,4,0};
		int[] sortedArray={0,1,2,3,4,5};
		Main.selectionSort(unsortedArray);
		assertEquals(Arrays.toString(unsortedArray), Arrays.toString(sortedArray));
	}
	
	@Test
	public void testBubblesort(){
		int[] unsortedArray={3,1,5,2,4,0};
		int[] sortedArray={0,1,2,3,4,5};
		Main.bubbleSort(unsortedArray);
		assertEquals(Arrays.toString(unsortedArray), Arrays.toString(sortedArray));
	}
	
	@Test
	public void testQuicksort(){
		int[] unsortedArray={3,1,5,2,4,0};
		int[] sortedArray={0,1,2,3,4,5};
		Main.quickSort(unsortedArray, 0, unsortedArray.length-1);
		System.out.println(Arrays.toString(unsortedArray));
		assertEquals(Arrays.toString(unsortedArray), Arrays.toString(sortedArray));
	}
	
	@Test
	public void testMergesort(){
		int[] unsortedArray={3,1,5,2,4,0};
		int[] sortedArray={0,1,2,3,4,5};
		Main.mergeSort(unsortedArray, 0, unsortedArray.length-1);
		assertEquals(Arrays.toString(unsortedArray), Arrays.toString(sortedArray));
	}
}
