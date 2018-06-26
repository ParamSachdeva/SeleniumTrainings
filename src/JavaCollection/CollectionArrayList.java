package JavaCollection;
import java.util.*;  
class CollectionArrayList{  
	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Hanish");  
		list.add("Ajay");  
//list.remove(0);
/*
		ArrayList<String> list2=new ArrayList<String>();  
		list2.add("Ravi");  
		list2.add("Hanish");  		
		list2.add("Gulati");  			  
		//list.removeAll(list2);
		//list.retainAll(list2);

*/		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		//Traversing list through FOr Loop
		/*		for(String obj:list)  

		{
			System.out.println(obj);  

		}  
		 */	} 
}
