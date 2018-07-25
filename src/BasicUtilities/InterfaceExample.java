package BasicUtilities;


interface printable{  
	public void print();
	int i = 3; 
}  

public class InterfaceExample implements  printable{


	public void print()
	{
		System.out.println("Hello");
	} 


	public static void main(String[] args) {
		InterfaceExample IE = new InterfaceExample();
		IE.print();  
		//i=9;

		//interface class object via class
		printable x = new InterfaceExample();
		x.print();
	}

}
