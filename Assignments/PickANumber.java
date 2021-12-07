import java.util.Scanner;

public class PickANumber {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); // Introduces a scanner to read an input
		
		System.out.println("Please enter an integer between 1,000 and 999,999: ");
		
		// Text providing the queue for the user to input
		
		String input = in.next();
		
		int length = input.length();
		
		/*                  
		 * This returns the length of the string input
		 * 
		 * We can use this string to extract substrings
		 * 
		 * Below, two substrings are being extracted to take the part before and after the comma
		 */
		
				String first = input.substring(0, length - 4);
				String second = input.substring(length - 3, length);
				// Creates two substrings, 'first' which is anything before the comma, and 'second' which is anything after
		
			String finish = first + second;
			
			// This combines both 'sub'strings back into a string
		
			System.out.println (finish);
		
			// Prints the original user input without a comma
			
			in.close();	
	}
}
