public class ReversalElements {
	static int[][] data = { {3, 2, 5},
                     		{1, 4, 4, 8, 13},
                     		{9, 1, 0, 2},
                     		{0, 2, 6, 3, -1, 8},
                     		{-1, -2, -3, 4, 5, 45  }, 
                     		{56},
                     		{0, 1, 2, 3, 4, 5, 6, 7} };
    static void printArray(){ // Method that prints out the array
    	for (int row = 0; row < data.length; ++row) {
    		for (int col = 0; col < data[row].length - 1; ++col)
    			System.out.print(data[row][col] + ", ");
    		System.out.println(data[row][data[row].length-1]);
    	}
    }
	public static void main(String[] args) {
		// Variable declaration
		int temp, endInx;
		// Print out initial array
		printArray();
		System.out.println();

		// Reverse each row in array
		for (int row = 0; row < data.length; ++row) {
			endInx = data[row].length;
			for (int col = 0;col < endInx; ++col) {
				temp = data[row][col];
				data[row][col] = data[row][--endInx];
				data[row][endInx] = temp;
			}
		}
		// Print out the reversed array
		printArray();
	}
}