public class Main {
  //static method
  static void myStaticMethod() {
    System.out.println("Called without creating an object.");
  }
  
  //public method
  public void myPublicMethod() {
    System.out.println("Public method must be called using an object.");
  }
  
  //Main method
  public static void Main(String[] args) {
    myStaticMethod(); //calls static method
    // myPublicMethod(); would output an error
    
    Main myObj = new Main(); //create Main object
    myObj.myPublicMethod(); //calls public method
  }
}
