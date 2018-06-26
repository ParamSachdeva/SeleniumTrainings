package JavaCollection;
import java.util.*;
import java.util.Map.Entry;  
class CollectionMap{  
 public static void main(String args[]){  
  Map<Integer,String> map=new HashMap<Integer,String>();  
  map.put(100,"Amit");  
  map.put(101,"Amit");  
  map.put(102,"Rahul");  
  for(Map.Entry m:map.entrySet()){  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  
 }  
}  