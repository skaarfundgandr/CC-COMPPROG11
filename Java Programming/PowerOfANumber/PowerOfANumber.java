import java.util.Scanner;
import java.text.DecimalFormat;

public class PowerOfANumber{
	public static void main(String[] args) {
		double base, baseRaisedToPow = 1;
		int pow, count;

		Scanner scan = new Scanner(System.in);
		DecimalFormat decform = new DecimalFormat(".######");

		System.out.println("Enter X");
		base = scan.nextDouble();
		System.out.println("Enter N");
		pow = scan.nextInt();
		if (pow < 1) {
			System.out.println("N must be a positive integer");
			System.exit(1);
		}

		count = pow;
		while (count > 0) {
			baseRaisedToPow *= base;
			--count;
		}

		System.out.printf("%s raised to the power of %d is: %f\n", decform.format(base), pow, baseRaisedToPow);
	}
}