package test.java.oo;

public class ShadowClass {
	
	public int x = 0;
	
	class FirstLevel{
		public int x = 1;
		
		void methodInFristLevel(int x){
			System.out.println("x = " + x);
			
			System.out.println("this.x = " + this.x);
			
			System.out.println("ShadowClass.this.x = " + ShadowClass.this.x);
		} 
	}

	public static void main(String[] args) {
		ShadowClass st = new ShadowClass();
		
		ShadowClass.FirstLevel f1 = st.new FirstLevel();
		f1.methodInFristLevel(23);

	}

}
