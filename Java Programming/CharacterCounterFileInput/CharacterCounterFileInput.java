import java.util.Scanner;
import java.text.DecimalFormat;

public class CharacterCounterFileInput {
	public static void main(String[] args) {
		int numVowels = 0, numConsonants = 0, numSpaces = 0, numPunct = 0;
		double sum = 0, percentVowels, percentConsonants, percentSpaces, percentPunct;
		String str = new String();

		Scanner scan = new Scanner(System.in);
		DecimalFormat percentForm = new DecimalFormat(" (%#0.0#)");

		while(scan.hasNextLine()){
			str = scan.nextLine();
			for (int i = 0; i < str.length(); ++i) {
				switch (str.toLowerCase().charAt(i)) {
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':
						++numVowels;
						break;
					case ' ':
						++numSpaces;
						break;
					case '!':
					case '.':
					case '?':
					case ';':
					case ':':
					case ',':
					case '_':
					case '-':
					case '\'':
					case '"':
					case '(':
					case ')':
					case '[':
					case ']':
					case '{':
					case '}':
						++numPunct;
						break;
					default:
						if ((int) str.toUpperCase().charAt(i) >= 65 && str.toUpperCase().charAt(i) < 91)
							++numConsonants;
			 	}
			}
		}
		sum += numPunct + numSpaces + numVowels + numConsonants;
		percentVowels = (numVowels / sum);
		percentConsonants = (numConsonants / sum);
		percentSpaces = (numSpaces / sum);
		percentPunct = (numPunct / sum);

		System.out.println("Number of consonants: " + numConsonants + percentForm.format(percentConsonants));
		System.out.println("Number of vowels: " + numVowels + percentForm.format(percentVowels));
		System.out.println("Number of spaces: " + numSpaces + percentForm.format(percentSpaces));
		System.out.println("Number of punctuations: " + numPunct + percentForm.format(percentPunct)); 
	}
}