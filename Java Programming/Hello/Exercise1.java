class HelloObject{ // Hello Object class
	private String greeting;
	// Constructor
	public HelloObject(String str){
		this.greeting = str;
	}

	// Method
	public void greetLooped(){ // Method that repeats the greeting as many times as the length of the greeting string
		for (int i = 0; i < greeting.length(); ++i)
			System.out.println(greeting);
	}
}

public class Exercise1 {
	public static void main(String[] args) {
		HelloObject hello;

		hello = new HelloObject("Hello"); // Create a new HelloObject instance

		hello.greetLooped();
	}
}