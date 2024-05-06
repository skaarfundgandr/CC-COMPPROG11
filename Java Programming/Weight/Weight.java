public class Weight {
	private int[] data;

	// Constructor
	public Weight(int[] init){
		data = new int[init.length];

		for (int i = 0; i < init.length; ++i)
			data[i] = init[i];
	}

	public int average(){
		int average, sum = 0;

		for (int i = 0; i < data.length; ++i)
			sum += data[i];

		average = sum / data.length;

		return average;
	}

	public int subAverage(int start, int end){
		int average, sum = 0;

		for (int i = start - 1; i < end; ++i)
			sum += data[i];

		average = sum / (end - start);

		return average;
	}

	public String toString(){
		String str = new String();

		str = "Weight: ";

		for (int i = 0; i < data.length; ++i)
			str = str.concat(data[i] + " ");

		return str;
	}

	public static void main(String[] args) {
		System.out.println("Weight.java is an object file please run the other files");
	}
}