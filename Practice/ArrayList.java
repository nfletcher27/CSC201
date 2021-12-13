// ArrayList is a modifiable array

ArrayList<String> cars = new ArrayList<String>(); // creates our ArrayList object
 
// to add items use add()

ArrayList<String> cars = new ArrayList<String>();
cars.add("Volvo");
cars.add("Audi");
cars.add("BMW");
cars.add("Ferrari");
System.out.println(cars);

// to access an item
cars.get(0); // index starts at 0

// to modify an element
cars.set(0, "Opel");

// to remove
cars.remove(0);

// to remove all elements
cars.clear();

// to find out the size (how many elements)
cars.size();

// to loop through an ArrayList with a for loop use size() for our condition
for (int i = 0; i < cars.size(); i++) {
  System.out.println(cars.get(i));
}

// loop through an ArrayList with a for-each loop:
for (String i : cars) {
  System.out.println(i);
  
// elements in an ArrayList are actually objects. To use other types such as int, we need a wrapper class
ArrayList<Integer> myNumbers = new ArrayList<Integer>();
  myNumbers.add(25);
  myNumbers.add(35);
  myNumbers.add(10);
  myNumbers.add(999);
  for (int i : myNumbers) {
    System.out.println(i); }
  
// we can use sort() to sort alphabetically or numerically
Collections.sort(cars);
for (String i : cars) {
  System.out.println(i);
  
// sort an ArrayList of integers
  import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(33);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(34);
    myNumbers.add(8);
    myNumbers.add(12);

    Collections.sort(myNumbers);  // Sort myNumbers

    for (int i : myNumbers) {
      System.out.println(i);
    }
  }
}
