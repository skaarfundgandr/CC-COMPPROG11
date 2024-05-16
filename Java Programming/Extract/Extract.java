import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Extract {
	public static void main(String[] args) {
		String input; // Object Declaration

		try{
			File fileObject = new File("Hello.java");
			Scanner scan = new Scanner(fileObject); // Scanner instance for input
			// Process
			while (scan.hasNextLine()) {
				input = scan.nextLine().trim();

				if (input.contains("//")) {
					System.out.println(input.substring(input.indexOf("//"))); // Outputs comments in code
				}
			}
		} catch (FileNotFoundException e){ // Detects if file does not exist and throws an error
			System.out.println("File not found please try again");
		}
	}
}