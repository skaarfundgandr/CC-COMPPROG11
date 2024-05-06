public class Exercise2 {
	public static void main(String[] args) {
		int[] val = {13, -4, 82, 17};
		int[] twice;

		System.out.println("Original array: "
							+ val[0] + " " + val[1] + " " + val[2] + " " + val[3]);

		twice = new int[4];
		for (int i = 0; i < 4; ++i) {
			twice[i] = val[i] * 2;
		}

		System.out.println("New array: "
							+ twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3]);
	}
}