public class PineTree{
	public static void main(String[] args) {
		int rows = 11, i = 1, j, k, l = 1, space;

		while (i <= rows){
			if (i <= 8) {
				space = 1;
				j = 0;
				while (space <= rows - i){
					System.out.print(" ");
					++space;
				}
				while (j != 2 * i - 1){
					System.out.print("*");
					++j;
				}
			}
			if (i > 8) {
				k = 9;
				space = 1;
				while (space < rows - l){
					System.out.print(" ");
					++space;
				}
				while (k <= rows){
					System.out.print("*");
					++k;
				}
			}
			System.out.println();
			++i;
		}
	}
}