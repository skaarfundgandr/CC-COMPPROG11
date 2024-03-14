import java.util.Scanner;

public class WordEcho{
	public static void main(String[] args) {
		String word;
		int times = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a word:");
		word = new String(scan.nextLine());
		System.out.println();

		while (times < word.length()){
			System.out.printf("%s\n", word);
			++times;
		}

	}
}