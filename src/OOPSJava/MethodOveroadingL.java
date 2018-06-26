//By changing number of arguments
//By changing the data type

package OOPSJava;

public class MethodOveroadingL {

	int sum(int a,int b){
		System.out.println(a+b);
		return a+b;
	}  
	
	String sun(String a,String b){
		System.out.println(a+b);
		return a+b;
	}
	
	void sum(int a,int b,int c){System.out.println(a+b+c);}
	void sum(double a,double b){System.out.println(a+b);}
	

	public static void main(String args[]){  
		MethodOveroadingL obj=new MethodOveroadingL();  
		obj.sum(10,10,10);  
		obj.sum(20,20);  
		obj.sum(10.5,10.5);  
		obj.sun("Santosh", "Kumar");

	}  

}
