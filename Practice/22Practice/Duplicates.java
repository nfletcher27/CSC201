import java.util.Scanner;

// Method that takes the argument of a sentence and will return any characters which repeated

public class Duplicates {
	public static void main(String[] args) {
		
		System.out.println("Type in a sentence to see how many duplicates you get!");
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		duplicate(sentence);
		scan.close();
	}
	public static void duplicate(String sentence) {
		
		
		String chars = "";
		String dupes = "";
		for(int i =0; i < sentence.length(); i++) {
			
			
			String current = Character.toString(sentence.charAt(i));
			if(chars.contains(current)) {
				if(!dupes.contains(current)) {
					dupes += current + ", ";
				}
			}
			chars += sentence.charAt(i);
			
		}
		System.out.println("The following characters repeated at least once: ");
		System.out.println(dupes);
	}
}
