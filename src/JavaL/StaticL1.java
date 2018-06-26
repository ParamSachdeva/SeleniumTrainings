package JavaL;

class StaticL1{  
	static int cube(int x){  
		return x*x*x;  
	}  

	public static void main(String args[]){  
		int result=StaticL1.cube(5);  
		System.out.println(result);  
	}  
}  


/*
why java main method is static?
because object is not required to call static method if it were non-static method, jvm create object first then call main() method that will lead the problem of extra memory allocation.
*/