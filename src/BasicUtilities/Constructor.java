package BasicUtilities;

public class Constructor {
	int id;
	String name; 

	Constructor()
	{
		System.out.println("Constructor Created");
	}

	Constructor(int i,String n){  
		id = i;  
		name = n;  
	} 

	void display(){
		System.out.println(id + " " + name);
	}
	public static void main(String[] args) {

		Constructor cons = new Constructor(); // not used but intialize
		Constructor c1 = new Constructor(111,"Hello");
		Constructor c2 = new Constructor(222,"Hai");
		c1.display();
		c2.display();
	}
}

