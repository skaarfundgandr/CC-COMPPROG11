import java.util.Scanner;

public class CharacterCounter {
	public static void main(String[] args) {
		int numVowels = 0, numConsonants = 0, numSpaces = 0, numPunct = 0;
		String str = new String();

		Scanner scan = new Scanner(System.in);

		System.out.println("Input a string:");
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
					if ((int) str.toUpperCase().charAt(i) >= 65 && str.toUpperCase().charAt(i) < 91){
						++numConsonants;
					}
		 	}
		}

		System.out.println("Number of consonants: " + numConsonants);
		System.out.println("Number of vowels: " + numVowels);
		System.out.println("Number of spaces: " + numSpaces);
		System.out.println("Number of punctuations: " + numPunct); 
	}
}