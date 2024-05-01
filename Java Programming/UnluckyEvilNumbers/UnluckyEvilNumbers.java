import java.util.Scanner;

public class UnluckyEvilNumbers {
	static boolean isUnlucky(long n){
		while (n != 0) {
			if (n % 100 == 13) {
				return true;
			}
			n /= 10;
		}
		return false;
	}

	static boolean isEvil(long n){
		long ones = 0;
		do {
			if (n % 2 == 1) {
				++ones;
			}
			n /= 2;
		} while (n != 0);
		if (ones % 2 == 1) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		long num;

		Scanner scan =  new Scanner(System.in);

		System.out.print("Enter the range of numbers to test: ");
		num = scan.nextLong();

		for (int i = 1; i <= num; ++i) {
			if (isUnlucky(i)) {
				if (isEvil(i))
					System.out.printf("%d is unlucky and evil\n", i);
				else
					System.out.printf("%d is unlucky\n", i);
			}
		}
		System.out.println("bye");
	}
}