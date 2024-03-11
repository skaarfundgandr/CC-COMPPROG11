import java.util.Scanner;

public class RunOfIntegers{
	public static void main(String[] args) {
		int start, end;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter start:");
		start = scan.nextInt();
		System.out.println("Enter end:");
		end = scan.nextInt();

		System.out.println("");
		while (start <= end) {
			System.out.printf("%d\n", start);
			++start;
		}
	}
}