import java.util.Scanner;

public class Permutations {
	public static void main(String[] args) {
		int n, r, count = 1;
		long fact = 1;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter value for N: ");
		n = scan.nextInt();
		System.out.print("Enter value for R: ");
		r = scan.nextInt();

		if (n < 0 || r < 0){
			System.out.println("Error! N or R must be 0 or positive!");
			System.exit(1);
		}

		if (r > n){
			System.out.println("R must be less than or equal to N");
			System.exit(1);
		}

		while (count <= n){
			if (count <= (n-r))
				++count;
			else{
				fact *= count;
				++count;
			}
		}
		System.out.printf("There are %d permutations\n", fact);
	}
}