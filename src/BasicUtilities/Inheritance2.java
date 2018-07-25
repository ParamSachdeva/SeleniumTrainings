package BasicUtilities;


public class Inheritance2 extends Inheritance1 {

	
	
	public int seatHeight;

	public Inheritance2(){}

	public Inheritance2(int startHeight,
			int startCadence,
			int startSpeed,
			int startGear) {
		
		super(startCadence, startSpeed, startGear);
		seatHeight = startHeight;
	}   


	public void setHeight(int newValue) {
		
		seatHeight = newValue;
	}   

	public void OverrideEx() {
		System.out.println("In Drive/child or current class");
		super.OverrideEx();
	}

	
	public static void main(String[] args) {

		Inheritance2 obj2 = new Inheritance2();	
		obj2.OverrideEx();
		
	}
}