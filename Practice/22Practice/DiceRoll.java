import java.util.Random;

public class AddTwo {
	public static void main (String[] args ) {
		System.out.println("Random dice generators:");
		diceRoll();
		diceRoll();
		diceRoll();
		diceRoll();
	}
	public static void diceRoll() {
		Random coolNumber = new Random();
		int x = coolNumber.nextInt(6) + 1;
		System.out.println("You rolled a: " + x);
	}
}
