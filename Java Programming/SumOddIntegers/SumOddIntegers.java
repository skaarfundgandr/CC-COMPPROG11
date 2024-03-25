import java.util.Scanner;

public class SumOddIntegers {
	public static void main(String[] args) {
		int n, sum = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the value of N: ");
		n = scan.nextInt();

		for (int i = 1; i <= n; ++i) {
			if (i % 2 == 1)
				sum += i;
		}

		System.out.println("Sum of odd integers from 1 to N is " + sum);
	}
}