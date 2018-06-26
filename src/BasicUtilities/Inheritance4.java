
public class Inheritance4 extends Inheritance3{
	 
	void run(){ super.run();System.out.println("running safely with 60km");}  
		  
		  public static void main(String args[]){  
			  Inheritance3 b = new Inheritance4();//upcasting  
		     b.run();  
		     
		  }  
		

}
