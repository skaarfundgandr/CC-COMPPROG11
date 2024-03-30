public class PayrollProgram {
	public static void main(String[] args) {
		long hoursWorked;
		double payrate, taxRate;

		hoursWorked = 40;
		payrate = 10.0;
		taxRate = 0.10;

		System.out.println("Hourse Worked: " + hoursWorked);
		System.out.println("pay amount: " + (hoursWorked * payrate));
		System.out.println("tax amount: " + (hoursWorked * payrate * taxRate));
	}
}