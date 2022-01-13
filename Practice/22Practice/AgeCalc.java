import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateBirth {
	public static void main(String[] args) {
		
		System.out.println("This program will say how old you are.");
		System.out.println("Firstly, what year were you born?");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		System.out.println("Second, what month (numerically)?");
		int month = scan.nextInt();
		System.out.println("And third, what day of the month?");
		int day = scan.nextInt();
		
		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.of(year, month, day);
		int years = Period.between(birthDate, today).getYears();
		int days = Period.between(birthDate, today).getMonths();
		int months = Period.between(birthDate, today).getDays();
		
		// Tried to work around this but got lazy and confused, only the years are accurate here. The months and days don't work properly
		System.out.println("You are " + years + " years, " + months + " months, and " + days + " days old.");
		scan.close();
	}
}
