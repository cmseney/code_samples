import static org.junit.Assert.*;
import org.junit.Test;

public class TestBinarySearch {

	@Test
	public void testBinarySearchTrue() {
	    int data[]  = {1, 2, 3} ; 
	    int key = 3;
	    assertEquals(true, BinarySearch.binarySearch(data, key));
	}
	
	@Test
	public void testBinarySearchFalse() {
	    int data[]  = {1, 2, 3} ; 
	    int key = 4;
	    assertEquals(false, BinarySearch.binarySearch(data, key));		
	}
	
	@Test
	public void testBinarySearchNull() {
		int data[] = null;
		int key = 1;
		assertEquals(false, BinarySearch.binarySearch(data, key));
	}
}
