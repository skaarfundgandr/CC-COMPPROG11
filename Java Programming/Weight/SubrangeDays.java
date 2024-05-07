public class SubrangeDays {
	public static void main(String[] args) {
        int firstHalfAvg, secondHalfAvg, midpoint;

		int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                    105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                    105, 105, 104, 104, 103, 102, 102, 101, 100, 102};

        Weight june = new Weight(values);

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