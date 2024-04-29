import java.util.Scanner;

public class UnluckyNumbers {
	static boolean isUnlucky (long n) {
		while (n != 0) {
			if (n % 100 == 13) {
				return true;
			}
			n /= 10;
		}
		return false;
	}
	public static void main(String[] args) {
		long num;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number: ");
		num = scan.nextLong();

		while (num >= 0) {
			if (isUnlucky(num)) {
				System.out.printf("%d is unlucky\n", num);
			} else {
				System.out.printf("%d is safe\n", num);
			}

			System.out.print("Enter a number: ");
			num = scan.nextLong();
		}
	}
}