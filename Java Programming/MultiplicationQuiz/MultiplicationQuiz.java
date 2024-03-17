import java.util.Random;
import java.util.Scanner;

public class MultiplicationQuiz{
	public static void main(String[] args) {
		int questions = 10, i = 0, answer, num1, num2, score = 0;

		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		while (i < questions){
			num1 = rand.nextInt(10);
			num2 = rand.nextInt(10);
			System.out.printf("What is %d * %d? ", num1, num2);
			answer = scan.nextInt();
			if (answer == num1 * num2) {
				System.out.println("Right!");
				++score;
			}
			if (answer != num1 * num2)
				System.out.printf("wrong. %d * %d is %d\n", num1, num2, num1 * num2);
			++i;
		}
		System.out.printf("You got %d out of %d questions correct!\n", score, questions);
	}
}