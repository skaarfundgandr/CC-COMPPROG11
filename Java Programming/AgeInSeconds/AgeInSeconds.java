import java.util.Scanner;
import java.text.DecimalFormat;

public class AgeInSeconds{
	public static void main(String[] args) {
		int years, months;
		long ageInSeconds, days;
		double percentLived;

		Scanner scan = new Scanner(System.in);
		DecimalFormat percentform = new DecimalFormat("%###.##");
		DecimalFormat numform = new DecimalFormat("###,###,###,###");

		System.out.print("Enter your age in years: ");
		years = scan.nextInt();
		System.out.print("Enter your age in months: ");
		months = scan.nextInt();
		System.out.print("Enter your age in days: ");
		days = scan.nextLong();

		if (months % 2 == 1){
			months -= 1;
			days += 31;
		}
		if (months >= 2)
			days -= 2;
		days += (31 + 30) * (months / 2);
		
		days += (365 * years);
		ageInSeconds = days * 24 * 60 * 60;
 		percentLived = (double) ageInSeconds / 2500000000.0;
		
		System.out.printf("Your age in seconds is: %s\n", numform.format(ageInSeconds));
		System.out.printf("You have lived %s of your life\n", percentform.format(percentLived));
	}
}
