import java.util.Scanner;

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
		String greeting;

		Scanner scan = new Scanner(System.in);
		HelloObject hello;

		System.out.println("Enter greeting:");
		greeting =  scan.nextLine();
		System.out.println();

		hello = new HelloObject(greeting);

		hello.greetLooped();
	}
}