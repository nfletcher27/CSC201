// in Java we can test classes (class within a class).
// to access an inner class, create an object of the outer class, then create an object of the inner class

class OuterClass {
  int x = 10;
  
  class InnerClass {
    int y = 5;
  }
}

public class Main {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}

// should output 15

// unlike a regular class, an inner class can be private or protected. If you don't want outside objects accessing the inner class, declare the class as private:
class OuterClass {
  int x = 10;
  
  private class InnerClass {
    int y = 5;
  }
}

OuterClass.InnerClass myInner = myOuter.new InnerClass(); // this will result in an error

// an inner class can also be static, which means that you can access it without creating an object of the outer class

static class InnerClass {
  int y = 5;
  
  OuterClass.InnerClass myInner = new OuterClass.InnerClass();
  System.out.println(myInner.y);
}
  // will output 5

// one advantage of inner classes, is that they can access attributes and methods of the outer class

class OuterClass {
  int x = 10;
  
  class InnerClass {
    public int myInnerMethod() {
      return x;
    }
  }
}

public class Main {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.myInnerMethod());
  }
}

