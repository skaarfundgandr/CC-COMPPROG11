import java.util.Scanner;
import java.text.DecimalFormat;

public class DiscountPrices{
	public static void main(String[] args) {
		double amount;

		Scanner scan = new Scanner(System.in);
		DecimalFormat decform = new DecimalFormat("$.##");
		
		System.out.println("Enter the amount of purchases:");
		amount = scan.nextDouble();

		if (amount > 10.00) {
			amount *= 0.90;
		}
		System.out.printf("Discounted price: %s\n", decform.format(amount));
	}
}