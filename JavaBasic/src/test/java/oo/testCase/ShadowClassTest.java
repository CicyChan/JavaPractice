package test.java.oo.testCase;

public class ShadowClassTest {
	
	public int x = 0;
	
	class FirstLevel{
		public int x = 1;
		
		void methodInFristLevel(int x){
			System.out.println("x = " + x);
			
			System.out.println("this.x = " + this.x);
			
			System.out.println("ShadowClass.this.x = " + ShadowClassTest.this.x);
		} 
	}

	public static void main(String[] args) {
		ShadowClassTest st = new ShadowClassTest();
		
		ShadowClassTest.FirstLevel f1 = st.new FirstLevel();
		f1.methodInFristLevel(23);

	}

}
