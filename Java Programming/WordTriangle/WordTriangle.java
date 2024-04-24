import java.util.Scanner;

public class WordTriangle {
	public static void main(String[] args) {
		int endIndex;

		String word = new String();
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a word -->");
		word = scan.nextLine().trim();

		endIndex = word.length();

		for (int i = 0; i <= word.length() / 2; ++i, --endIndex) {
			for (int space = 0; space < i; ++space) {
				System.out.print(" ");
			}
			System.out.print(word.substring(i, endIndex));
			System.out.println();
		}
	}
}