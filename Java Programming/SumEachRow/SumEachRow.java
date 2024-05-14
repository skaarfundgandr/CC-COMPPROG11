public class SumEachRow {
	public static void main(String[] args) {
		int[][] data = { {3, 2, 5},
                     	 {1, 4, 4, 8, 13},
                     	 {9, 1, 0, 2},
                         {0, 2, 6, 3, -1, -8} };
        int sum;

        for (int i = 0; i < data.length; ++i) {
            sum = 0;
            for (int j = 0; j < data[i].length; ++j) {
                sum += data[i][j];
            }
            System.out.println("Sum of row " + (i+1) + " is " + sum);
        }
	}
}