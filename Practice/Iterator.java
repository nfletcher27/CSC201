// Iterators can be used to loop through collections like ArrayLists and HashSets.
import java.util.ArrayList;
import java.utii.Iterator;

public class Main {
  public static void main(String[] args) {
    
    // Make collection
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ferrari");
    
    // Get iterator
    Iterator<String> it = cars.iterator();
    
    // Print first item
    System.out.println(it.next());
  }
}

// Loop through using hasNext() and next()
while (it.hasNext()) {
  System.out.println(it.next());
}

// Iterators are designed to easily change collections they loop through
public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(12);
    numbers.add(8);
    numbers.add(2);
    numbers.add(23);
    Iterator<Integer> it = numbers.iterator();
    while (it.hasNext()) {
      Integer i = it.next();
      if (i < 10) {
        it.remove();
      }
    }
    System.out.println(numbers);
  }
}
// Using a for loop or for each loop will not work because the collection is changing size at the same time the code is trying to loop
