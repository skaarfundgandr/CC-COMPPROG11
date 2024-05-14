import java.util.Scanner;

public class NameEcho {
	public static void main(String[] args) {
		// Object Declaration
		String input, lastName, firstName;
		// Object Definition
		Scanner scan = new Scanner(System.in);
		input = firstName = lastName = new String();
		// Input
		System.out.print("Enter your name: ");
		input = scan.nextLine().trim();
		// Process
		if (input.indexOf(' ') > 0){
			firstName = input.substring(0, input.indexOf(' '));	
			lastName = input.substring(input.indexOf(' ')).toUpperCase();
			System.out.println(firstName.concat(lastName)); // Output
		} else
			System.out.println(input);// Output
	}
}