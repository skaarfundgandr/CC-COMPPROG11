import java.util.Scanner;

public class NumToChar{
	public static void main(String[] args) {
		// Local Declarations
		char convNum;
		short num;
		// Objects
		Scanner scan = new Scanner(System.in);
		// Input Stream
		System.out.print("Enter a number from 0 to 35: ");
		num = scan.nextShort();
		// Process and Output
		if (num <= 9 && num >= 0) {
			System.out.println(num);
		}
		else if (num > 9 && num <= 35) {
			convNum = (char) (num + 55);
			System.out.println(convNum);
		}
		else{
			System.out.println("Invalid input! Number should not be less than 0 or more than 35!");
			System.exit(0);
		}
	}
}