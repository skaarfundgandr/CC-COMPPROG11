import java.util.Scanner;

public class AddUpNumbers {
	public static void main(String[] args) {
		int value, sum = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter first integer (enter 0 to quit): ");
		value = scan.nextInt();

		if (value != 0) {
			while (value != 0){
				sum += value;
				System.out.print("Enter an integer (enter 0 to quit): ");
				value = scan.nextInt();
			}
			System.out.printf("Sum of the integers: %d\n", sum);
		}
		else
			System.out.println("No integers were entered.");

		System.out.println("bye");
	}
}