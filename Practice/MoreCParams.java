public class Main() {
   int modelYear;
  String modelname;
  
  public Main(int year, String name) {
    modelYear = year;
    modelName = name;
  }
  
  public static void Main(String[] args) {
    Main myCar = new Main(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);      
    /* the different between a constructor and a method is that
    constructors initialize objects that are being created with the new operator
    while methods perform operations on objects that already exist.
    
    Constructors can't be called directly, they are called implicitly when the new keyword
    creates an object. Methods can be called on objects already created with new.
    
    The two look very similar in code. They take parameters, can have modifiers such as public,
    and have bodies in braces. Constructors must be named the same as the class, and cannot return anything.
    Methods are the opposite, they must either be void or return something. */
  }
}
