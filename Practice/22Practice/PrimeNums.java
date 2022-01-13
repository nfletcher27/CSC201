import java.util.ArrayList;

public class DateBirth {
	public static void main(String[] args) {
		
		System.out.println(findPrimes(1, 19));
		
	}
	public static ArrayList<Integer> findPrimes(int start, int end) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		
		for(int n = start; n < end; n++) { // Starting our calculation at the start and stopping when the end is reached
			boolean prime = true;
			int i = 2;
			while(i <= n/2) { // Handles the 2 exception to the prime numbers calculation
				System.out.println("Checking if " + i + " is a multiple");
				if(n % i == 0) { // Anything divisible by 2 will not be prime, except 2
					System.out.println("Yes," + i + " is a multiple")  ;
					prime = false;
					break;
				}
				i++;	
			}
			if(prime) {
				primes.add(n);
			}
		}
		primes.remove(0); // Gets rid of 1 if that shouldn't be included, only works if range is started at 1 or 0
		return primes;
	}
}

	
