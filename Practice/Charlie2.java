interface DogTypes {
	public void barkTwice();
	public void barkThenSleep();
	// Implementing two methods for later use
}

abstract class Dog {

	String breed;
	String name;
	// Creating our variables to use in our methods
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void petDog() {
		System.out.println("You have petted " + name);
	}
	
	public void barkTwice() {
		bark();
		bark();
	}
	
	public void bark() {
		System.out.println(name + " barked!");
	}
}

class Chi extends Dog {
	
	public void sleep() {
		System.out.println("zzz");
	}
	
	public void barkThenSleep() {
		bark();
		sleep();
	}
	// Showing the usage of extending an abstract class, also showing how we must use a class to use abstract methods
}

public class Statucs extends Dog {
	public static void main(String[] args) {
		
	Chi d = new Chi();
	// Creating a type Chi to use abstract methods from Dog by extending the abstract class
	
	d.sleep();
	d.setName("Charlie");
	d.bark();
	d.petDog();
	d.barkTwice();
	d.barkThenSleep();
	
	}
}
