import java.util.Scanner;

public class Y2KProblemCalculator{
	public static void main(String[] args) {
		int currYear, age, birthYear;

		Scanner scan = new Scanner(System.in);

		System.out.print("Year of birth: ");
		birthYear = scan.nextInt();
		System.out.print("Current year: ");
		currYear = scan.nextInt();

		if (currYear < birthYear)
			currYear += 100;
		
		age = Math.abs(currYear - birthYear);

		System.out.printf("Your age: %d\n", age);
	}
}