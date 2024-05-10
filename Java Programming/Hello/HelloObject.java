import java.util.Scanner;

public class HelloObject {
	private String greeting;
	private Scanner scan = new Scanner(System.in);
	// Constructors
	public HelloObject() { // Void constructor to use methods without parameters
		this.greeting = new String("Hello");
	} 
	public HelloObject(String str){
		this.greeting = str;
	}
	public HelloObject(HelloObject init){
		this.greeting = init.greeting.concat(" From another object");
	}
	// Methods
	public void greetLooped() {
		for (int i = 0; i < greeting.length(); ++i)
			System.out.println(greeting);
	}
	public void morningGreeting() {
		System.out.println("Good morning World!");
	}
	public void eveningGreeting() {
		System.out.println("Good evening World!");
	}
	public void greet() {
		System.out.println("Enter Greeting:");
		this.greeting = scan.nextLine();
		System.out.println(greeting);
	}
}