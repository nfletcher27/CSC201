public class Main() {
  int x;
  
  public Main(int y) {
    x = y;
  }
  
  public static void Main(String[] args) {
    Main myObj = new Main(5);
    System.out.println(myObj.x);   // our constructor is a parameter, by adding int y parameter, we are passing that parameter to the constructor (5), setting x to 5.
  }
}
