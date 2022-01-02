public class Vehicle {
   
	private String name;
	private Boolean engineOn = false;
	private int speed;
	
	public Vehicle () {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void turnOn() {
		engineOn = true;
	}
	
	public void turnOff() {
		engineOn = false;
	}
	
	public void displayData() {
		if(engineOn == true) {
		System.out.println("The " + name + " is going " + speed +"MPH");
		} else { System.out.println("The engine is off"); }
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void getSpeed() {
		System.out.println(speed + "MPH");
	}
}
