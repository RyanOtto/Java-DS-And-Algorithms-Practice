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
}
