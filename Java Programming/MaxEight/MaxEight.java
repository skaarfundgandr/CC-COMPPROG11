import java.util.Scanner;

public class MaxEight {
	static int maxEight(int a, int b, int c, int d, int e, int f, int g, int h){
		int max = a;

		if (max < b)
			max = b;
		if (max < c)
			max = c;
		if (max < d)
			max = d;
		if (max < e)
			max = e;
		if (max < f)
			max = f;
		if (max < g)
			max = g;
		if (max < h)
			max = h;
		
		return max;
	}
	public static void main(String[] args) {
		int a, b, c, d, e, f, g, h;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter 8 numbers:");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		e = scan.nextInt();
		f = scan.nextInt();
		g = scan.nextInt();
		h = scan.nextInt();

		System.out.println("Maximum is " + maxEight(a, b, c, d, e, f, g, h));
	}
}