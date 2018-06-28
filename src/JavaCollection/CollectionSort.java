package JavaCollection;
import java.util.*;  
class CollectionSort{  
	public static void main(String args[]){  

		ArrayList<String> al=new ArrayList<String>();  
		al.add("Viru");
		al.add("Vikas"); 
		al.add("Saurav");  
		al.add("Mukesh");  
		al.add("Tahir");  

		Collections.sort(al);

		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  

		Collections.sort(al, Collections.reverseOrder());




		Iterator itrrev=al.iterator();  
		while(itrrev.hasNext()){  
			System.out.println(itrrev.next());  
		}  

	}
}  


