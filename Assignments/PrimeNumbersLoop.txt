import java.util.Scanner;

public class Seriously {

public static void main(String[] args) {

	// Nesta Fletcher
	// 9/30/2021
	// Horstmann Chapter 4, Project P4.18
	// This program will take a user entered number and return all prime numbers (divisible by only 1 and itself) up to that number entered
	
	Scanner scan = new Scanner(System.in);
    int i = 0;
    int num = 0;
    String  primeNum = "";
    
    System.out.println("Up to what integer would you like to see prime numbers?"); // Prompts user for a number to return prime numbers
    
    int max = scan.nextInt();
    scan.close();
    
   for (i = 1; i <= max; i++) 
   {
	   int count = 0;
	   for (num = i; num >= 1; num--) 
	   {
		   if (i % num == 0) 
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
