import java.util.Scanner;
import java.text.DecimalFormat;

public class CreditCardBill {
	public static void main(String[] args) {
		double balance, monthlyPayment, monthlyInterest, totalPayments = 0;
		int currMonth = 1;

		Scanner scan = new Scanner(System.in);
		DecimalFormat decform = new DecimalFormat(",##0.00");

		System.out.println("Enter the current balance:");
		balance = scan.nextDouble();
		System.out.println("Enter the monthly interest:");
		monthlyInterest = scan.nextDouble();
		monthlyInterest /= 100; // Converts monthly interest to a decimal
		System.out.println("Enter the monthly payment:");
		monthlyPayment = scan.nextDouble();

		while (balance > 0) {
			balance += (balance * monthlyInterest);
			balance -= monthlyPayment;
			totalPayments += monthlyPayment;

			System.out.printf("Month: %d\tbalance: %s\t  total payments: %s\n", currMonth, decform.format(balance), decform.format(totalPayments));
			++currMonth;
		}
	}
}