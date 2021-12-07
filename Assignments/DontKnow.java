import java.util.Scanner;

public class Testing {	
public static void main (String [] args) {

	// Nesta Fletcher
	// 10/17/21
	// Horstmann Chapter 5, Project P5.14
	// This program uses a basic method which will take our user-input values for minutes and hours, and return the time in English vocabulary
	// We use an array for all our values, and some simple special case if-else statements, and then call the method in our main using Println
	
	System.out.println("What time (hour?)");
	Scanner hour = new Scanner(System.in);
	// Getting our input for the hour of day
	
	int hours = hour.nextInt();
	System.out.println("What time (minutes)?");
	Scanner minute = new Scanner(System.in);
	// Getting our input for the minute of day
	
	int minutes = minute.nextInt();
	System.out.println(getTimeName(hours, minutes));
	// Calling our getTimeName method to return the two values which have been 
	
	minute.close();
	hour.close();
	// Closing our scanners
	}
		


static String getTimeName(int hours, int minutes)

{

String numbers[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", 
		"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", 
		"twenty-one", "twenty-two", "twenty-three", "twenty-four", "twenty-five", "twenty-six", "twenty-seven", "twenty-eight", "twenty-nine"};
		// The array we can use for all our possible inputs of minutes (instead of going to 59 we can just reverse the logic of time)
		// When the user enters their value we can simply use the index of this array to find our value

if (hours == 0)

	return "Zero is not an appropriate answer for the hour";
	// Zero wouldn't make sense for an hour of day, but since we need it in our index to bring every value up once, let's make a special case

if (minutes == 0)

		return numbers[hours] + " o' clock";
		// If we are right at a certain hour, we simply return the hour

	else if (minutes == 1)

		return "one minute past " + numbers[hours];
		// Don't won't the plural 'minutes' so we are going to add this special case for 1

	else if (minutes == 15)

		return "quarter past " + numbers[hours];
		// Special case of 15 minutes as a quarter

	else if (minutes == 30)

		return "half past " + numbers[hours];
		// Special case of 30 minutes as half an hour

	else if (minutes == 45)

		return "quarter to " + numbers[(hours % 12) + 1];
		// Special case of 45 minutes which is also a quarter

	else if (minutes == 59)

		return "one minute to " + numbers[hours % 12 + 1];
		// Special case of only a minute until an hour, once again the plural issue (minutes)

	else if (minutes <= 30)

		return numbers[minutes] + " minutes past " + numbers[hours];
		// Our general case for most minutes

	else

		return numbers[60 - minutes] + " minutes to " + numbers[(hours % 12) + 1];
		// We want to make sure our hour time is between 1 and 12, so we use the modulus feature for special cases where we need the NEXT hour
	}
}