package JavaL;

public class SuperKeywordL1 extends SuperKeywordL{

	int speed=100;  
	void display(){  
		System.out.println(speed);//will print speed of Bike   
		System.out.println(super.speed);
	}  
	public static void main(String args[]){  
		SuperKeywordL1 b=new SuperKeywordL1();  
		b.display();  
	}  
}  
