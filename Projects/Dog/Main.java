public class Main {
	public static void main(String[] args) {
	
		Dog mark = new Dog("mark", 5);
		Cat sammy = new Cat("Sammy", 6, 20);
		Cat wilson = new Cat("Wilson", 22);
		mark.talk();
		mark.setAge(11);
		mark.talk();
		mark.add2();
		mark.talk();
		sammy.talk();
		wilson.talk();
	}
}
