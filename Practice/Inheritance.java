class Vehicle {
  protected String brand = "Ford"; // vehicle attribute
  public void honk() { // vehicle method
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";    // car attribute
  public static void main(String[] args) {
    
    // create a myCar object
    Car myCar = new Car();
    
    // call the honk method of the vehicle class on the myCar object
    myCar.honk();
    
    // display the brand attribute and modelName
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}

// the final keyword

final class Vehicle {
  ...
  }
class Car extends Vehicle {
  ...
  }

// Error: cannot inherit from final Vehicle
    
