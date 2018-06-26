package BasicJavaSessions;


class ClassObject{  
	
	
	//To compile:	javac Hello.java
	//To execute:	java Hello
	//File Name and Class Name should be same
	
	
	int id;//data member (also instance variable)  >> By Default integer is 0
	String name;//data member(also instance variable)  By Default String is null
	
	/*static int id;//data member (also instance variable)  >> By Default integer is 0
	static String name;//data member(also instance variable)  By Default String is null
	*/

	public static void main(String args[]){  
		ClassObject s1=new ClassObject();//creating an object of Student  
		System.out.println(s1.id);  
		System.out.println(s1.name);  
		/*System.out.println(id);  
		System.out.println(name);  
		*/
		s1.id = 5;
		s1.name = "XYZ";

		System.out.println(s1.id);  
		System.out.println(s1.name);  
	}  
}  