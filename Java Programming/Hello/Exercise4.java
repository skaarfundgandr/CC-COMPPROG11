import java.util.Scanner;

class HelloObject {
	private String greeting; // Instance variable
	// Constructors
	public HelloObject(String str){ 
		this.greeting = str;
	}
	
	public HelloObject(HelloObject init){
		// Creates a new String object and copies the value
		// Stored in the on the object init
		this.greeting = new String(init.greeting);
	}
	// Methods
	public void greet(){
		System.out.println(greeting); // Prints out the greeting
	}
}

public class Exercise4 {
	public static void main(String[] args) {
		// Objects
		String greeting;
		HelloObject hello, helloInit;

		// Create Scanner instance to accept user input
		Scanner scan = new Scanner(System.in);

		// Prompts the user to enter the greeting
		System.out.println("Enter greeting:");
		greeting = scan.nextLine();

		// Create two object instances
		hello = new HelloObject(greeting);
		helloInit = new HelloObject(hello);

		System.out.println();
		helloInit.greet();
	}
}