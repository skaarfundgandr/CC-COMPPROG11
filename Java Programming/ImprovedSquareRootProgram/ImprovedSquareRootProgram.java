import java.util.Scanner;

public class ImprovedSquareRootProgram {
	public static void main(String[] args) {
		double x;
		boolean looped = true;

		Scanner scan = new Scanner(System.in);
		String chars = new String();

		do{
			System.out.print("Enter a number-->");
			x = scan.nextDouble();
			chars = scan.nextLine();

			System.out.println("Square root of " + x + " is " + Math.sqrt(x));
			do{
				System.out.print("Do you wish to continue? (yes or no) --> ");
				chars = scan.nextLine().toUpperCase();

				if (chars.equals("NO"))
					looped = false;
				if (!(chars.equals("NO") || chars.equals("YES")))
					System.out.println(">>>Please respond with (yes or no)<<<");
			} while (!(chars.equals("NO") || chars.equals("YES")));
		} while (looped);
		System.out.println("Bye");
	}
}