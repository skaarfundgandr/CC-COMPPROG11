import java.util.Scanner;

public class PasswordChecker {
	public static void main(String[] args) {
		// Variable declarations
		boolean hasUpper, hasLower, hasDigit;
		// Objects
		String password, upper, lower;
		Scanner scan = new Scanner(System.in);

		do {
			hasUpper = hasLower = hasDigit = false;

			System.out.println("Enter your password:");
			password = scan.nextLine();
			// Checks if password length is atleast 7
			if (password.length() >= 7) {
				// Create two strings one for uppercase and one for lowercase
				upper = new String(password.toUpperCase());
				lower = new String(password.toLowerCase());

				for (int i = 0; i < password.length(); ++i) {
					// Compare if password contains an uppercase and a lowercase
					if (password.charAt(i) == upper.charAt(i))
						hasUpper = true;
					if (password.charAt(i) == lower.charAt(i))
						hasLower = true;
					// Checks if password has digits by using ASCII values
					if ((int) password.charAt(i) >= '0' && password.charAt(i) <= '9')
						hasDigit = true;
					// Exit loop if the password has digits, uppercase and lowercase
					if (hasDigit && hasUpper && hasLower)
						break;
				}
				if (!(hasUpper && hasLower && hasDigit)) // Prompts user again if password doesn't satisfy the conditions
					System.out.println("That password is not acceptable\n");
			} 
			else // Prompts user if password is less than 7 characters long
				System.out.println("That password is not acceptable\n");
		} while (!(hasDigit && hasLower && hasUpper));

		System.out.println("Acceptable password");
	}
}