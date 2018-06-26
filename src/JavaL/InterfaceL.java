package JavaL;

interface printable{  
	public void print();
	int i = 3; 
}  

public class InterfaceL implements  printable{


	public void print()
	{
		System.out.println("Hello");
	} 


	public static void main(String[] args) {
		InterfaceL IE = new InterfaceL();
		IE.print();  
		//i=9;

		//interface class object via class
		printable x = new InterfaceL();
		x.print();
	}

}
