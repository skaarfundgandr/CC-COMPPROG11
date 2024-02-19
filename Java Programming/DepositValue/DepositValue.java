import java.text.*;
import java.util.Scanner;

public class DepositValue {
	public static void main(String[] args) {
		double value, initialDeposit, interestRate, timesPerYear, years;
		Scanner scan = new Scanner(System.in);
		DecimalFormat decform = new DecimalFormat("$###,###,###.##");
		System.out.print("Initial deposit\t: ");
		initialDeposit = scan.nextDouble();
		System.out.print("\nInterest rate\t: ");
		interestRate = scan.nextDouble();
		System.out.print("\nTimes per year\t: ");
		timesPerYear = scan.nextDouble();
		System.out.print("\nNumber of years\t: ");
		years = scan.nextDouble();
		value = initialDeposit * Math.pow((1.0 + interestRate / timesPerYear), timesPerYear * years);
		System.out.println("\nValue: " + decform.format(value));
	}
}