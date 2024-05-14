class WeightObject {
    private int[] data;

    // Constructor
    public WeightObject(int[] init){
        data = new int[init.length];

        for (int i = 0; i < init.length; ++i)
            data[i] = init[i];
    }
    // Computes the average from a range of numbers
    public int subAverage(int start, int end){
        int average, sum = 0;

        for (int i = start; i < end; ++i)
            sum += data[i];

        average = sum / (end - start);

        return average;
    }
}
public class SubrangeDays {
	public static void main(String[] args) {
        int firstHalfAvg, secondHalfAvg, midpoint;

		int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                    105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                    105, 105, 104, 104, 103, 102, 102, 101, 100, 102};

        WeightObject june = new WeightObject(values);

        midpoint = values.length / 2;

        if (values.length % 2 == 1) {
            firstHalfAvg = june.subAverage(0, midpoint + 1);
            secondHalfAvg = june.subAverage(midpoint, values.length);
        }
        else{
            firstHalfAvg = june.subAverage(0, midpoint);
            secondHalfAvg = june.subAverage(midpoint, values.length);
        }

        System.out.println("First Half Average: " + firstHalfAvg);
        System.out.println("Second Half Average: " + secondHalfAvg);
	}
}