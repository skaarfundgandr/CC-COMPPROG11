public class Trigonometry {
	public static void main(String[] args) {
		double value, sinx, cosx, sum;

		value = 0.5236;
		sinx = Math.sin(value);
		cosx = Math.cos(value);
		sum = (sinx * sinx) + (cosx * cosx);

		System.out.println("sine: " + sinx + " cosine: " + cosx + " sum of squares: " + sum);
	}
}