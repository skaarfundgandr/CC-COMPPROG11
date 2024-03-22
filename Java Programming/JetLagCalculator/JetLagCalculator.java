import java.util.Scanner;
import java.text.DecimalFormat;

public class JetLagCalculator {
	public static void main(String[] args) {
		int hoursTraveled, timezones, departureTime;
		int arrivalTime, depart = 0, arrive = 4;
		float daysToRecover;

		Scanner scan = new Scanner(System.in);
		DecimalFormat decform = new DecimalFormat("0.######");

		System.out.print("Enter the hours of travel: ");
		hoursTraveled = scan.nextInt();
		System.out.print("Enter the number of timezones crossed: ");
		timezones = scan.nextInt();
		System.out.print("Enter the departure time: ");
		departureTime = scan.nextInt();
		System.out.print("Enter the arrival time: ");
		arrivalTime = scan.nextInt();

		depart = departureTime > 12 && departureTime <= 18 ? 1:
		departureTime > 18 && departureTime <= 22 ? 3:
		departureTime > 22 || departureTime <= 1 ? 4: 
		departureTime > 1 && departureTime <= 8 ? 5: 0;

		arrive = arrivalTime > 12 && arrivalTime <= 18 ? 2:
		arrivalTime > 18 && arrivalTime <= 22 ? 0:
		arrivalTime > 22 || arrivalTime <= 1 ? 1: 
		arrivalTime > 1 && arrivalTime <= 8 ? 3: 4;

		daysToRecover = (((hoursTraveled / 2f) + (timezones - 3)) + depart + arrive) / 10f;

		if (departureTime < 0 || arrivalTime < 0) {
			System.out.println("Invalid input! Input must not be negative!");
			System.exit(1);
		}
		if (departureTime > 24 || arrivalTime > 24) {
			System.out.println("Invalid input! Please enter the values in 24 hour format!");
			System.exit(1);
		}


		System.out.printf("Days to recover from jet lag: %s\n", decform.format(daysToRecover));
	}
}