public class Main {

	public static void main(String[] args) {
		
	Airplane jet = new Airplane();
	jet.setSpeed(20);
	jet.setName("Jet");
	jet.displayData();
	jet.turnOn();
	jet.displayData();
	
	Car audi = new Car();
	audi.setName("Audi");
	audi.setSpeed(25);
	audi.move(25);
	audi.turnOn();
	audi.displayDistance();
	audi.displayData();
	
	}
}
