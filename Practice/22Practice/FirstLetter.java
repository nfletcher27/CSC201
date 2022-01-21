import java.util.Scanner;

public class Growth {
    public static void main(String[] args) {
    	System.out.println("Enter a word or sentence that will capitalize the input");
    	Scanner scan = new Scanner(System.in);
    	String input = scan.nextLine();
    	System.out.println(capital(input));
    	scan.close();
    }
    public static String capital(String sentence) {
    	String cap = sentence.substring(0, 1);
    	String rest = sentence.substring(1, sentence.length());
    	return cap.toUpperCase() + rest;
    }
}
