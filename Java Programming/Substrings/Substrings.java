import java.util.Scanner;

public class Substrings{
	public static void main(String[] args) {
		int beginIndex, endIndex;
		String str, subStr;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string:");
		str = new String(scan.nextLine());
		System.out.println("Enter begin index:");
		beginIndex = scan.nextInt();
		System.out.println("Enter end index:");
		endIndex = scan.nextInt();

		subStr = str.substring(beginIndex, endIndex);

		System.out.println("Original string\n" + str + "\n");
		System.out.println("Substring:\n" + subStr);
	}
}