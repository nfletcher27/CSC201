public class Cat extends Dog {
	
	private int food;
	
	public Cat(String name, int age, int food) {
		super(name, age);
		this.food = food;
	}
	public Cat(String name, int age) {
		super(name, age);
	}
	
	public void talk() {
		System.out.println("I am " + this.name + " and I am " + this.age + " years old" + " and I'm " + this.food + " hungry");
	}
	
}

