// interface

interface Animal {
  public void animalSound(); // interface method, no body
  public void run(); // interface method
}

// interface ______________________________________________________________________________
interface Animal {
  public void animalSound();
  public void run(); 
}

// Pig implements the Animal interface
class Pig implements Animal {
  public void animalSound() {
    // our animalSound() body is provided here
    System.out.println("Oink!");
  }
  public void sleep() {
    System.out.println("zzz");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}

//__________________________________________________________________________________________
// multiple interfaces
interface FirstInterface {
  public void myMethod(); // int method
}

interface SecondInterface {
  public void myOtherMethod(); // int method
}

class DemoClass implements FirstInterface, SecondInterface {
  public void myMethod() {
    System.out.println("Example of first method!");
  }
  public void myOtherMethod() {
    System.out.println("Our second method is in here!");
  }
}

class Main {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}
