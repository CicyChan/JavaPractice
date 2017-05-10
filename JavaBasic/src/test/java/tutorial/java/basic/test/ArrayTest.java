package tutorial.java.basic.test;

import org.junit.Test;

public class ArrayTest {

	@Test
	public void test() {
		// Array initialization
		int[] anArray;
		anArray = new int[3];

		anArray[0] = 100;
		anArray[1] = 200;
		anArray[2] = 300;

		System.out.println("Element at index 0: " + anArray[0]);

		// test array Copy
		char[] copyFrom = { 'd', 'e', 'c', 'h', 'e', 'l', 'l', 'o', 'n', 'a', 't', 'e', 'd' };

		char[] copyTo = new char[7];

		System.out.println(copyFrom);

		System.arraycopy(copyFrom, 3, copyTo, 0, 5);

		System.out.println(copyTo);

		// test array Manipulation

		char[] testCopyTo = java.util.Arrays.copyOfRange(copyFrom, 3, 8);

		System.out.println(testCopyTo);
	}

}
