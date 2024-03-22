import java.util.Scanner;
import java.text.DecimalFormat;

public class ShippingCostCalculator {
	public static void main(String[] args) {
		int weight;
		float shippingCost;

		Scanner scan = new Scanner(System.in);
		DecimalFormat decform = new DecimalFormat("$#,##0.00");

		System.out.println("Weight of Order:");
		while ((weight = scan.nextInt()) != 0) {
			shippingCost = (float) (weight <= 10 ? 3: 3 + ((weight - 10) * 0.25));
			System.out.printf("Shipping Cost: %s\n\n", decform.format(shippingCost));

			System.out.println("Weight of Order:");
		}

		System.out.println("\nbye");
	}
}