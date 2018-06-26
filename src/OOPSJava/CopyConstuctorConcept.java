package OOPSJava;
class CopyConstuctorConcept{  
    int id;  
    String name;  
    CopyConstuctorConcept(int i,String n){  
    id = i;  
    name = n;  
    }  
      
    CopyConstuctorConcept(CopyConstuctorConcept s){  
    id = s.id;  
    name =s.name;  
    }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    CopyConstuctorConcept s1 = new CopyConstuctorConcept(111,"Karan");  
    CopyConstuctorConcept s2 = new CopyConstuctorConcept(s1);  
    s1.display();  
    s2.display();  
   }  
}  