package Assignment4;

import java.util.InputMismatchException;
import java.util.Scanner;

class GreaterThan100Exception extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5355737409200371921L;

	public GreaterThan100Exception(String message) {
		super(message);
	}
}

public class ExceptionQ6 {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Enter a number or enter -1 to quit");
				int x = Scan.nextInt();
				if (x == -1) {
					System.out.println("Your Program will End Here");
					break;
				} else if (x > 100) {
					throw new GreaterThan100Exception("Number Can't be greater than 100");
				} else if (x % 2 == 0) {
					System.out.println("You have Entered Even Number");
				} else if (x % 2 != 0) {
					System.out.println("You have entered Odd number");
				}
			} catch (InputMismatchException e) {
				Scan.next();
				System.out.println("You must enter a Integer");
				
			} catch (GreaterThan100Exception e) {
				System.out.println(e.getMessage());
			}
		}
		Scan.close();
	}
}
