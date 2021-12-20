// Java throws exceptions when something goes wrong
/* The try statement allows us to define a block of text to be tested before executing
   the catch statement allows us to define a block of code to be executed if the try block throws an error
   the try and catch keywords come as a pair */

try {
  // test for errors
}
catch(Exception e) {
  // handle errors
}

// Consider
public class Main {
  public static void main(String[] args) {
    int[] myNumbers = {1, 2, 3};
    System.out.println(myNumbers[10]);
  }
}
// this will be an error
// Use try and catch to test
public class Main {
  public static void main(String[] args) {
    try {
      int[] numbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    }
  }
}

// use the finally statement to execute code regardless of the try...catch
try {
  int[] numbers = {1, 2, 3};
  System.out.println(numbers[5]);
} catch (Exception e) {
  System.out.println("Something went wrong.");
} finally {
  System.out.println("The 'try catch' is finished.");
}

// the throw statement allows you to create a custom error message
if (age < 18) {
  throw new ArithmeticException("Access denied - you must be at least 18 years old.");
}
else {
  System.out.println("Access granted");
}


                       
