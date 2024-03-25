import java.util.Scanner;

public class LogTable {
	public static void main(String[] args) {
		double x, lnX;

		System.out.println("<html>");
		System.out.println("<body>");
		System.out.println("<table>");

		System.out.println("<tr><th>x</th><th>ln(x)</th></tr>");
		for (int i = 1; i <= 20; ++i) {
			x = i / 10.0;
			lnX = Math.log(x);

			System.out.printf("<tr><td>%.1f</td><td>%f</td></tr>\n", x, lnX);
		}
		System.out.println("</table>");
		System.out.println("</body>");
		System.out.println("</html>");
	}
}