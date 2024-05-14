import java.util.Scanner;

public class Extract {
	public static void main(String[] args) {
		String input; // Object Declaration

		Scanner scan = new Scanner(System.in); // Scanner instance for input
		// Process
		while (scan.hasNextLine()) {
			input = scan.nextLine().trim();

			if (input.contains("//")) {
				System.out.println(input.substring(input.indexOf("//"))); // Outputs comments in code
			}
		}
	}
}