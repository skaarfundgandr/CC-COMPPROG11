import java.util.Scanner;

public class AreaOfRectangles {
	public static void main(String[] args) {
		int area, x1, x2, y1, y2, width, height;

		Scanner scan = new Scanner(System.in);

		System.out.println("Computer Aided Design Program");

		do {
			System.out.println("First corner X coordinate:");
			x1 = scan.nextInt();
			System.out.println("First corner Y coordinate:");
			y1 = scan.nextInt();
			System.out.println("Second corner X coordinate:");
			x2 = scan.nextInt();
			System.out.println("Second corner Y coordinate:");
			y2 = scan.nextInt();

			width = x2 - x1;
			height = y2 - y1;
			area = width * height;

			System.out.printf("Width: %d Height: %d Area: %d\n\n", width, height, area);
		} while (width != 0 && height != 0);

		System.out.println("finished");
	}
}