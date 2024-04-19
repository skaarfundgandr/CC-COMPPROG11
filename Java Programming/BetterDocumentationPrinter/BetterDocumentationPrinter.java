import java.util.Scanner;

public class BetterDocumentationPrinter {
	public static void main(String[] args) {
		boolean documentationEncountered = false;

		String input = new String();

		Scanner scan = new Scanner(System.in);

		while (scan.hasNextLine()) {
			input = scan.nextLine().trim();

			if (input.contains("//"))
				System.out.println(input.substring(input.indexOf("//")));
			if (input.contains("/*"))
				documentationEncountered = true;
			if (documentationEncountered)
				System.out.println(input);
			if (input.contains("*/"))
				documentationEncountered = false;
		}
	}
}