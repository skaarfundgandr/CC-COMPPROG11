import java.util.Scanner;

public class Title {
	public static void main(String[] args) {
		String male, female, name;

		male = female = name = new String();
		Scanner scan = new Scanner(System.in);

		male = "Mr. ";
		female = "Mrs. ";

		System.out.println("Enter a name:");
		name = scan.nextLine().trim();

		while (name.length() > 0) {
			if (name.startsWith("Amy") || name.startsWith("Buffy") || name.startsWith("Cathy"))
				System.out.println(female.concat(name));
			else if (name.startsWith("Elroy") || name.startsWith("Fred") || name.startsWith("Graham"))
				System.out.println(male.concat(name));
			else
				System.out.println(name);
			
			System.out.println();
			System.out.println("Enter a name:");
			name = scan.nextLine().trim();
		}
	}
}