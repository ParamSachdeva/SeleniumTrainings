package BasicUtilities;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;


public class HashMap2 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(101,"Vijay");  
		  hm.put(102,"Rahul");  
		  
		  for(Entry<Integer, String> m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }

	}

}
