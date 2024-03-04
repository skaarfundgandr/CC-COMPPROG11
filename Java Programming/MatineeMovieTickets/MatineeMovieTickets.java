import java.util.Scanner;
import java.text.DecimalFormat;

public class MatineeMovieTickets{
	public static void main(String[] args) {
		final int adultAge = 13, matineeTime = 1700;
		final double normalAdultPrice = 8.00, matineeAdultPrice = 5.00;
		final double normalChildrenPrice = 4.00, matineeChildrenPrice = 2.00;
		int time, age;
		double price;

		Scanner scan = new Scanner(System.in);
		DecimalFormat currencyForm = new DecimalFormat("$###,###,###.0#");

		System.out.print("Enter the current time: ");
		time = scan.nextInt();
		System.out.print("Enter age: ");
		age = scan.nextInt();

		

	}
}