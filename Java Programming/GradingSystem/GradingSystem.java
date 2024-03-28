import java.util.Scanner;
import java.text.DecimalFormat;

public class GradingSystem {
	static Scanner scan = new Scanner(System.in);
	static float inputData(){
		float input;
		int attempts = 1;

		do{
			input = scan.nextFloat();
			if (input > 5.0 || input < 1.0){
				System.out.printf("Invalid input! Attempt %d of 3\n", attempts);
				++attempts;
			}
			else
				return input;
			System.out.print("Please enter values between 1.0 and 5.0 (inclusive): ");
		} while(attempts <= 3);
		if (attempts > 3) {
			System.out.println("Insufficient number of attempts!\nSystem exiting...");
			System.exit(1);
		}

		return input;
	}
	public static void main(String[] args) {
		final float PASSING_GRADE = 3.0f;
		char choice;
		byte option;
		float quiz, labwork, exam, midtermGrade, finalGrade;
		boolean midtermExists;

		String remarks = new String();
		DecimalFormat decform = new DecimalFormat("#.#");

		System.out.println("GRADING SYSTEM");
		do{
			System.out.println("Options:");
			System.out.println("[1] Compute Midterm Grade");
			System.out.println("[2] Compute Final Grade");
			System.out.println("[3] Quit App");

			System.out.print("Press 1 or 2 or 3: ");
			option = scan.nextByte();

			switch (option){
				case 1:
					System.out.print("Enter your Quiz Grade: ");
					quiz = inputData();
					System.out.print("Enter your Labworks Grade: ");
					labwork = inputData();
					System.out.print("Enter your Midterm Exam Grade: ");
					exam = inputData();
					
					midtermGrade = (float)((quiz * 0.2) + (exam * 0.4) + (labwork * 0.4));
					midtermExists = true;

					remarks = midtermGrade <= PASSING_GRADE ? "PASSED": "FAILED";
					System.out.println("Midterm Grade: " + decform.format(midtermGrade));
					System.out.println("Remarks: " + remarks);
					break;

				case 2:
					System.out.println("Do you want to include the midterm grade in the calculation? (Y or N)");
					do{
						choice = scan.next().charAt(0);
						if (choice.toUpperCase() == 'Y') {
							if (midtermExists == false) {
								System.out.print("Please enter your Midterm Grade: ");
								midtermGrade = inputData();
							}
							else{
								System.out.printf("Do you want to use the previous calculated Midterm Grade (%s)? (Y or N)\n",
												   decform.format(midtermGrade));
								choice = scan.next().charAt(0);
								if (choice.toUpperCase() == 'Y'){
									System.out.print("Enter your Quiz Grade: ");
									quiz = inputData();
									System.out.print("Enter your Labworks Grade: ");
									labwork = inputData();
									System.out.print("Enter your Final Exam Grade: ");
									exam = inputData();
								}
								if (choice.toUpperCase() == 'N'){
									System.out.print("Please enter your Midterm Grade: ");
									midtermGrade = inputData();
								}
								if (choice.toUpperCase() != 'Y' || choice.toUpperCase != 'N')
									System.out.println("Invalid choice please enter Y or N!");
							}

							finalGrade = (float) ((quiz * 0.2) + (exam * 0.4) + (labwork * 0.4) + midtermGrade) / 2.0;
						}
						else if (choice.toUpperCase == 'N'){
							System.out.print("Enter your Quiz Grade: ");
							quiz = inputData();
							System.out.print("Enter your Labworks Grade: ");
							labwork = inputData();
							System.out.print("Enter your Final Exam Grade: ");
							exam = inputData();

							finalGrade = (float)((quiz * 0.2) + (exam * 0.4) + (labwork * 0.4));
						}
						else{
							System.out.println("Invalid choice please enter Y or N!");
						}
					} while (choice.toUpperCase() != 'Y' || choice.toUpperCase() != 'N');

					remarks = finalGrade <= PASSING_GRADE ? "PASSED": "FAILED";

					System.out.println("Final Grade: " + decform.format(midtermGrade));
					System.out.println("Remarks: " + remarks);

					break;
				case 3:
					System.out.println("Thank you for using this program");
					break;
				default:
					System.out.println("Invalid choice!");
			}
		} while (option != 3);

		System.out.println("bye");
	}
}