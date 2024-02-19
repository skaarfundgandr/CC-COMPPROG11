import java.text.*;
import java.util.Scanner;

public class RuleOf72{
	public static void main(String[] args) {
		double time, rate;
		Scanner scan = new Scanner(System.in);
		DecimalFormat decform = new DecimalFormat("###,###.##");
		System.out.print("Interest rate: ");
		rate = scan.nextDouble();
		time = 72.0 / (rate * 100.0);
		System.out.println("Amount will double in " + decform.format(time) + " years");
	}
}