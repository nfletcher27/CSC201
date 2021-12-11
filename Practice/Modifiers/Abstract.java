// code from Main.java
// abstract class
abstract class Main {
  public String fname = "John";
  public int age = 24;
  public abstract void study(); //abstract
}

//subclass (inherit from Main)
class Student extends Main {
  public int graduationYear = 2018;
  public void study() { //body of the abstract method is provided here
    System.out.println("Studying all day long.");
  }
}
// end code from Main.java

// code for Second.java
class Second {
  public static void main(String[] args) {
    // create object of Student class to inherit attributes and methods
    Student myObj = new Student();
    
    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation year: " + myObj.graduationYear);
    myObj.study(); //call abstract method
  }
}
