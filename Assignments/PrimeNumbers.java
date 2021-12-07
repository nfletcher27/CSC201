import java.util.Scanner;

public class PrimeNumbers {

public static void main(String[] args) {

	// Horstmann Chapter 4, Project P4.18
	// This program will take a user entered number and return all prime numbers (divisible by only 1 and itself) up to that number entered
	
	Scanner scan = new Scanner(System.in);
    String  primeNum = "";
    int i = 0;
    int num = 0;
    
    System.out.println("Up to what integer would you like to see prime numbers?"); // Prompts user for a number to return prime numbers
    
    int max = scan.nextInt();
    scan.close();
    
   for (i = 1; i <= max; i++) // Create integer to compare to maximum, add 1 
   {
	   int count = 0;
	   for (num = i; num >= 1; num--) // Puts num = to i 
	   {
		   if (i % num == 0) // If the remainder of i/num is 0, add one to the counter
		   {
			   count = count + 1;
		   }
	   }
	if (count == 2)
	{
		primeNum = primeNum + i + " ";
	}	   
   }
   
   System.out.println("The prime numbers up to " + max + " are\n" + primeNum); // Returns the prime numbers up to entered #
   
   }
}
