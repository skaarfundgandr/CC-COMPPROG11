import java.util.Scanner;

public class Transformer {
	public static void main(String[] args) {
		String line;
		Scanner scan = new Scanner(System.in);

		while (scan.hasNextLine()) {
			line = scan.nextLine();
			if (line.contains(":=")){
				line = line.substring(0, line.indexOf(":=")).concat(line.substring(line.indexOf(":=") + 1));
			}
			System.out.println(line);
		}
	}
}