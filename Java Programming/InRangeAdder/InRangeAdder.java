import java.util.Scanner;

public class InRangeAdder {
	public static void main(String[] args) {
		int low, high, num, sumRange = 0, sumOutOfRange = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("In-range Adder");

		System.out.println("Low end of range");
		low = scan.nextInt();
		System.out.println("High end of range");
		high = scan.nextInt();

		System.out.println("Enter data:");
		while ((num = scan.nextInt()) != 0){
			if (num >= low && num <= high)
				sumRange += num;
			else
				sumOutOfRange += num;
			System.out.println("Enter data: ");
		}

		System.out.printf("Sum of in range values: %d\n", sumRange);
		System.out.printf("Sum of out of range values: %d\n", sumOutOfRange);
	}
}