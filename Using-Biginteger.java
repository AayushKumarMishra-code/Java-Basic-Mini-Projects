import java.math.BigDecimal;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter your 1st number:");
		String a = scan.nextLine();
		System.out.println("Enter your 2nd number:");
		String b= scan.nextLine();
		BigDecimal c = new BigDecimal(a);
		BigDecimal d = new BigDecimal(b);
		BigDecimal w = c.divide(d);
	    System.out.println(w);
		
		
	}
}
