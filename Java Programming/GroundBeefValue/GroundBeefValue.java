import java.util.Scanner;
import java.text.DecimalFormat;

public class GroundBeefValue{
	public static void main(String[] args) {
		float packageAPrice, packageBPrice, costLeanA, costLeanB;
		byte percentLeanA, percentLeanB;

		Scanner scan = new Scanner(System.in);
		DecimalFormat decform = new DecimalFormat("###,##0.0#####");

		System.out.println("Price per pound package A: ");
		packageAPrice = scan.nextFloat();
		System.out.println("Percent lean package A: ");
		percentLeanA = scan.nextByte();
		System.out.println("Price per pound package B: ");
		packageBPrice = scan.nextFloat();
		System.out.println("Percent lean package B: ");
		percentLeanB = scan.nextByte();

		costLeanA = (float) (packageAPrice / (percentLeanA / 100.0));
		costLeanB = (float) (packageBPrice / (percentLeanB / 100.0));

		System.out.printf("Package A cost per pound of lean: %s\n", decform.format(costLeanA));
		System.out.printf("Package B cost per pound of lean: %s\n", decform.format(costLeanB));

		if (costLeanA < costLeanB) {
			System.out.println("Package A is the best value");
		}
		else{
			System.out.println("Package B is the best value");
		}
	}
}