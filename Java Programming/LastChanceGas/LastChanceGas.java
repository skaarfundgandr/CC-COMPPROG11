import java.util.Scanner;

public class LastChanceGas{
	public static void main(String[] args) {
		int tankCapacity, milesPerGallon, gageReading;

		Scanner scan = new Scanner(System.in);

		System.out.println("Tank capacity: ");
		tankCapacity = scan.nextInt();
		System.out.println("Gage reading: ");
		gageReading = scan.nextInt();
		System.out.println("Miles per gallon: ");
		milesPerGallon = scan.nextInt();
		
		if ((float) (tankCapacity * (gageReading / 100.0)) * milesPerGallon < 200.0)
			System.out.println("Get gas!");
		else
			System.out.println("Safe to proceed");
	}
}