import java.io.ObjectOutputStream.PutField;
import java.util.Scanner;

public class SumRangeOfSequentialIntegers{
	public static void main(String[] args) {
		int low, high, sum = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter low:");
		low = scan.nextInt();
		System.out.println("Enter high:");
		high = scan.nextInt();

		while (low <= high){
			sum += low;
			++low;
		}

		System.out.printf("Sum = %d\n", sum);

	}
}