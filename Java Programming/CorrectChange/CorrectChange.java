import java.util.Scanner;

public class CorrectChange{
	public static void main(String[] args) {
		int input, amount, currency;

		Scanner scan = new Scanner(System.in);

		System.out.println("Input the amount");
		input = scan.nextInt();

		amount = input;
		currency = amount / 100;
		amount -= currency * 100;
		System.out.println(currency + " dollars fits into " +
						   input + " leaving " + amount);

		input = amount;
		currency = amount / 25;
		amount -= currency * 25;
		System.out.println(currency + " quarters fits into " +
						   input + " leaving " + amount);

		input = amount;
		currency = amount / 10;
		amount -= currency * 10;
		System.out.println(currency + " dimes fits into " + 
						   input + " leaving " + amount);
		
		input = amount;
		currency = amount / 5;
		amount -= currency * 5;
		System.out.println(currency + " nickels fits into " + 
						   input + " leaving " + amount);
		System.out.println(amount + " cents are left");
	}
}