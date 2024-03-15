import java.util.Scanner;

public class HarmonicSum{
	public static void main(String[] args) {
		double sum = 0.0;
		int n;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter N");
		n = scan.nextInt();

		while (n > 0){
			sum += (1.0/n);
			--n;
		}

		System.out.printf("Sum is: %f\n", sum);
	}
}