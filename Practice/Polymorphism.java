// polymorphism allows us to use inheritance to program in a method which can act differently depending on what situation it is introduced to

class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound!");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig goes oink!");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says bark!");
  }
}

class Main {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();
    Animal myPig = new Pig();
    Animal myDog = new Dog();
    myAnimal.animalSound();
    myPig.animalsound();
    myDog.animalSound();
  }
}


