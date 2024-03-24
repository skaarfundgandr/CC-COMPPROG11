import java.util.Scanner;

public class LoginSimulator {
	public static void main(String[] args) {
		String username, password;
		boolean looped = true;

		Scanner scan = new Scanner(System.in);

		while (looped) {
			System.out.print("User Name: ");
			username = new String(scan.nextLine());
			System.out.print("Password: ");
			password = new String(scan.nextLine());

			if (username.equals("joy") && password.equals("sun")) {
				System.out.println("You have logged on with priority 4");				
			} else if (username.equals("gates") && password.equals("monopoly")) {
				System.out.println("you have logged on with priority 1");
			} else if (username.equals("jobs") && password.equals("apple")) {
				System.out.println("You have logged on with priority 3");
			} else if (username.equals("root") && password.equals("secret")) {
				System.out.println("You have logged on with priority 5");
			} else if (username.equals("quit") && password.equals("exit")) {
				System.out.println("System shutting down");
				looped = false;
			}
		}

		System.out.println("bye");
	}
}