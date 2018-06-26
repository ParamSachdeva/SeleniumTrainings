package OOPSJava;


class StaticKeyword{  
	static int rollno;  
	static String name;  
	
	
	
	static String college ="ITS";  
	//static int count=0;
	 int count ;
	 StaticKeyword(int r,String n){  
		rollno = r;  
		name = n;  
	}  
	void xyz (){System.out.println(rollno+" "+name+" "+college);}  

	StaticKeyword(){  
		count++;  
		System.out.println(count);  
		
	}  

	public static void main(String args[]){  
		
		
		StaticKeyword s1 = new StaticKeyword(111,"Karan");  
		StaticKeyword s2 = new StaticKeyword(222,"Aryan");  

		s1.xyz();  
		s2.xyz();  


		StaticKeyword c1=new StaticKeyword();  
		StaticKeyword c2=new StaticKeyword();  
		StaticKeyword c3=new StaticKeyword();  


	}  
}  