import java.util.Scanner;

public class FantasyGame{
	public static void main(String[] args) {
		int strength, health, luck;
		String name;

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to Yertle's Quest");

		System.out.println("Enter the name of your character:");
		name = new String(scan.nextLine());
		System.out.println("Enter strength (1-10):");
		strength = scan.nextInt();
		System.out.println("Enter health (1-10):");
		health = scan.nextInt();
		System.out.println("Enter luck (1-10):");
		luck = scan.nextInt();

		if (strength + health + luck >= 15) {
			System.out.println("You have given your character too many points! Default values have been assigned");
			health = strength = luck = 5;
		}
		System.out.printf("%s, strength: %d, health: %d, luck: %d\n", name, strength, health, luck);
	}
}