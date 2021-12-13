// an abstract class can have both regular and abstract methods

abstract class Animal {
  public abstract void animalSound();
  public void sleep() {
    System.out.println("zZz");
  }
}

// in the above code, it is illegal to create an Animal object

Animal myObj = new Animal(); // will generate and error

// to access the abstract class, it must be inherited from another class. Let's convert the Animal class we used in polymorphism to an abstract:

//abstract class
abstract class Animal {
  public abstract void animalSound(); // abstract method has no body
  public void sleep() { // our regular method
    System.out.println("zZz");
  }
}

// subclass (inherited from Animal)
class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says oink!"); // we provide the animalSound body here
  }
}

class Main {
  public static void main{String[] args) {
    Pig myPig = new Pig(); // create Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
