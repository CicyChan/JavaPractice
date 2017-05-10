package tutorial.object.oriented;

public class ShadowClass {

	public int x = 0;

	public class FirstLevel {
		public int x = 1;

		public void methodInFristLevel(int x) {
			System.out.println("x = " + x);

			System.out.println("this.x = " + this.x);

			System.out.println("ShadowClass.this.x = " + ShadowClass.this.x);
		}
	}
}
