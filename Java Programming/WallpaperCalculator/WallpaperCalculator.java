import java.util.Scanner;

public class WallpaperCalculator{
	public static void main(String[] args) {
		final float wallpaperWidth = 27, wallpaperLength = 162; 
		float roomLength, roomWidth, roomHeight, openingWidth, openingLength, wallpaperArea;
		int openings, count = 1, wallpaperAmount;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the length of the room in inches: ");
		roomLength = scan.nextFloat();
		System.out.print("Enter the width of the room in inches: ");
		roomWidth = scan.nextFloat();
		System.out.print("Enter the height of the room in inches: ");
		roomHeight = scan.nextFloat();
		System.out.print("Enter the number of openings in the room: ");
		openings = scan.nextInt();

		wallpaperArea = 2 * ((roomWidth * roomHeight) + (roomLength * roomHeight));

		while (count <= openings){
			System.out.printf("Enter length of opening %d: ", count);
			openingLength = scan.nextFloat();
			System.out.printf("Enter width of opening %d: ", count);
			openingWidth = scan.nextFloat();

			wallpaperArea -= (openingLength * openingWidth);
			
			++count;
		}

		wallpaperAmount = (int) Math.ceil(wallpaperArea / (wallpaperLength * wallpaperWidth));

		System.out.printf("You need %d wallpaper(s) to cover the room\n", wallpaperAmount);
	}
}