import java.util.Scanner;

public class Combinations {
	static long fact(int num) {
		long fact = 1;
		if (num > 20 || num < 0)
			return -1;
		for (int i = 1; i <= num; i++)
			fact *= i;		
		return fact;
	}
	public static void main(String[] args) {
		int n, r;
		long numCombinations;

		Scanner scan = new Scanner(System.in);

		System.out.println("To exit, enter a negative value");

		System.out.print("Enter N: ");
		n = scan.nextInt();
		
		if (n >= 0) {
			System.out.print("Enter R: ");
			r = scan.nextInt();

			while (n >= 0 && r >= 0){
				scan.nextLine(); // Discard rest of the input

				if (fact(n) == -1) {
					System.out.println("Factorial cannot be calculated for N please enter numbers that aren't larger than 20");
				}
				if (fact(r) == -1) {
					System.out.println("Factorial cannot be calculated for R please enter numbers that aren't larger than 20");
				}

				numCombinations = fact(n) / (fact(r) * fact(n - r));

				System.out.printf("Total number combinations is %d\n\n", numCombinations);

				System.out.print("Enter N: ");
				n = scan.nextInt();

				System.out.print("Enter R: ");
				r = scan.nextInt();
			}
		}
		System.out.println("bye");
	}
}