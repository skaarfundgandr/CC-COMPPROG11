import java.util.Scanner;

public class OdiusNumbers {
	static boolean isOdius (long n){
		long ones = 0;
		do {
			if (n % 2 == 1) {
				++ones;
			}
			n /= 2;
		} while (n != 0);
		if (ones % 2 == 1) {
			return true;
		}
		return false;

	}
	public static void main(String[] args) {
		long num;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number: ");
		num = scan.nextLong();

		while (num > 0) {
			if (isOdius(num)) {
				System.out.println("Odius");
			} else {
				System.out.println("Evil");
			}

			System.out.print("Enter a number: ");
			num = scan.nextLong();
		}
	}
}