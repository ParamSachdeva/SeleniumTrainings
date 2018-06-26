package BasicUtilities;
import java.util.List;
//import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GetAllLinksName {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://www.w3schools.com");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (int i = 0; i < links.size();i++)
		{
			if(!links.get(i).getText().isEmpty())
			{
				System.out.println("Link Name : " + links.get(i).getText() + ", Link URL: "+links.get(i).getAttribute("href"));
			}	
		}
		driver.close();
	}

}
