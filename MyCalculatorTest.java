import static org.junit.Assert.*;

import org.junit.Test;


public class MyCalculatorTest {

	@Test
	public void testNfactorial() {
		MyCalculator calc = new MyCalculator();
		int[] arr = new int[] {-2,-1,0,1,2};
		int[] arr2 = new int[] {-1,-1,1,1,2};
		
		for(int i = 0, actual = 0; i < 5; i++){
			actual = calc.nfactorial(arr[i]);
			assertEquals("Expected: "+arr[i]+"! = "+arr2[i], arr2[i], actual, 0);
		}
	}

	@Test
	public void testBinarySearch() {
		MyCalculator calc = new MyCalculator();
		int[] arr = new int[] {11,12,13,14,15};
		int[] arr2 = new int[] {10,16,12,13,14};
		int[] arr3 = new int[] {-1,-1,1,2,3};
		
		for(int i = 0, actual = 0; i < 5; i++){
			actual = calc.binarySearch(arr, arr2[i]);
			assertEquals("Expected: "+arr2[i]+" is at "+arr3[i], arr3[i], actual, 0);
		}
	}

}
