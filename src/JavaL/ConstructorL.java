//Constructor name must be same as its class name
//Constructor must have no explicit return type

package JavaL;

class ConstructorL{  
	
	
	
	int id;
	String name;
	
	ConstructorL(){
		System.out.println("Bike is created");
	}  
	
	
	ConstructorL(int id,String name ){
		System.out.println(id+" "+name);
	}  
	
	
	void display(){
		System.out.println(id+" "+name);
		}  
	
	
	public static void main(String args[]){  
		ConstructorL b1=new ConstructorL();  
		ConstructorL b2=new ConstructorL(5,"Santosh");  
		b1.display();
		b2.display();
	}  
}  

//=============================================================
//IV QA
//=============================================================


/*
Constructor is used to initialize the state of an object.	Method is used to expose behaviour of an object.
Constructor must not have return type.	Method must have return type.
Constructor is invoked implicitly.	Method is invoked explicitly.
The java compiler provides a default constructor if you don't have any constructor.	Method is not provided by compiler in any case.
Constructor name must be same as the class name.	Method name may or may not be same as class name.
*/


/*
Does constructor return any value?
yes, that is current class instance (You cannot use return type yet it returns a value).
Can constructor perform other tasks instead of initialization?
Yes, like object creation, starting a thread, calling method etc. You can perform any operation in the constructor as you perform in the method.
*/