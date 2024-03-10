import java.util.Scanner;
import java.text.DecimalFormat;

public class TownDump{
	public static void main(String[] args) {
		int weight;
		float charge;

		Scanner scan = new Scanner(System.in);
		DecimalFormat decform = new DecimalFormat("$###,###,###.00");

		System.out.print("Enter the total weight of the trash to be disposed: ");
		weight = scan.nextInt();

		charge = (float) 20 + (8 * ((weight - 200) / 100));
		if (weight < 200) {
			System.out.println("Invalid weight! Weight must be atleast 200!");
			System.exit(1);
		}

		System.out.printf("Total charge is %s\n", decform.format(charge));
	}
}