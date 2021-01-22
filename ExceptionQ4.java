package Assignment4;
import java.util.*;

public class ExceptionQ4 {
	public static void main(String[] args) {
		int x;
		Scanner Scan=new Scanner(System.in);
		try
		{
			while(true)
			{
				System.out.println("Enter a number or enter -1 to quit");
				x=Scan.nextInt();
				if(x==(-1))
				{
					System.out.println("Your Program will End Here");
					break;
				}
				else if(x%2==0)
				{
					System.out.println("You have Entered Even Number");
				}
				else if(x%2!=0)
				{
					System.out.println("You have entered Odd number");
				}
			}
		}
		catch(InputMismatchException e)
		{
			Scan.next();
			System.out.println("You must enter a Integer");
		}
	}
	
}
