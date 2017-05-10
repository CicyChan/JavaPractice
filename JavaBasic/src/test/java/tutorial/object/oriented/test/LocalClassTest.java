package tutorial.object.oriented.test;

import org.junit.Test;

import tutorial.object.oriented.LocalClass;

public class LocalClassTest {

	@Test
	public void test() {
		LocalClass.validatePhoneNumber("123-456-7890", "456-7890");
	}

}
