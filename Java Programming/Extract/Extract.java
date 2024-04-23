import java.util.Scanner;

public class Extract {
	public static void main(String[] args) {
		String input = new String();

		Scanner scan = new Scanner(System.in);

		while (scan.hasNextLine()) {
			input = scan.nextLine().trim();

			if (input.contains("//")) {
				System.out.println(input.substring(input.indexOf("//")));
			}
		}
	}
}