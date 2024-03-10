import java.util.Scanner;
import java.text.DecimalFormat;

public class CheckCharge{
	public static void main(String[] args) {
		float checkingAccount, savingsAccount, serviceCharge = 0;

		DecimalFormat decform = new DecimalFormat("$###,###,##0.00");
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter amount in checking account: ");
		checkingAccount = scan.nextFloat();
		System.out.print("Enter amount in savingsAccount: ");
		savingsAccount = scan.nextFloat();

		if (checkingAccount < 0 || savingsAccount < 0){
			System.out.println("Invalid inputs! Input must not be negative!");
			System.exit(1);
		}
		if (checkingAccount <= 1000 || savingsAccount <= 1500)
			serviceCharge = 0.15f;
		System.out.printf("Service charge is %s\n", decform.format(serviceCharge));
	}
}