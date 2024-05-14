public class Smooth {
	public static void main(String[] args) {
		int[][] image  = {{0,0,0,0,0,0,0,0,0,0,0,0},
                      	  {0,0,0,0,0,0,0,0,0,0,0,0},
                      	  {0,0,5,5,5,5,5,5,5,5,0,0},
                    	  {0,0,5,5,5,5,5,5,5,5,0,0},
                    	  {0,0,5,5,5,5,5,5,5,5,0,0},
                    	  {0,0,5,5,5,5,5,5,5,5,0,0},
                    	  {0,0,5,5,5,5,5,5,5,5,0,0},
                    	  {0,0,5,5,5,5,5,5,5,5,0,0},
                    	  {0,0,5,5,5,5,5,5,5,5,0,0},
                    	  {0,0,5,5,5,5,5,5,5,5,0,0},
                    	  {0,0,0,0,0,0,0,0,0,0,0,0},
                    	  {0,0,0,0,0,0,0,0,0,0,0,0}};
        int[][] smooth = new int[image.length][image[0].length];
        int sum;
        // Compute smoothed value for non edge locations
        for (int row = 1; row < smooth.length-1; ++row) {
        	for (int col = 1; col < smooth[row].length-1; ++col) {
        		sum = 0;
        		sum += image[row-1][col-1];
        		sum += image[row-1][col];
        		sum += image[row-1][col+1];
        		sum += image[row][col-1];
        		sum += image[row][col];
        		sum += image[row][col+1];
        		sum += image[row+1][col-1];
        		sum += image[row+1][col];
        		sum += image[row+1][col+1];
        		smooth[row][col] = sum / 9;
        	}
        }
        // Output smoothed values
        for (int row = 0; row < smooth.length; ++row) {
        	for (int col = 0; col < smooth[row].length; ++col) {
        		System.out.print(smooth[row][col] + " ");
        	}
        	System.out.println();
        }
	}
}