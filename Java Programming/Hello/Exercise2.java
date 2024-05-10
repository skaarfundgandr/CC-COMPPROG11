class HelloObject {
	private String greet; // Instance variable
	// Constructor
	public HelloObject(String str){
		this.greet = str;
	}
	// Methods
	public void morningGreeting(){
		System.out.println("Good morning " + greet + "!");
	}
	public void eveningGreeting(){
		System.out.println("Good evening " + greet + "!");
	}
}

public class Exercise2 {
	public static void main(String[] args) {
		HelloObject hello; // Object Declaration

		hello = new HelloObject("World"); // Creates an object instance
		// Driver code
		hello.morningGreeting();
		hello.eveningGreeting();
	}
}