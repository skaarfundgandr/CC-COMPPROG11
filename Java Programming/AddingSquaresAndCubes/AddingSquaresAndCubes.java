import java.util.Scanner;

public class AddingSquaresAndCubes{
	public static void main(String[] args) {
		int n;
		long sumSquares = 0, sumCubes = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("Upper Limit:\n");
		n = scan.nextInt();

		while (n > 0){
			sumSquares += (n * n);
			sumCubes += (n * n * n);
			--n;
		}
		System.out.printf("The sum of squares is %d\n", sumSquares);
		System.out.printf("The sum of cubes is %d\n", sumCubes);
	}
}