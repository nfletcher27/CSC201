public class Main {
	public static void main(String[] args) {
	// ended video with STATIC segment
		Dog mark = new Dog("mark", 5);
		Cat sammy = new Cat("Sammy", 6, 20);
		Cat wilson = new Cat("Wilson", 22);
		Cheetah max = new Cheetah("max", 7, 20);
		mark.talk();
		mark.setAge(11);
		mark.talk();
		mark.add2();
		mark.talk();
		sammy.talk();
		wilson.talk();
		sammy.changeCount();
		sammy.talk();
		wilson.talk();
		max.talk();
	}
}
