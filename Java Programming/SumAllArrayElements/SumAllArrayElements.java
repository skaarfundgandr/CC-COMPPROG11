public class SumAllArrayElements {
	public static void main(String[] args) {
		int [][] data = {{3, 2, 5},{1, 4, 4, 8, 12},{9, 1, 0, 2},{0, 2, 6, 3, -1, -8}};
		int sum = 0;

		for (int i = 0; i < data.length; ++i) {
			for (int j = 0; j < data[i].length; ++j) {
				sum += data[i][j];
			}
		}
		System.out.println("Sum of all elements is " + sum);
	}
}