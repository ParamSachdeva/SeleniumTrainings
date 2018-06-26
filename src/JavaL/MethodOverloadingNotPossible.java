//Method Overloaing is not possible by changing the return type of method?

package JavaL;


public class MethodOverloadingNotPossible {

	int sum(int a,int b){
		System.out.println(a+b);
		return a+b;
	}  

/*
	void sum(int a,int b){
		System.out.println(a+b);
		//return a+b;
	}  
*/
	public static void main(String args[]){  
		MethodOverloadingNotPossible obj=new MethodOverloadingNotPossible();  
		int result=obj.sum(20,20); //Compile Time Error  
	}
}
