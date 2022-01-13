import java.util.Scanner;

public class Palindromes {
	public static void main(String[] args) {
	
	System.out.println("What word would you like to check for a palindrome?");
	Scanner scan = new Scanner(System.in);
	String check = scan.nextLine();
	palindrome(check); // Use our palindrome method to check whether it is a palindrome or not
	scan.close();
	
	}
	public static String reverse(String s) {
		int letterIndex = 0; // variable for our index so we can go up in value while loop goes down
		
		char[] words = new char[s.length()];
		for(int i = s.length()-1; i >= 0; i--) { // starts our value at the top, going down, so we can fill the array backwards
			words[letterIndex] = s.charAt(i); // sets the array value from the back to the front
			letterIndex++; // lets us traverse through our word upwards from 0 
		}
		
		String reverse = ""; // our String to return
		for(int i = 0; i < s.length(); i++) { // basic for loop
			reverse = reverse + words[i]; // adds each letter to our String
		}
		return reverse;
		}
	
	public static void palindrome(String pal) { // Use our reverse method to check whether a word is a palindrome (reverse)
		
		String rev = reverse(pal);
		
		if(rev.equals(pal)) {
			System.out.println("This is a palindrome!");
		} else {
			System.out.println("Not a palindrome, the reverse is: " + rev);
		}
		
	}
}
