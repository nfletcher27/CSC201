// an enum is a special class the represents a group of constants (unchangeable variables)
// to create an enum use the keyword and seperate
enum Level {
  LOW, MEDIUM, HIGH }

// you access enum constants with the dot syntax
Level myVar = Level.MEDIUM;

// enum is short for enumerations, which means specifically listed
// we can have enums within a class
public class Main {
  enum Level {
    LOW, MEDIUM, HIGH }
  
  public static void main(String[] args) {
    Level myVar = Level.MEDIUM;
    System.out.println(myVar);
  }
}

// enums are often used in switch statements
enun Level {
  LOW, MEDIUM, HIGH }

public class Main {
  public static void main(String[] args) {
    Level myVar = Level.MEDIUM;
    
    switch(myVar) {
      case LOW:
        System.out.println("Low level.");
        break;
      case MEDIUM:
        System.out.println("Medium level.");
        break;
      case HIGH:
        System.out.println("High level.");
        break;
    }
  }
}

// the enum type has a values() method, which returns an array of all enum constants.
// helpful for looping
for (Level myVar : Level.values()) {
  System.out.println(myVar);
}
