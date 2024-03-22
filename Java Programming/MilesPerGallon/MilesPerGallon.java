import java.util.Scanner;
import java.text.DecimalFormat;

public class MilesPerGallon {
	public static void main(String[] args) {
		int initialMiles, finalMiles, gallons;
		float milesPerGallon;

		Scanner scan = new Scanner(System.in);
		DecimalFormat decform = new DecimalFormat("0.0######");

		System.out.println("Miles Per Gallon Program");

		System.out.println("Initial miles: ");
		while ((initialMiles = scan.nextInt()) >= 0){
			System.out.println("Final miles: ");
			finalMiles = scan.nextInt();
			System.out.println("Gallons");
			gallons = scan.nextInt();

			milesPerGallon = (float) (finalMiles - initialMiles) / gallons;

			System.out.printf("Miles per gallon: %s\n", decform.format(milesPerGallon));

			System.out.println("Initial miles: ");
		}

		System.out.println("bye");
	
	}

}