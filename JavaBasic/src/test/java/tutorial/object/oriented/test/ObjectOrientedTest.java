package tutorial.object.oriented.test;

import org.junit.Test;

import tutorial.object.oriented.AnonymousClass;
import tutorial.object.oriented.DataStructure;
import tutorial.object.oriented.Day;
import tutorial.object.oriented.LocalClass;
import tutorial.object.oriented.ShadowClass;
import tutorial.stub.EnumStub;;

public class ObjectOrientedTest {

	@Test
	public void testAnonymousClass() {
		AnonymousClass myApp = new AnonymousClass();
		myApp.sayHello();
	}
	
	@Test
	public void testDataStructure() {
		DataStructure ds = new DataStructure();
		ds.printEvent();
	}
	
	@Test
	public void testEnum() {
		EnumStub firstDay = new EnumStub(Day.MONDAY);

		firstDay.tellTtLikeItIs();

		EnumStub Thriday = new EnumStub(Day.WEDNESDAY);

		Thriday.tellTtLikeItIs();

		EnumStub seventhDay = new EnumStub(Day.SUNDAY);

		seventhDay.tellTtLikeItIs();
		
	}
	
	@Test
	public void testLocalClass() {
		LocalClass.validatePhoneNumber("123-456-7890", "456-7890");
	}
	
	@Test
	public void testShadowClassTestPublic() {

		ShadowClass st = new ShadowClass();

		ShadowClass.FirstLevel f1 = st.new FirstLevel();
		f1.methodInFristLevel(23);

	}


}
