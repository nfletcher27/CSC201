// LinkedList is almost identical to ArrayList

import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Benz");
    cars.add("RollsRoyce");
    System.out.println(cars);
  }
}

// LinkedList has all the same methods of ArrayList as they both implement the List interface.
// LinkedList stores its items in containers, and all the containers are linked
// An ArrayList is used for storing and accessing data, a LinkedList is for manipulating data

// list of useful methods for LinkedList

addFirst()  // adds an item to the beginning of the list
addLast()  // self explanatory /\
removeFirst() // removes item at beginning of list
removeLast() // end of list
getFirst() // gets first item
getLast() // same
      
