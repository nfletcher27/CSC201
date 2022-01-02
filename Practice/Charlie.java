interface DogTypes {
	public void barkTwice();
	public void barkThenSleep();
}

abstract class Dog {

	String breed;
	String name;
	
	public void bark() {
		System.out.println("Bark!");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void petDog() {
		System.out.println("You have petted " + name);
	}
}

class Chi extends Dog {
	
	public void sleep() {
		System.out.println("zzz");
	}

	
}

public class Statucs extends Dog {
	
	public static void main(String[] args) {
		
	Chi d = new Chi();
	d.bark();
	d.sleep();
	d.setName("Charlie");
	d.petDog();
	
	}
}
