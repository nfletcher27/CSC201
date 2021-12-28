public class Dog {

	protected String name;
	protected int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void talk() {
		System.out.println("I am " + this.name + " and I am " + this.age + " years old");
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge (int age) {
		this.age = age;
	}
	
	public void add2() {
		this.age = age + 2;
	}
}
