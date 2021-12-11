public class Main() {
  int x;
  
  public Main() {
    x = 5;
  }
  
  public static void main(String [] args) {
    Main myObj = new Main();
    System.out.println(myObj.x); // Should output 5 since our constructor method set the initial value of the Main object type to 5
  }
}
    
