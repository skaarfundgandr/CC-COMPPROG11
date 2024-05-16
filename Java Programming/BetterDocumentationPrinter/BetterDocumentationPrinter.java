import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BetterDocumentationPrinter {
	public static void main(String[] args) {
		boolean documentationEncountered = false; // Variable declaration
		String input; // Object declaration

		try{
			File fileObject = new File("Hello.java"); // Create new file object
			Scanner fscan = new Scanner(fileObject); // Scanner instance to read contents in file
			// Driver code
			while (fscan.hasNextLine()) {
				input = fscan.nextLine().trim();
				// Detects if input contains a documentation block or line
				if (input.contains("//"))
					System.out.println(input.substring(input.indexOf("//"))); // Outputs line
				if (input.contains("/*"))
					documentationEncountered = true;
				if (documentationEncountered)
					System.out.println(input);
				if (input.contains("*/"))
					documentationEncountered = false;
			}
		} catch (FileNotFoundException e){ // Detects if file does not exist and throws an error
			System.out.println("File not found please try again");
		}
	}
}