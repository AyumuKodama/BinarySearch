import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTester {

	@Test
	public void testBinarySearch() {
		int[] test1 = {13, 2, 7, 12, 15, 4, 11, 6, 10, 9, 3, 1, 14, 5, 8};
		QuickSort.quickSort(test1, 0, 14);
		assertEquals(0, BinarySearcher.binarySearch(test1, 0, 14, 1));
		assertEquals(14, BinarySearcher.binarySearch(test1, 0, 14, 15));
		assertEquals(5, BinarySearcher.binarySearch(test1, 0, 14, 6));
		
		int[] test2 = {2, 9, 6, 4, 5, 10, 3, 0};
		QuickSort.quickSort(test2, 0, 7);
		assertEquals(0, BinarySearcher.binarySearch(test2, 0, 7, 0));
		assertEquals(4, BinarySearcher.binarySearch(test2, 0, 7, 5));
		assertEquals(5, BinarySearcher.binarySearch(test2, 0, 7, 6));
		
		int[] test3 = {3, 100, 76, -4, 32};
		QuickSort.quickSort(test3, 0, 4);
		assertEquals(0, BinarySearcher.binarySearch(test3, 0, 4, -4));
		assertEquals(3, BinarySearcher.binarySearch(test2, 0, 4, 76));
		assertEquals(2, BinarySearcher.binarySearch(test2, 0, 4, 32));
		
		int[] test4 = {25, 36, 50, 14, 76, 49, 81};
		QuickSort.quickSort(test4, 0, 6);
		assertEquals(1, BinarySearcher.binarySearch(test3, 0, 6, 25));
		assertEquals(5, BinarySearcher.binarySearch(test2, 0, 6, 76));
		assertEquals(6, BinarySearcher.binarySearch(test2, 0, 6, 81));
		
	}

}
