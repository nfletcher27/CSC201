import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in); // Scanner object
    System.out.println("Enter username");
    
    String userName = myScanner.nextLine(); // reads input
    System.out.println("Your username is: " + userName); // prints output
  }
}

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in); // Scanner object
    System.out.println("Enter username, account #, and desired account deposit:");
    
    String userName = myScanner.nextLine(); 
    int accountNumber = myScanner.nextInt();
    int deposit = myScanner.nextInt();
    
    double accountBalance;
  }
}
