import java.util.Scanner;

public class AverageStandardDeviation{
	public static void main(String[] args) {
		int n, count;
		double num, standardDeviation, sum = 0, sumAvg2 = 0, avg, avgSquare;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number of values: ");
		n = scan.nextInt();

		System.out.printf("Enter %d values\n", n);
		count = n;
		while(count > 0){
			num = scan.nextDouble();
			sum += num;
			sumAvg2 += (num * num);
			--count;
		}

		System.out.printf("sum: %f\n", sum);
		avg = sum / n;
		avgSquare = sumAvg2 / n;
		standardDeviation = Math.sqrt(avgSquare - (avg * avg));
		System.out.printf("Average: %f\nStandard Deviation: %f\n", sum / n, standardDeviation);
	}
}