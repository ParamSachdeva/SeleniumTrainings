package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Slash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			WebDriver se = new FirefoxDriver();
			se.navigate().to("https://google.com");
			se.manage().window().maximize();
			//WebElement xyz = se.findElement(By.xpath("//div[@id='SIvCob']//a"));
			//xyz.click();
			//List <WebElement> links = se.findElements(By.tagName("a"));
			//List <WebElement> links = se.findElements(By.xpath("//a"));
			WebElement xyz = se.findElement(By.xpath("/a"));
			System.out.println("Linke Text : "+ xyz.getText());
			System.out.println("Linke URL : "+ xyz.getAttribute("href"));
		
			
			/*System.out.println(links.size());
			for (int i =0; i < links.size(); i++ )
			{
				System.out.println("Linke Text : "+ links.get(i).getText());
				System.out.println("Linke URL : "+ links.get(i).getAttribute("href"));
			}*/
			
			
			se.quit();
		}
		catch(NoSuchElementException ex)
		{

			System.out.println("Unable to locate element, maybe locating before browser launched");
			System.out.println(ex.getStackTrace());
		}	


	}

}
