public class SumAllArrayElements {
	public static void main(String[] args) {
		// Variable declaration and definition
		int[][] data = {{3, 2, 5},{1, 4, 4, 8, 12},{9, 1, 0, 2},{0, 2, 6, 3, -1, -8}};
		int sum = 0;
		// Add up all the elements in the array
		for (int column = 0; column < data.length; ++column) {
			for (int row = 0; row < data[column].length; ++row) {
				sum += data[column][row];
			}
		}
		// Output
		System.out.println("Sum of all elements is " + sum);
	}
}