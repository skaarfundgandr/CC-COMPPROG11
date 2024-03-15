import java.util.Scanner;

public class AddingIntegers{
	public static void main(String[] args) {
		int integers, num, sum = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("How many integers will be added:");
		integers = scan.nextInt();

		while(integers > 0){
			System.out.println("Enter an integer:");
			num = scan.nextInt();
			sum += num;
			--integers;
		}
		System.out.printf("Sum is %d\n", sum);
	}
}