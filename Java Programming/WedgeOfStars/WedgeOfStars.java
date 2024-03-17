import java.util.Scanner;

public class WedgeOfStars{
	public static void main(String[] args) {
		int stars, i;

		Scanner scan = new Scanner(System.in);

		System.out.println("Initial number of stars:");
		stars = scan.nextInt();

		while (stars > 0){
			i = stars;
			while(i > 0){
				System.out.print("*");
				--i;
			}
			System.out.println();
			--stars;
		}
	}
} 