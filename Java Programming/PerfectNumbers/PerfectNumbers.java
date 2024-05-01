import java.util.Scanner;

public class PerfectNumbers {
	static boolean isPerfect(int num){
		int sum = 0;

		for (int i = 1; i < num; ++i) {
			if (num % i == 0)
				sum += i;
		}
		if (sum == num)
			return true;
		return false;
	}

	public static void main(String[] args) {
		int num;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number: ");
		num = scan.nextInt();

		while (num < 0) {
			scan.nextLine(); // Discard input
			System.out.println("Please enter a non negative number!");
			System.out.print("Enter a number: ");
			num = scan.nextInt();
		}

		if (isPerfect(num))
			System.out.printf("%d is a perfect number\n", num);
		else
			System.out.printf("%d is not a perfect number\n", num);

	}
}