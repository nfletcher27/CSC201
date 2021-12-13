// some methods of finding and returning out first non-repeating character in a string
// method 1: using for loops to traverse through our string, adding 1 to our i counter each main loop and resetting our j loop for each iteration until a non-repeat is found
import java.util.Scanner;
public class MoreTesting {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input string: ");
		String dupes = scan.nextLine();
		System.out.println(firstDuplicate(dupes));
		scan.close();
	}
	static char firstDuplicate(String d) {
		for (int i = 0; i < d.length(); i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < d.length(); j++) {
				if (d.charAt(i) == d.charAt(j) && (i != j)) {
						isDuplicate = true;
						break;
				}
			}
			if(!isDuplicate)
				return d.charAt(i);
		}
		return '_';
	}	
}
// method 2
// using an array and the toCharArray method to assign values to our array, traversing through the loop 
import java.util.Scanner;
public class Testing {	
	public static void main(String[] args) {
        
		System.out.println("Input string: ");
		Scanner sc = new Scanner(System.in);
		String dupes = sc.nextLine();
		System.out.println(firstDuplicate("aabbccdff"));
		sc.close();
		
	}
	static char firstDuplicate(String s) {
		int[] char_counts = new int[26];
		
		for (char c : s.toCharArray()) char_counts[c - 'a']++;
		
		for (char c : s.toCharArray()) {
			if (char_counts[c - 'a'] == 1) return c;
		}
		return '_';
	}
}
