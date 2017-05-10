package tutorial.object.oriented.test;

import org.junit.Test;

import tutorial.object.oriented.ShadowClass;

public class ShadowClassTestPublic {

	@Test
	public void test() {

		ShadowClass st = new ShadowClass();

		ShadowClass.FirstLevel f1 = st.new FirstLevel();
		f1.methodInFristLevel(23);

	}

}
