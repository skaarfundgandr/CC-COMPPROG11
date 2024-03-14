import java.util.Scanner;

public class OneLetterPerLine{
	public static void main(String[] args) {
		String word;
		int count = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a word: ");
		word = new String(scan.nextLine());

		while (count < word.length()){
			System.out.println(word.charAt(count));
			++count;
		}
	}
}