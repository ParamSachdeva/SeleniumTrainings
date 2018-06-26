package OOPSJava;

public class MethodOverridingL {

	void run(){System.out.println("Vehicle is running");}  
}  


/*QA

Can we override static method?
No, static method cannot be overridden. It can be proved by runtime polymorphism, so we will learn it later.

Can we override java main method?
No, because main is a static method.

*/

/*
Method Overloading	Method Overriding
1)	Method overloading is used to increase the readability of the program.	
Method overriding is used to provide the specific implementation of the method that is already provided by its super class.
2)	Method overloading is performed within class.	
Method overriding occurs in two classes that have IS-A (inheritance) relationship.
3)	In case of method overloading, parameter must be different.	
In case of method overriding, parameter must be same.
4)	Method overloading is the example of compile time polymorphism.	
Method overriding is the example of run time polymorphism.
5)	In java, method overloading can't be performed by changing return type of the method only. Return type can be same or different in method overloading. But you must have to change the parameter.	
Return type must be same or covariant in method overriding.
*/