class WeightObject {
    private int[] data;

    // Constructor
    public WeightObject(int[] init){
        data = new int[init.length];

        for (int i = 0; i < init.length; ++i)
            data[i] = init[i];
    }
    // Computes the average of all the values
    public int average(){
        int average, sum = 0;

        for (int i = 0; i < data.length; ++i)
            sum += data[i];

        average = sum / data.length;

        return average;
    }
}
public class Average {
	public static void main(String[] args) {
        int avg;
		int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                    105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                    105, 105, 104, 104, 103, 102, 102, 101, 100, 102};
        WeightObject june = new WeightObject(values);

        avg = june.average();

        System.out.println("average = " + avg);
	}
}