import java.text.DecimalFormat;

public class DrugPotency {
	public static void main(String[] args) {
		int month = 0;
		double effectiveness = 100;

		DecimalFormat decform = new DecimalFormat(".0#############"); 

		while (true){
			if (effectiveness < 50) {
				System.out.printf("Month: %d\teffectiveness: %s DISCARDED\n", month, decform.format(effectiveness));
				break;
			}
			if (effectiveness > 50)
				System.out.printf("Month: %d\teffectiveness: %s\n", month, decform.format(effectiveness));
			effectiveness -= (effectiveness * 0.04);
			++month;
		}
	}
}