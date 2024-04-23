import java.util.Scanner;

public class PasswordChecker {
	public static void main(String[] args) {
		boolean hasUpper, hasLower, hasDigit;

		String password = new String();
		Scanner scan = new Scanner(System.in);

		do {
			hasUpper = hasLower = hasDigit = false;

			System.out.println("Enter your password:");
			password = scan.nextLine();

			if (password.length() >= 7) {
				for (int i = 0; i < password.length(); ++i) {
					if (Character.isUpperCase(password.charAt(i)))
						hasUpper = true;
					if (Character.isLowerCase(password.charAt(i)))
						hasLower = true;
					if (Character.isDigit(password.charAt(i)))
						hasDigit = true;
					if (hasDigit && hasUpper && hasLower)
						break;
				}
				if (!(hasUpper && hasLower && hasDigit)) {
					System.out.println("That password is not acceptable\n");
				}
			} 
			else
				System.out.println("That password is not acceptable\n");
		} while (!(hasDigit && hasLower && hasUpper));

		System.out.println("Acceptable password");
	}
}