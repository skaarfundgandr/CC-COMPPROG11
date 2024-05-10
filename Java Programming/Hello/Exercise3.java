import java.util.Scanner;

class HelloObject {
	private String greet; // Instance variable
	// Constructor
	public HelloObject(String str){
		this.greet = str;
	}
	// Method
	public void greet(){
		System.out.println(greet);
	}
}

public class Exercise3 {
	public static void main(String[] args) {
		// Objects
		String greeting;
		HelloObject hello;

		Scanner scan = new Scanner(System.in); // Creates a new Scanner instance
		// Prompts the user to input a greeting
		System.out.println("Enter Greeting:");
		greeting = scan.nextLine();

		hello = new HelloObject(greeting); // Creates a new HelloObject instance

		System.out.println();
		hello.greet();
	}
}