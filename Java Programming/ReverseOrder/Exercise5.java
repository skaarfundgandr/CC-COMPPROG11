public class Exercise5 {
	public static void main(String[] args) {
		int[] val = {0, 1, 2, 3};
		int temp;

		System.out.println("Original array: "
							+ val[0] + " " + val[1] + " " + val[2] + " " + val[3]);
		for (int i = 0, j = 3; i < j; ++i, --j) {
			temp = val[i];
			val[i] = val[j];
			val[j] = temp;
		}

		System.out.println("Reversed array: "
							+ val[0] + " " + val[1] + " " + val[2] + " " + val[3]);
	}
}