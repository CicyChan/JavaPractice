package tutorial.object.oriented.test;

import org.junit.Test;

import tutorial.object.oriented.Day;
import tutorial.stub.EnumStub;

public class EnumTest {

	@Test
	public void test() {
		EnumStub firstDay = new EnumStub(Day.MONDAY);

		firstDay.tellTtLikeItIs();

		EnumStub Thriday = new EnumStub(Day.WEDNESDAY);

		Thriday.tellTtLikeItIs();

		EnumStub seventhDay = new EnumStub(Day.SUNDAY);

		seventhDay.tellTtLikeItIs();
		
	}

} 
