package JavaL;

//class MultipleInheritenceNotPossible 
class MultipleInheritenceNotPossible extends A
////class MultipleInheritenceNotPossible extends B
//class MultipleInheritenceNotPossible extends A,B

{  
	
	public static void main(String args[]){  
		MultipleInheritenceNotPossible obj=new MultipleInheritenceNotPossible();  
		obj.msg();
		//Now which msg() method would be invoked?  
	}  
}  
