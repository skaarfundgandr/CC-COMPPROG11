public class SumEachColumn {
	public static void main(String[] args) {
		int[][] data = { {3, 2, 5},
                     	 {1, 4, 4, 8, 13},
                     	 {9, 1, 0, 2},
                         {0, 2, 6, 3, -1, -8} };
        int sum;
        int maxLen = 0;
        // first pass to determine the maximum number of elements
        for (int row = 0; row < data.length; ++row) {
        	if (data[row].length > maxLen) {
        		maxLen = data[row].length;
        	}
        }
        
        for (int column = 0; column < maxLen; ++column) {
        	sum = 0;
        	for (int row = 0; row < maxLen; ++row) {
        		if (row < data.length && column < data[row].length) {
        			sum += data[row][column];
        		}
        	}
        	System.out.println("sum of column " + (column+1) + " is " + sum);
        }
	}
}