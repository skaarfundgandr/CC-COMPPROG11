import java.util.Scanner;

public class CorrectChange{
	public static void main(String[] args) {
		int input, amount, dollars, quarters, dimes, nickels, cents;
		Scanner scan = new Scanner(System.in);
		input = scan.nextInt();
		amount = input;
		dollars = amount / 100;
		amount -= dollars * 100;
		System.out.println(dollars + " dollars fits into " +
						   input + " leaving " + amount);
		input = amount;
		quarters = amount / 25;
		amount -= quarters * 25;
		System.out.println(quarters + " quarters fits into " +
						   input + " leaving " + amount);
		input = amount;
		dimes = amount / 10;
		amount -= dimes * 10;
		System.out.println(dimes + " dimes fits into " + 
						   input + " leaving " + amount);
		input = amount;
		nickels = amount / 5;
		amount -= nickels * 5;
		System.out.println(nickels + " nickels fits into " + 
						   input + " leaving " + amount);
		System.out.println(amount + " cents are left");
	}
}