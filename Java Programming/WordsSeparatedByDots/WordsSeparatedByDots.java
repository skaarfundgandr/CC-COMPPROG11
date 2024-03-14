import java.util.Scanner;

public class WordsSeparatedByDots{
	public static void main(String[] args) {
		String firstWord, secondWord;
		int lineLength = 30;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first word:");
		firstWord = new String(scan.nextLine());
		System.out.println("Enter second word:");
		secondWord = new String(scan.nextLine());

		System.out.print(firstWord);
		while (firstWord.length() < lineLength - secondWord.length()){
			System.out.print(".");
			--lineLength;
		}
		System.out.printf("%s\n", secondWord);

	}
}