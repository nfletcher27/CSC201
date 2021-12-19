// A Hashmap stores items as keys and values, and you access them with an index of another type (e.g. String)

import java.util.Hashmap;

HashMap<String, String> capitalCities = new HashMap<String, String>();

// add items likeso
public class Main {
  public static void main(String[] args) {
    // Create a HashMap object
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "DC");
    System.out.println(capitalCities);
  }
}
