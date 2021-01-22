package Assignment4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionQ5 {
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
					throw new Exception("Number Can't be greater than 100");
				} else if (x % 2 == 0) {
					System.out.println("You have Entered Even Number");
				} else if (x % 2 != 0) {
					System.out.println("You have entered Odd number");
				}
			} catch (InputMismatchException e) {
				Scan.next();
				System.out.println("You must enter a Integer");
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
		Scan.close();
	}
}
