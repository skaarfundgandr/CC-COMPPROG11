import java.util.Scanner;

public class FloatFactorial {
	public static void main(String[] args) {
		long n, count;
		double fact = 1;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter N: ");
		n = scan.nextLong();

		if (n >= 0) {
			count = n;
			while (count > 0){
				if (count > n - 1) {
					fact *= n;
					--count;
				}
				else
					--count;
			}
			System.out.printf("Factorial is %f\n", fact);
		}
		else
			System.out.println("N must be zero or greater");
	}
}