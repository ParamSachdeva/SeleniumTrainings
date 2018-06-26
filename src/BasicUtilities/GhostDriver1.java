package BasicUtilities;

import java.io.File;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

/*
HtmlUnit
Ghost
PhantomJS
ZombieJS
Watir-webdriver
 */

public class GhostDriver1{
	public static void main(String[] args) {
		File file = new File("E:\\Project\\IIJT\\Tools\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");             
		 System.setProperty("phantomjs.binary.path", file.getAbsolutePath());		        
		WebDriver driver = new PhantomJSDriver();   
		driver.get("https://www.wikipedia.org/");         
		WebElement element = driver.findElement(By.xpath("//a[@id='js-link-box-en']/strong"));  
		JOptionPane.showMessageDialog(null, element.getText());
		//element.sendKeys("Selenium");    
		//element.submit(); 
		//System.out.println("Page title is: " + driver.getTitle());      
		System.out.println(element.getText());
		driver.quit();  
	}

}
