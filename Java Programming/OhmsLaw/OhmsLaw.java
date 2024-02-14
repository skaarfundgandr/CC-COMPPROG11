import java.util.Scanner;

public class OhmsLaw{
	public static void main(String[] args) {
		// I = V / R
		int volts, ohms;
		float amps;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount of voltage and resistance: ");
		volts = scan.nextInt();
		ohms = scan.nextInt();
		amps = (float) (volts + 0.0) / ohms;
		System.out.println(amps + " amps");
	}
}