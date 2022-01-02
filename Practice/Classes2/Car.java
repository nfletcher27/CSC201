public class Car extends Vehicle {

	int wheels = 4;
	int distance = 0;
	
	public void move(int a) {
		distance = distance + a;
	}
	
	public void displayDistance() {
		System.out.println("The cars distance is: " +  distance);
	}
}
