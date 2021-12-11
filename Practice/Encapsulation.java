// our getter and setter methods

public class Person {
  private String name;
  
  public String getName() {
    return name;
  }
  
  public void setName(String newName) {
    this.name = newName;
  }
}

// this code will result in an error because name is private
public class Main {
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.name = "John"; //error
    System.out.println(myObj.name); //error
  }
}

// instead use our accessor and mutator methods
public class Main {
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.setName("John"); // sets name to John
    System.out.println(myObj.getName()); // returns new value
  }
}
