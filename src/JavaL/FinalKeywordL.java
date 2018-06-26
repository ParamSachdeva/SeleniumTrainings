package JavaL;

public class FinalKeywordL{  
	final int speedlimit=90;//final variable  
	
	void run(){  
		//speedlimit=400;  
		System.out.println(speedlimit);
	}  
	public static void main(String args[]){  
		FinalKeywordL obj=new  FinalKeywordL();  
		obj.run();  
	}  
}//end of class  