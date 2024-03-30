public class AverageRainfall {
	public static void main(String[] args) {
		int rainfallApril, rainfallMay, rainfallJune;
		float averageRainfall;

		rainfallApril = 12;
		rainfallMay = 14;
		rainfallJune = 8;
		averageRainfall = (float) (rainfallApril + rainfallMay + rainfallJune) / 3.0f;

		System.out.println("Rainfall for April:\t" + rainfallApril);
		System.out.println("Rainfall for May:\t" + rainfallMay);
		System.out.println("Rainfall for June:\t" + rainfallJune);
		System.out.println("Average Rainfall:\t" + averageRainfall);
	}
}