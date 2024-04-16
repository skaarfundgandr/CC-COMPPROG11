import java.util.Scanner;

public class LinePerChar {
	public static void main(String[] args) {
		String str = new String();

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string:");
		str = scan.nextLine().trim();

		System.out.println();
		for (int i = 0; i < str.length(); ++i) {
			System.out.println(str.charAt(i));
		}
	}
}