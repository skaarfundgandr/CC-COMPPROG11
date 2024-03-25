import java.util.Scanner;

public class InputFilePrompt {
	public static void main(String[] args) {
		String fileName, subStr, compStr;
		boolean looped = true, hasSpace;

		Scanner scan = new Scanner(System.in);
		fileName = subStr = compStr = new String();

		compStr = ".dat";
		do{
			System.out.print("input file: ");
			fileName = scan.nextLine();
			hasSpace = false;

			subStr = fileName.substring(fileName.length() - compStr.length(), fileName.length());

			for (int i = 0; i < fileName.length(); ++i) {
				if (fileName.charAt(i) == ' ') {
					System.out.println(">>>file name must not contain spaces<<<");
					hasSpace = true;
					break;
				}
			}
			if (subStr.equals(compStr) && fileName.length() > compStr.length() && hasSpace == false) {
				System.out.println("Ok");
				looped = false;
			} 
			if (fileName.length() == compStr.length() && subStr.equals(compStr))
				System.out.println(">>>file name missing<<<");
			if (subStr.equals(compStr) == false && hasSpace == false)
				System.out.println(">>>file name must end in .dat<<<");
			

		} while (looped);
	}
}