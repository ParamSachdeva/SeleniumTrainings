package OOPSJava;

class IntializeViadifferntClass{  
	public static void main(String args[]){  
		PrimaryClassIntializeViadifferntClass s1=new PrimaryClassIntializeViadifferntClass();  
		PrimaryClassIntializeViadifferntClass s2=new PrimaryClassIntializeViadifferntClass();  
		s1.insertRecord(111,"Karan");  
		s2.insertRecord(222,"Aryan");  
		s1.displayInformation();  
		s2.displayInformation();  
	}  
}  