import java.util.Scanner;

public class WindChillIndex{
	public static void main(String[] args) {
		float windSpeed, temperature;
		double windChill;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Wind Speed:");
		windSpeed = scan.nextFloat();
		System.out.println("Enter temperature:");
		temperature = scan.nextFloat();

		if (windSpeed < 3.0 || temperature > 50.0) {
			windChill = temperature;
		}
		else{
			windChill = (35.74 + (0.6215 * temperature)) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temperature * Math.pow(windSpeed, 0.16));
		}

		System.out.printf("Wind Chill: %f\n", windChill);
	}
}