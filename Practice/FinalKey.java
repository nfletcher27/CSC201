public class Final {
  
  final int MIN = 0;
  final int MAX = 5;
  static final double PI = 3.14;
  
  final public void sayHi() {
    System.out.println("Hi!");
  }
  
  public static void main(String[] args) {
    Final f = new Final();
    
    f.sayHi();
  }
}

// Final class

final public class Final {
}

// Unextendable

class otherClass extends Final {  // would cause an error, cannot subclass final classes
