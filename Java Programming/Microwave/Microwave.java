import java.util.Scanner;

public class Microwave{
	public static void main(String[] args) {
		int items, time;

		Scanner scan = new Scanner(System.in);

		System.out.print("How many items to heat: ");
		items = scan.nextInt();
		System.out.print("Time for one item: ");
		time = scan.nextInt();

		time = ((time / 100) * 60) + (time % 100);
		if (items > 1 && items <= 3)
			time = time + ((time * (items - 1) >> 1));
		if (items > 3) {
			System.out.println("Heating more than 3 items at once is not recommended!");
			System.exit(1);
		}
		System.out.printf("Heat for %d minutes %d seconds\n", time / 60, time % 60);
	}
}