public class LargestElements {
	public static void main(String[] args) {
		// Variable declarations and definitions
		int[][] data = { {3, 2, 5},
                         {1, 4, 4, 8, 13},
                         {9, 1, 0, 2},
                         {0, 2, 6, 3, -1, -8} };
        int max, min;
        // Driver code
        for (int row = 0; row < data.length; ++row) { 
        	// Iterate each element in the multidimensional array to find the minimum
        	// and maximum of each row
        	max = min = data[row][0]; // Minimum and maximum is defined as the first element of each array
        	for (int col = 0; col < data[row].length; ++col) {
        		if (data[row][col] > max)
                    max = data[row][col];
                if (data[row][col] < min)
                    min = data[row][col];
        	}
        	// Output
        	System.out.println("Max for row " + (row+1) + " is " + max);
        	System.out.println("Minimum for row " + (row+1) + " is " + min);
        	System.out.println();
        }
	}
}