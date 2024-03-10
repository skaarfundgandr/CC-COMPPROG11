import java.util.Scanner;

public class TirePressure{
	public static void main(String[] args) {
		int rightFrontPSI, leftFrontPSI, rightRearPSI, leftRearPSI;
		boolean goodPressure = true;

		Scanner scan = new Scanner(System.in);

		System.out.println("Input right front pressure");
		rightFrontPSI = scan.nextInt();
		if (35 > rightFrontPSI || rightFrontPSI > 45) {
			System.out.println("Warning: pressure is out of range");
			goodPressure = false;
		}
		System.out.println("Input left front pressure");
		leftFrontPSI = scan.nextInt();
		if (35 > leftFrontPSI || leftFrontPSI > 45) {
			System.out.println("Warning: pressure is out of range");
			goodPressure = false;
		}
		System.out.println("Input right rear pressure");
		rightRearPSI = scan.nextInt();
		if (35 > rightRearPSI || rightRearPSI > 45) {
			System.out.println("Warning: pressure is out of range");
			goodPressure = false;
		}
		System.out.println("Input left rear pressure");
		leftRearPSI = scan.nextInt();
		if (35 > leftRearPSI || leftRearPSI > 45) {
			System.out.println("Warning: pressure is out of range");
			goodPressure = false;
		}

		if (leftFrontPSI - 3 > rightFrontPSI && rightFrontPSI > leftFrontPSI + 3) {
			goodPressure = false;
		}
		if (leftRearPSI - 3 > rightRearPSI && rightRearPSI > leftRearPSI + 3) {
			goodPressure = false;
		}

		System.out.printf("Inflation is %s\n", goodPressure ? "OK": "BAD");
	}
}