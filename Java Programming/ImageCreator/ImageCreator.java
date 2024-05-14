public class ImageCreator {
	public static void main(String[] args) {
		for (int k = 0; k <= 8; ++k) {
			for (int i = 0; i < 8; ++i) {
				for (int j = 0; j < 8; ++j) {
					System.out.print(k*8);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}