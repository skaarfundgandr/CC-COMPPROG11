import java.util.Scanner;

public class MaximumIntegersInFile {
	public static void main(String[] args) {
		int max = 0, num, sum = 0;

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; ++i) {
			num = scan.nextInt();
			sum += num;
			if (num > max)
				max = num;
		}

		System.out.println("Sum of integers: " + sum);
		System.out.println("Maximum integer: " + max);
	}
}