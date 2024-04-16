import java.util.Scanner;

public class NameEcho {
	public static void main(String[] args) {
		String input, lastName, firstName;

		Scanner scan = new Scanner(System.in);
		input = firstName = lastName = new String();

		System.out.print("Enter your name: ");
		input = scan.nextLine().trim();

		if (input.indexOf(' ') > 0){
			firstName = input.substring(0, input.indexOf(' '));	
			lastName = input.substring(input.indexOf(' ')).toUpperCase();
			System.out.println(firstName.concat(lastName));
		} else
			System.out.println(input);
	}
}