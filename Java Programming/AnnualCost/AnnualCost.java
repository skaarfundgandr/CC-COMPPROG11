import java.util.Scanner;

public class AnnualCost{
	public static void main(String[] args) {
		double costPerHour, kwhPerYear, annualCost;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter cost per kilowatt-hour  in cents:");
		costPerHour = scan.nextDouble();
		System.out.println("Enter kilowatt-hours used per year");
		kwhPerYear = scan.nextDouble();

		annualCost = kwhPerYear / costPerHour;

		System.out.println("Annual cost: " + annualCost);
	}
}