import java.util.Scanner;

public class FactorialErrorFlag {
	static long fact(int num){
		long fact = 1;
		if (num > 20 || num < 0)
			return -1;
		for (int i = 1; i <= num; i++)
			fact *= i;		
		return fact;
	}

	public static void main(String[] args) {
		int n;

		Scanner scan = new Scanner(System.in);

		System.out.println("To exit, enter a negative value");
		System.out.print("Enter N: ");

		n = scan.nextInt();

		while (n > 0){
			scan.nextLine(); // Discard the rest of the line

			if (fact(n) == -1)
				System.out.println("Error encountered, please enter a nonnegative value less than 20");

			System.out.printf("factorial is %d\n\n", fact(n));

			System.out.print("Enter N: ");
			n = scan.nextInt();
		}

		System.out.println("bye");
	}
}