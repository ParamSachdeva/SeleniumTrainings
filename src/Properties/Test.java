package Properties;
import java.util.*;  
import java.io.*;  
public class Test {  
	public static void main(String[] args)throws Exception{  
		FileReader reader=new FileReader("E:\\Project\\IIJT\\Selenium2.X\\src\\Properties\\config.properties");  

		Properties p=new Properties();  
		p.load(reader);  

		System.out.println(p.getProperty("user"));  
		System.out.println(p.getProperty("password"));
		p.setProperty("user","Paramjeet Singh");  
		System.out.println(p.getProperty("user"));
	}  
}  