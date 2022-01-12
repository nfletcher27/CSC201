import java.util.Scanner;

// Program that asks user for a character to print in a pattern, and how many times to do so

public class ReverseString {
	public static void main(String[] args) {
	
		System.out.println("Hi! Welcome to pattern printer. Please input what character you'd like to print!");
		Scanner scan = new Scanner(System.in);
		char symbol = scan.next().charAt(0);	
		System.out.println("Great, now how many lines would you like?");
		int amount = scan.nextInt();
		System.out.println("Here ya go!");
		patternPrint(symbol, amount); // passing arguments to our method
		scan.close();
	}
	public static void patternPrint(char pattern, int times) {
		for(int i = 0; i < times; i++) {  // this for loop prints out how many columns
			for(int j = 0; j < i; j++) { // this for loop prints out how many characters in a row
				System.out.print(pattern);
			}
			System.out.println(pattern);
		}
		for(int i = times; i >= 0; i--) {  // reverse the logic of the first two for loops, starting at the top and going down
			for(int j = 0; j < i; j++) { // prints how many i is, which will start it at the max and go down by one each iteration
				System.out.print(pattern);
			}
			System.out.println(pattern);
		}
		
	}
}
