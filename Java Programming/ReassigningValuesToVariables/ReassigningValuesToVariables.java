public class ReassigningValuesToVariables {
	public static void main(String[] args) {
		double x, value;

		x = 0.0;
		value = (3.0 * (x * x)) - (8.0 * x) + 4.0;

		System.out.println("At X = " + x + " value is " + value);

		x = 2.0;
		value = (3.0 * (x * x)) - (8.0 * x) + 4.0;

		System.out.println("At X = " + x + " value is " + value);

		x = 4.0;
		value = (3.0 * (x * x)) - (8.0 * x) + 4.0;

		System.out.println("At X = " + x + " value is " + value);
	}
}