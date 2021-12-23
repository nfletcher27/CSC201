// Expressions which are short blocks of code taking a parameter and returning a value
parameter -> expression
// for multiple parameters
(parameter1, parameter2) -> expression
// expressions are limited. to do more complex operations, use curly braces
(parameter1, parameter2) -> { code block }

// Lambda expressions are typically used to pass parameters to a function
// Using lambda in the ArrayList forEach() method
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    numbers.forEach( (n) -> { System.out.println(n); } );
  }
}

// Use Java's Consumer interface to store lambda expression in a variable
// Lambda expression should have the same number of parameters and same return type as the method
import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(9);
    numbers.add(5);
    numbers.add(1);
    numbers.add(3);
    Consumer<Integer> method = (n) -> { System.out.println(n); };
    numbers.forEach( method );
  }
}

// We can create a method which uses a lambda as a parameter
// The method should have a single=method interface as its type
interface StringFunction {
  String run(String str);
}

public class Main {
  public static void main(String[] args) {
    StringFunction exclaim = (s) -> s + "!";
    StringFunction ask = (s) -> s +"?";
    printFormatted("Hello", exclaim);
    printFormatted("Hello," ask);
  }
  public static void printFormatted(String str, StringFunction format) {
    String result = format.run(str);
    System.out.println(result);
  }
}
