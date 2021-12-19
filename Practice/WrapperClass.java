// Wrapper classes provide a way to use primitive data types as objects
// All wrapper classes are the same name except first letter capitalized except for:
int = Integer
char = Character
// the rest are as such:
byte = Byte
float = Float

// When working with Collection objects, such as ArrayList, primitive types can't be used
ArrayList<int> myNumbers // invalid
ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // valid

// To create wrapper objects, use the wrapper class
public class Main {
  public static void main(String[] args) {
    Integer myInt = 5;
    Double myDouble = 5.99;
    Character myChar = 'A';
    System.out.println(myInt + myDouble + myChar);
  }
}

// Use methods to get value associates with object
System.out.println(myInt.intValue());
System.out.println(myDouble.doubleValue());

// Another helpful method is the toString method which converts Wrapped objects to String type
Integer myInt = 100;
String myString = MyInt.toString();
System.out.println(myString.length());
