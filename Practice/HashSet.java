// HashSets have unique collections of items

HashSet<String> cars = new HashSet<String>();

// It also has an add method
cars.add("BMW");
cars.add("Merc");
cars.add("Lancia");

// if we were to add two items
cars.add("BMW");
cars.add("BMW");
// only one of these would be added

cars.contains("Mazda");
// will return true or false if an item is in the HashSet or not

cars.clear(); // also valid method

// Like a HashMap, items are objects, meaning we must use the equivalent Wrapper class for any primitive types
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    // Create HashSet object called numbers
    HashSet<Integer> numbers = new HashSet<Integer>();
    
    // Add values to the set
    numbers.add(4);
    numbers.add(7);
    numbers.add(8);
    
    // Show which numbers between 1/10 are in the set
    for (int i = 1; i <= 10; i++) {
      if (numbers.contains(i) {
        System.out.println(i + "was found.");
      } else {
        System.out.println(i + "was not found.");
