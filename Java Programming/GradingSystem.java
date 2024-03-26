import java.util.Scanner;

public class GradingSystem {
	static double validateInput(){
		double input;
		int attempts = 1;

		do{
			input = scan.nextDouble();
			if (input => 5.0 && input <= 1.0){
				System.out.printf("Invalid input! Attempt %d of 3\n", attempts);
				++attempts;
			}
			else
				return input;
		} while(attempts <= 3);
		if (attempts > 3) {
			System.out.println("Insufficient number of attempts!\nSystem exiting...");
			System.exit(1);
		}
	}
	public static void main(String[] args) {
		int option;
		double quiz, labwork, exam, midtermGrade, finalGrade;
		boolean passed, midtermExists;
		String finalsOrMidterm = new String();

		public static Scanner scan = new Scanner(System.in);

		do{
			System.out.println("GRADING SYSTEM");
			System.out.println("Options:");
			System.out.println("[1] Compute Midterm Grade");
			System.out.println("[2] Compute Final Grade");
			System.out.println("[3] Quit App");

			System.out.print("Press 1 or 2 or 3: ");
			option = scan.nextInt();

			switch (option){
				case 1:
					System.out.print("Enter your Quiz Grade: ");
					quiz = validateInput();
					System.out.print("Enter your Labworks Grade: ");
					labwork = validateInput();
					System.out.print("Enter your Midterm Exam Grade: ");
					exam = validateInput();
					
					midtermExists = true;
			}
		} while (input != 3);
	}
}
