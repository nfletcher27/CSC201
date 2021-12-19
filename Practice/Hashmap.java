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

// access an item
capitalCities.get("England"); // will return London

// remove an item
capitalCities.remove("England");

// clear all items
capitalCities.clear();

// return how many items 
capitalCities.size();

// use a for-each loop to loop through
// you can use keySet() method for only keys, and values() respectively
for (String i : capitalCities.keySet()) {
  System.out.println(i);
}

for (String i : capitalCities.values()) {
  System.out.println(i);
}

for (String i : capitalCities.values()) {
  System.in.println("key: " + i + " value " + capitalCities.get(i));
}

// Keys and values are typically objects. Strings are objects, but for other types such as ints, you must specify the wrapper class.
// HashMap set for String keys and Integer values
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    
    // Create HashMap object called people
    HashMap<String, Integer> people = new HashMap<String, Integer>();
    
    // Add keys and values (Name, Age)
    people.put("John", 32);
    people.put("Steve", 30);
    people.put("Angel", 33);
    
    for (String i : people.keySet()) {
      System.out.println("key: " + i + " value: " + people.get(i));
    }
  }
}

