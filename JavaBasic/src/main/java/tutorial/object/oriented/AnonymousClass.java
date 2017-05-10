package tutorial.object.oriented;

public class AnonymousClass {
	interface HelloWorld {
		public void greet();

		public void greetSomeone(String someone);
	}

	public void sayHello() {

		HelloWorld frenchGreeting = new HelloWorld() {
			String name = "tout le monde";

			public void greet() {
				greetSomeone("tout le monde");
			}

			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Salut " + name);
			}
		};

		HelloWorld spanishGreeting = new HelloWorld() {
			String name = "mundo";

			public void greet() {
				greetSomeone("mundo");
			}

			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hola, " + name);
			}
		};
		// englishGreeting.greet();
		frenchGreeting.greetSomeone("Fred");
		spanishGreeting.greet();
	}
}
