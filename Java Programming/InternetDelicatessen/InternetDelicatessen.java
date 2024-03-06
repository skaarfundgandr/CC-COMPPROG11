import java.util.Scanner;
import java.text.DecimalFormat;

public class InternetDelicatessen{
	public static void main(String[] args) {
		String item;
		double price, total, delivery = 0;
		int choice;

		DecimalFormat decform = new DecimalFormat("$###,###.00");
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the item: ");
		item = new String(scan.nextLine());
		System.out.print("Enter the price: ");
		price = scan.nextDouble();
		System.out.print("Overnight delivery? (0 == no, 1 == yes): ");
		choice = scan.nextInt();

		if (price < 10) {
			delivery += 2;
		}
		if (choice == 1){
			delivery += 3;
		}
		total = delivery + price;
		System.out.printf("Invoice:\n  %s\t%s\n  delivery\t%s\n  total\t\t%s\n",
						   item, decform.format(price), decform.format(delivery), decform.format(total));
	}
}