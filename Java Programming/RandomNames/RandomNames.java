import java.util.Random;

public class RandomNames {
	public static void main(String[] args) {
		int randFirst, randLast;
		String firstName = new String(), lastName = new String();

		Random rand = new Random();

		randFirst = rand.nextInt(11);
		randLast = rand.nextInt(11);

		switch(randFirst){
			case 0:
				firstName = "Harper"; break;
			case 1:
				firstName = "Ava"; break;
			case 2:
				firstName = "Leo"; break;
			case 3:
				firstName = "Maya"; break;
			case 4:
				firstName = "Owen"; break;
			case 5:
				firstName = "Sophie"; break;
			case 6:
				firstName = "Ethan"; break;
			case 7:
				firstName = "Isabella"; break;
			case 8:
				firstName = "Lucas"; break;
			case 9:
				firstName = "Emma"; break;
			case 10:
				firstName = "Noah"; break;
			case 11:
				firstName = "Olivia"; break;
		}
		switch (randLast) {
			case 0:
				lastName = "Mitchell"; break;
			case 1:
				lastName = "Williams"; break;
			case 2:
				lastName = "Thompson"; break;
			case 3:
				lastName = "Anderson"; break;
			case 4:
				lastName = "Ducay"; break;
			case 5:
				lastName = "Martinez"; break;
			case 6:
				lastName = "Campbell"; break;
			case 7:
				lastName = "Wright"; break;
			case 8:
				lastName = "Parker"; break;
			case 9:
				lastName = "Evanz"; break;
			case 10:
				lastName = "Scott"; break;
			case 11:
				lastName = "Sanchez"; break;
		}

		System.out.println("First Name: " + firstName + " Last Name: " + lastName);
	}
}