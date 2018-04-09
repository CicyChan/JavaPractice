package tutorial.java.basic.test;

import java.util.ArrayList;
import java.util.ListIterator;

import org.junit.Test;;

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
	
	@Test
	public void testListIteratorNext(){
		
		    ArrayList<String> aList = new ArrayList<String>();

		    aList.add("1");
		    aList.add("2");
		    aList.add("3");
		    aList.add("4");
		    aList.add("5");

		    ListIterator<String> listIterator = aList.listIterator();
		    System.out.println("index: " + listIterator.previousIndex());

		    // advance current position by one using next method
		    System.out.println("listIterator.next() : " + listIterator.next());
		    System.out.println("index: "+ listIterator.previousIndex());
		    

		    // advance current position by one using next method
		    System.out.println("listIterator.next() : " + listIterator.next());
		    System.out.println("index: " + listIterator.previousIndex());

	}
	
	@Test
	public void testListIteratorPrevious(){
		
	    ArrayList<String> aList = new ArrayList<String>();

	    aList.add("1");
	    aList.add("2");
	    aList.add("3");
	    aList.add("4");
	    aList.add("5");

	    ListIterator<String> listIterator = aList.listIterator(aList.size());
	    System.out.println("index: " + listIterator.nextIndex());

	    // advance current position by one using next method
	    System.out.println("listIterator.previous(): " + listIterator.previous());
	    System.out.println("inex: " + listIterator.nextIndex());
	    
	    // advance current position by one using next method
	    System.out.println("listIterator.previous(): " + listIterator.previous());
	    System.out.println("inex: " + listIterator.nextIndex());
}


}
