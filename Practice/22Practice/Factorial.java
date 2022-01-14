// Factorial method
public class BigFacts {
	public static void main(String[] args) {
	
	factorial(7);
	}
	
	public static void factorial(int fact) {
		
		int original = fact;
		fact = 1; // Setting our first # to 1 since factorials start at 1*2
		
		for(int i = 2; i <= original; i++) { // Increaeses our multiplier (2) by 1 each iteration, since all factorials start as 1*2
			fact *= i; // This is the equivalent of 1(1+n) which each time will increase by 1 as 1*2*3*4 etc.
		}
		System.out.println(fact);
	}
}
// Output would be 5040
