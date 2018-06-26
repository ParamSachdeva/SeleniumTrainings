package BasicJavaSessions;


public class Dog {  
	
	
	static String color="black";
	static Dog  d = new Dog();
	
	
	
	public static void main(String[] args) {
			
		String xyz = new String("hello");
		
		
		d.xyz();
		xyz();
		//System.out.println(color);//prints color of Dog class  
		//System.out.println(d.color);//prints color of Dog class
		//System.out.println(super.color);//prints color of Animal class  
	}
	public static void xyz()
	{
		//Dog d = new Dog();	
		System.out.println(color);
		//System.out.println(d.color);
	}
}
