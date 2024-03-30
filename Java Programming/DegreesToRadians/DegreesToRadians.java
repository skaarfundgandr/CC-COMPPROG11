public class DegreesToRadians {
	public static void main(String[] args) {
		double degrees, radians, sinx, cosx, sum;

		degrees = 30.0;
		radians = degrees * (Math.PI/180.0);
		sinx = Math.sin(radians);
		cosx = Math.cos(radians);
		sum = (sinx * sinx) + (cosx * cosx);

		System.out.println("sine: " + sinx + " cosine: " + cosx + " sum of squares: " + sum);
	}
}