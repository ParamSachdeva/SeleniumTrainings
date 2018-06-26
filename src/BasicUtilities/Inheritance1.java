public class Inheritance1 {

	public int cadence;
	public int gear;
	public int speed;

	public Inheritance1(){}

	public Inheritance1(int startCadence, int startSpeed, int startGear) {
		gear = startGear;
		cadence = startCadence;
		speed = startSpeed;
	}

	public void setCadence(int newValue) {
		cadence = newValue;
	}

	public void setGear(int newValue) {
		gear = newValue;
	}

	public void applyBrake(int decrement) {
		speed -= decrement;
	}

	public void speedUp(int increment) {
		speed += increment;
	}
	
	public void OverrideEx() {
		System.out.println("In Super class");
	}
	
	public static void main(String[] args) {
		Inheritance1 obj1 = new Inheritance1();

	}
}
