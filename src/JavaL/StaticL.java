package JavaL;

class StaticL{  
	int rollno;  
	String name;  
	static String college ="ITS";  
	//static int count=0;
	int count = 0;
	StaticL(int r,String n){  
		rollno = r;  
		name = n;  
	}  
	void display (){System.out.println(rollno+" "+name+" "+college);}  

	StaticL(){  
		count++;  
		System.out.println(count);  
	}  

	public static void main(String args[]){  
		StaticL s1 = new StaticL(111,"Karan");  
		StaticL s2 = new StaticL(222,"Aryan");  

		s1.display();  
		s2.display();  


		StaticL c1=new StaticL();  
		StaticL c2=new StaticL();  
		StaticL c3=new StaticL();  


	}  
}  