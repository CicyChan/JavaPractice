package tutorial.java.anotation.test;

import static org.junit.Assert.*;

import org.junit.Test;

import tutorial.java.anotation.Book;

public class AnotationTest {

	@Test
	public void test() {
		Book book = new Book();

		System.out.println("Author" + book.getAuthor());
	}

}
