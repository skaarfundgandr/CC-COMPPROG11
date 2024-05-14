import java.util.Scanner;

public class ImageDisplay {
	public static void main(String[] args) {
		int digit;
		// Scanner object
		Scanner scan = new Scanner(System.in);

		while (scan.hasNextInt()) {
			digit = scan.nextInt();

			digit = digit/8;
			if (digit >= 0){
				switch (digit) {
					case 0:
						System.out.print(" ");
						break;
					case 1:
						System.out.print(".");
						break;
					case 2:
						System.out.print(",");
						break;
					case 3:
						System.out.print("-");
						break;
					case 4:
						System.out.print("+");
						break;
					case 5:
						System.out.print("o");
						break;
					case 6:
						System.out.print("O");
						break;
					default:
						System.out.print("X");
						break;
				}
			}
			else
				System.out.println("Please do not include a negative number");
		}
		System.out.println();
	}
}