package BasicUtilities;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
*/


public class ErrorCodeIfAllORPopulatedEarlier {

	public static void main(String[] args) throws InterruptedException  {

		/*
		Selenium driverRC = new DefaultSelenium("localhost",4444,"firefox","http://www.facebook.com");
		driverRC.start();
		driverRC.open("http://www.facebook.com");
		Thread.sleep(5000);
		driverRC.windowMaximize();
		driverRC.click("id=loginbutton");
		Thread.sleep(5000);
		driverRC.stop();
		 */

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(2000);		
		WebElement usrInput = driver.findElement(By.id("email"));
		WebElement passInput = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.xpath("//label[@id='loginbutton']/input"));
		WebElement errMsg = driver.findElement(By.xpath("//div[@class='_1tp8']"));
		
		
		usrInput.sendKeys("8826512817");
		passInput.sendKeys("password");
		login.click();
		//WebElement errMsg = driver.findElement(By.xpath("//div[@class='_1tp8']"));
		System.out.println("Login Status #" + errMsg.getText().contains("The email address or phone number that you've entered doesn't match any account"));
		driver.close();
	}
}
