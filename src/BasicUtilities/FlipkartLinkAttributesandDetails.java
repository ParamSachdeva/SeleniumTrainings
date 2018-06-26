package BasicUtilities;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartLinkAttributesandDetails {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		//System.out.println(driver.findElement(By.xpath("//a[text()='Gift Card']")).getAttribute("href"));
		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (int i = 0; i < links.size();i++)
		{
			if(!links.get(i).getText().isEmpty())
			{
				System.out.println("Link Name : " + links.get(i).getText() + ", Link URL: "+links.get(i).getAttribute("href"));
			}	

		}
		driver.quit();
		//taskkill /im chromedriver.exe /f
		
		
	}
}