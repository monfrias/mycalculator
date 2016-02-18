import static org.junit.Assert.*;

import org.junit.Test;


public class MyTester {

	@Test
	public void testNfactorial() {
		//fail("Not yet implemented");
		MyCalculator mc = new MyCalculator();
		float actual0 = mc.nfactorial(0);
		assertEquals("0!=1", 1, actual0, 0.0);
		
		float actual1 = mc.nfactorial(1);
		assertEquals("1!=1", 1, actual1, 0.0);
		
		float actual2 = mc.nfactorial(2);
		assertEquals("2!=2", 2, actual2, 0.0);
		
		float actual3 = mc.nfactorial(3);
		assertEquals("3!=6", 6, actual3, 0.0);
		
		float actual4 = mc.nfactorial(4);
		assertEquals("4!=24", 24, actual4, 0.0);
	}

	@Test
	public void testBinarySearch() {
		//fail("Not yet implemented");
		MyCalculator mc = new MyCalculator();
		int[] a = {1,2,3,4,5};
		float actualA = mc.binarySearch(a, 4);
		assertEquals("{1,2,3,4,5} binarySearch 4 = 3", 3, actualA, 0.0);
		
		float actualB = mc.binarySearch(a, 2);
		assertEquals("{1,2,3,4,5} binarySearch 2 = 1", 1, actualB, 0.0);
		
		float actualC = mc.binarySearch(a, 3);
		assertEquals("{1,2,3,4,5} binarySearch 3 = 2", 2, actualC, 0.0);
	}

}
