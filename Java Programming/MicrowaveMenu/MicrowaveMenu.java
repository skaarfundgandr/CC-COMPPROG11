import java.util.Scanner;

public class MicrowaveMenu {
	public static void main(String[] args) {
		boolean hasAlpha;
		String cookTime;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter cook time-> ");
		cookTime = scan.nextLine();
		do{
			hasAlpha = false;
			for (int i = 0; i < cookTime.length(); ++i) {
				if ((int) cookTime.charAt(i) < '0' || cookTime.charAt(i) > '9') {
					System.out.println("Alphabet detected please enter again");
					hasAlpha = true;
					break;
				}
			}
			if (hasAlpha) {
				System.out.print("Enter cook time-> ");
				cookTime = scan.nextLine();
			} else if (cookTime.length() == 1){
				System.out.println("00:0" + cookTime);
			} else if (cookTime.length() > 2) {
				System.out.println(cookTime.substring(0, cookTime.length() - 2).concat(":").concat(cookTime.substring(cookTime.length() - 2)));
			} else{
				System.out.println("00:" + cookTime);
			}
		} while (hasAlpha);
	}

}