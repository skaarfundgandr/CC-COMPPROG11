import java.util.Scanner;

public class ApproximationToE{
	public static void main(String[] args) {
		double x, input;
		Scanner scan = new Scanner(System.in);
		System.out.printf("Enter x: ");
		input = scan.nextDouble();
		x = Math.pow((1.0 + (1.0 / input)), input);
		System.out.printf("Approximation to e: %10.7f%n", x);
	}
}