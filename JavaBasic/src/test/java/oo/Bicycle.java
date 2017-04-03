package test.java.oo;

public class Bicycle {
	
	private int cadence;
	private int gear;
	private int speed;
	private int id;
	
	
	private static int numberOfBicycles = 0; 

	public Bicycle(int startCadence, int startSpeed , int startGear) {
		this.cadence = startCadence;
		this.speed = startSpeed;
		this.gear = startGear;
		
		//increament numbe rof Bycles
		 
		this.id = ++Bicycle.numberOfBicycles;
	}
	
	public static int getNumberofBycles(){
		return Bicycle.numberOfBicycles;
	}
	
	public int getId() {
		return id;
	}

	public int getCadence() {
		return cadence;
	}

	public void setCadence(int cadence) {
		this.cadence = cadence;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
