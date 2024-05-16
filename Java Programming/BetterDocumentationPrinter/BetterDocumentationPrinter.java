import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BetterDocumentationPrinter {
	public static void main(String[] args) {
		boolean documentationEncountered = false;
		String input;

		try{
			File fileObject = new File("Hello.java");
			Scanner fscan = new Scanner(fileObject);

			while (fscan.hasNextLine()) {
				input = fscan.nextLine().trim();

				if (input.contains("//"))
					System.out.println(input.substring(input.indexOf("//")));
				if (input.contains("/*"))
					documentationEncountered = true;
				if (documentationEncountered)
					System.out.println(input);
				if (input.contains("*/"))
					documentationEncountered = false;
			}
		} catch (FileNotFoundException e){
			System.out.println("File not found please try again");
		}
	}
}