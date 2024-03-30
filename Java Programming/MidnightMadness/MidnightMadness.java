import java.util.Scanner;
import java.text.DecimalFormat;

public class MidnightMadness{
  public static void main(String[] args) {
    final int adultAge = 13, matineeTime = 1700;
    final double normalAdultPrice = 8.00, matineeAdultPrice = 5.00;
    final double normalChildrenPrice = 4.00, matineeChildrenPrice = 2.00;
    int time, age;
    double price = 0;

    Scanner scan = new Scanner(System.in);
    DecimalFormat currencyForm = new DecimalFormat("$,###.00");

    System.out.print("Enter the current time: ");
    time = scan.nextInt();
    System.out.print("Enter age: ");
    age = scan.nextInt();

    if (age > adultAge) {
      if (time <= matineeTime && time >= 0)
        price = matineeAdultPrice;
      price = normalAdultPrice;
    }
    if (age <= adultAge) {
      if (time <= matineeTime && time >= 0)
        price = matineeChildrenPrice;
      price = normalChildrenPrice;

    }
    if (time > 2200) {
      if (age < adultAge) {
        System.out.println("No tickets are available for non adults");
        System.exit(0);
      }
      price = 4.00;
    }
    if (age < 0 || time < 0) {
      System.out.println("Invalid inputs!");
      System.exit(1);
    }

    System.out.printf("The ticket costs : %s\n", currencyForm.format(price));
  }
}
