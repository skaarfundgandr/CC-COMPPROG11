import java.util.Scanner;

public class PieEatingContest{
	public static void main(String[] args) {
		float weight;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your weight: ");
		weight = scan.nextFloat();

		if (weight < 250.0 - 30.0 || weight > 250.0 + 30.0) {
			System.out.println("You are not allowed in the contest");
		}
		else{
			System.out.println("You are allowed in the contest");
		}
	}
}