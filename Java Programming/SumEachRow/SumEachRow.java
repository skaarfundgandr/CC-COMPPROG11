public class SumEachRow {
	public static void main(String[] args) {
		int[][] data = { {3, 2, 5},
                     	 {1, 4, 4, 8, 13},
                     	 {9, 1, 0, 2},
                         {0, 2, 6, 3, -1, -8} };
        int sum;

        for (int row = 0; row < data.length; ++row) {
            sum = 0;
            for (int column = 0; column < data[row].length; ++column) {
                sum += data[row][column];
            }
            System.out.println("Sum of row " + (row+1) + " is " + sum);
        }
	}
}