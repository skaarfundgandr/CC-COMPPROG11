import java.text.*;

public class TableOfSines{
    public static void main(String[] args){
        double angle, sine, rad;
        DecimalFormat decform = new DecimalFormat("#0.0#####");
        angle = -90.0;
        rad = Math.toRadians(angle);
        sine = Math.sin(rad);
        System.out.println("angle\tsine\n" + 
                           "-----\t--------");
        System.out.println(String.format("%5s", decform.format(angle)) + "\t" + String.format("%-9s", decform.format(sine)));
        angle += 15;
        rad = Math.toRadians(angle);
        sine = Math.sin(rad);
        System.out.println(String.format("%5s", decform.format(angle)) + "\t" + String.format("%-9s", decform.format(sine)));
        angle += 15;
        rad = Math.toRadians(angle);
        sine = Math.sin(rad);
        System.out.println(String.format("%5s", decform.format(angle)) + "\t" + String.format("%-9s", decform.format(sine)));
        angle += 15;
        rad = Math.toRadians(angle);
        sine = Math.sin(rad);
        System.out.println(String.format("%5s", decform.format(angle)) + "\t" + String.format("%-9s", decform.format(sine)));
        angle += 15;
        rad = Math.toRadians(angle);
        sine = Math.sin(rad);
        System.out.println(String.format("%5s", decform.format(angle)) + "\t" + String.format("%-9s", decform.format(sine)));
        angle += 15;
        rad = Math.toRadians(angle);
        sine = Math.sin(rad);
        System.out.println(String.format("%5s", decform.format(angle)) + "\t" + String.format("%-9s", decform.format(sine)));
        angle += 15;
        rad = Math.toRadians(angle);
        sine = Math.sin(rad);
        System.out.println(String.format("%5s", angle) + "\t" + String.format(" %-9s", sine));
        angle += 15;
        rad = Math.toRadians(angle);
        sine = Math.sin(rad);
        System.out.println(String.format("%5s", decform.format(angle)) + "\t" + String.format(" %-9s", decform.format(sine)));
        angle += 15;
        rad = Math.toRadians(angle);
        sine = Math.sin(rad);
        System.out.println(String.format("%5s", decform.format(angle)) + "\t" + String.format(" %-9s", decform.format(sine)));
        angle += 15;
        rad = Math.toRadians(angle);
        sine = Math.sin(rad);
        System.out.println(String.format("%5s", decform.format(angle)) + "\t" + String.format(" %-9s", decform.format(sine)));
        angle += 15;
        rad = Math.toRadians(angle);
        sine = Math.sin(rad);
        System.out.println(String.format("%5s", decform.format(angle)) + "\t" + String.format(" %-9s", decform.format(sine)));
        angle += 15;
        rad = Math.toRadians(angle);
        sine = Math.sin(rad);
        System.out.println(String.format("%5s", decform.format(angle)) + "\t" + String.format(" %-9s", decform.format(sine)));
        angle += 15;
        rad = Math.toRadians(angle);
        sine = Math.sin(rad);
        System.out.println(String.format("%5s", decform.format(angle)) + "\t" + String.format(" %-9s", decform.format(sine)));
        angle += 15;
    }
}
