import java.util.Scanner;

public class TriangleSquareNums {
	public static void main(String[] args) {
		int n, numT = 1, numSq = 1, j = 1;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter upper limit: ");
		n = scan.nextInt();

		for (int i = 1; numT <= n; ++i, numT += i) {
			for (; numT >= numSq; j += 2, numSq += j) {
				if (numSq == numT)
					System.out.println(numSq);
			}
		}
	}
}