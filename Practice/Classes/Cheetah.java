public class Cheetah extends Cat {
	
	protected int speed;
	
	 public Cheetah(String name, int age, int speed) {
		super(name, age);
		this.speed = speed;
	}
	 
	 public void talk() {
			System.out.println("I am " + this.name + " and I am " + this.age + " years old" + " and I'm " + speed +"MPH fast");
	 }
}
