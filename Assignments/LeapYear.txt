import java.util.Scanner;

public class PickANumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int year;
		boolean leapYear;
		
		System.out.print("Enter year: ");
		year = input.nextInt();
		input.close();
		
		leapYear = false;
		if ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0) {
		    leapYear = true;
		}
		
		if(leapYear == true)
		{
		    System.out.printf("%d is a leap year.", year);
		}
		else
		{
		    System.out.printf("%d is not a leap year.", year);
		}
	}	
}
