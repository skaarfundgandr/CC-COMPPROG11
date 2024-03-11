import java.util.Scanner;

public class SumOfSequentialIntegers{
	public static void main(String[] args) {
		int n, formulaSum = 0, loopSum = 0, firstNum = 1;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter N:");
		n = scan.nextInt();

		formulaSum = (n * (n + 1)) / 2;
		while (n > 0) {
			loopSum += firstNum;
			++firstNum;
			--n;
		}
		
		System.out.printf("Loop sum: %d\n", loopSum);
		System.out.printf("Formula sum: %d\n", formulaSum);
	}
}