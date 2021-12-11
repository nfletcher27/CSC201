public class Main {
  final int x = 10;
  final double PI = 3.14;
  
  public static void Main(String[] args) {
    Main myObj = new Main();
    myObj.x = 50; // will generate an error, cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}
