package JavaL;

public class ThisKeyword {

	int id;  
	String name;  

	ThisKeyword(int id,String name){  
		
		id = id;  
		name = name;  
		//this.id = id;  
	    //this.name = name;
		System.out.println(id+" "+name);
		
	}  
	void display(){System.out.println(id+" "+name);}  

	public static void main(String args[]){  
		ThisKeyword s1 = new ThisKeyword(111,"Karan");  
		ThisKeyword s2 = new ThisKeyword(321,"Aryan");  
		s1.display();  
		s2.display();  
	}  
}  
