import java.util.Scanner;

public class SteamEngineEfficiency{
	public static void main(String[] args) {
		float efficiency, tAir, tSteam;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the air temperature: ");
		tAir = scan.nextFloat();
		System.out.print("Enter the steam temperature: ");
		tSteam = scan.nextFloat();

		efficiency = 1 - (tAir / tSteam);

		if (tSteam < 373) {
		 	efficiency = 0;
		}

		System.out.printf("Efficiency: %f\n", efficiency);
	}
}