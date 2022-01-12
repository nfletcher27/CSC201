// Reverses the string of whatever argument is passed to the method
public class ReverseString {

	public static void main(String[] args) {
		
		reverse("monkey"); // passing our argument
	}

	public static void reverse(String s) {
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
			
		System.out.println(reverse);
		
		
		}
	}
