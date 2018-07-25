package BasicUtilities;

import java.util.HashMap;
import java.util.Map.Entry;


public class HashMap1 {

	public static void main(String[] args) {
		 HashMap<Integer,String> hm=new HashMap<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(102,"Rahul"); 
		  hm.put(101,"Vijay");  
		   
		  
		  for(Entry<Integer, String> m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }

	}

}
