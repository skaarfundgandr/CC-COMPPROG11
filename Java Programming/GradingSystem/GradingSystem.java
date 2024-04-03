import java.util.Scanner;
import java.text.DecimalFormat;

public class GradingSystem {
	// Scanner is declared globally since it is used in multiple methods
	static Scanner scan = new Scanner(System.in);
	// Method that checks the input for grades
	static float inputData(){
		float input = 0;
		int attempts = 1;

		do{
			try {
				input = scan.nextFloat();
				if (input > 5.0 || input < 1.0){
					System.out.printf("Invalid input! Attempt %d of 3\n", attempts);
					++attempts;
					if (attempts <= 3)
						System.out.print("Please enter values between 1.0 and 5.0 (inclusive): ");
				}
				else
					return input;
			} catch (Exception e){
				System.out.printf("Invalid input! Attempt %d of 3!\n", attempts);
				++attempts;
				if (attempts <= 3)
					System.out.print("Please enter values between 1.0 and 5.0 (inclusive): ");
				scan.nextLine(); // Discards defective input
			}
		} while(attempts <= 3);
		if (attempts > 3) {
			System.out.println("Insufficient number of attempts!\nProgram exiting...");
			System.exit(1); // Exits Program upon reaching maximum attempts
		}

		return input;
	}
	public static void main(String[] args) {
		final float PASSING_GRADE = 3.0f; // Passing Grade is declared and initialized as a constant
		// Local Declarations
		char choice;
		byte option = 0;
		float quiz, labwork, exam, midtermGrade = 0, finalGrade = 0;
		boolean midtermExists = false;
		// Objects
		String remarks = new String();
		DecimalFormat decform = new DecimalFormat("#.0");
		// Main Logic
		System.out.println("GRADING SYSTEM");
		do{
			System.out.println("Options:");
			System.out.println("[1] Compute Midterm Grade");
			System.out.println("[2] Compute Final Grade");
			System.out.println("[3] Quit App");

			System.out.print("Press 1 or 2 or 3: ");
			try {
				option = scan.nextByte();
			} catch (Exception e) {
				scan.nextLine(); // Discards defective input
			}
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
						choice = Character.toUpperCase(choice); // Convert choice to upper case
						if (choice == 'Y') {
							if (midtermExists == false) {
								System.out.print("Please enter your Midterm Grade: ");
								midtermGrade = inputData();
							}
							else{
								System.out.printf("Do you want to use the previous calculated Midterm Grade (%s)? (Y or N)\n",
												   decform.format(midtermGrade));
								do {
									choice = scan.next().charAt(0);
									choice = Character.toUpperCase(choice);
									if (choice == 'N'){
										System.out.print("Please enter your Midterm Grade: ");
										midtermGrade = inputData();
									}
									if (choice != 'Y' && choice != 'N')
										System.out.println("Invalid choice please enter Y or N!");
								} while (choice != 'Y' && choice != 'N');
							}

							System.out.print("Enter your Quiz Grade: ");
							quiz = inputData();
							System.out.print("Enter your Labworks Grade: ");
							labwork = inputData();
							System.out.print("Enter your Final Exam Grade: ");
							exam = inputData();
							// Computes the final grade by averaging the midterm from the finals
							finalGrade = (float) ((quiz * 0.2) + (exam * 0.4) + (labwork * 0.4) + midtermGrade) / 2.0f;
						}
						else if (choice == 'N'){
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
					} while (choice != 'Y' && choice != 'N');

					remarks = finalGrade <= PASSING_GRADE ? "PASSED": "FAILED";

					System.out.println("Final Grade: " + decform.format(midtermGrade));
					System.out.println("Remarks: " + remarks);
					break;
				case 3:
					System.out.println("Thank you for using this program");
					break;
				default:
					System.out.println("Invalid input! Try again!");
			}
		} while (option != 3);

		System.out.println("bye");
	}
}