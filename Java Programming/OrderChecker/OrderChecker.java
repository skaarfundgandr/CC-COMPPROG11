import java.util.Scanner;

public class OrderChecker{
	public static void main(String[] args) {
		int numBolts, numNuts, numWashers, cost;
		final int boltPrice = 5, nutPrice = 3, washerPrice = 1;

		Scanner scan = new Scanner(System.in);

		System.out.print("Number of bolts: ");
		numBolts = scan.nextInt();
		System.out.print("Number of nuts: ");
		numNuts = scan.nextInt();
		System.out.print("Number of washers: ");
		numWashers = scan.nextInt();

		if (numNuts != numBolts) {
			if (numNuts > numBolts) {
				System.out.println("Check the order: too few bolts");
				System.exit(1);
			}
			System.out.println("Check the order: too few nuts");
			System.exit(1);
		}
		if (numWashers != numBolts * 2) {
			System.out.println("Check the order: too few washers");
			System.exit(1);
		}

		cost = (numBolts * boltPrice) + (numNuts * nutPrice) + (numWashers * washerPrice);

		System.out.println("Order is OK");
		System.out.println("Total cost: " + cost);
	}
}