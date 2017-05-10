package tutorial.object.oriented.test;

public class ShadowClassTestPrivate {

	public int x = 0;

	class FirstLevel {
		public int x = 1;

		void methodInFristLevel(int x) {
			System.out.println("x = " + x);

			System.out.println("this.x = " + this.x);

			System.out.println("ShadowClass.this.x = " + ShadowClassTestPrivate.this.x);
		}
	}

	public static void main(String[] args) {
		ShadowClassTestPrivate st = new ShadowClassTestPrivate();

		ShadowClassTestPrivate.FirstLevel f1 = st.new FirstLevel();
		f1.methodInFristLevel(23);

	}

}
