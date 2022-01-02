public class Airplane extends Vehicle {

	public int altitude;
	public int speed;
	
	public void rise() {
		altitude = altitude + 10;
	}
	
	public void drop() {
		altitude = altitude - 10;
	}
}
