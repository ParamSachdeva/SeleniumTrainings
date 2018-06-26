package BasicUtilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;



public class TrialRCVSWebDriver {

	public static void main(String[] args) throws InterruptedException  {
	
		
		Selenium driverRC = new DefaultSelenium("localhost",4444,"firefox","http://www.google.com");
		driverRC.start();
		driverRC.open("http://www.fb.com");
		driverRC.windowMaximize();
		driverRC.click("id=loginbutton");
		Thread.sleep(5000);
		driverRC.stop();


	/*	
		WebDriver driver = new FirefoxDriver();
		//WebDriver driverIE = new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://fb.com/");
		
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
		driver.close();
	*/

		/*
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		Thread.sleep(2000);
		//driver.close();

		WebElement logbtn = driver.findElement(By.xpath(".//*[@id='user-detail']/div/div/div[5]/span/a[1]"));
		WebElement usrInput = driver.findElement(By.id("input_0"));
		WebElement passInput = driver.findElement(By.id("input_1"));
		WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		WebElement errMsg = driver.findElement(By.xpath("//span[contains(@ng-bind,'errorMessage')]"));

		Actions act = new Actions(driver);
		Action builder = act.moveToElement(logbtn).doubleClick().build();
		builder.perform();
		
		loginbtn.click();
		

		//logbtn.click();
		//usrInput.sendKeys("8826512817");
		//passInput.sendKeys("password");
		loginbtn.click();
		String msg = errMsg.getText();
		System.out.println("Error msg is #" + msg.equals("Please enter valid Username and Password."));
*/
	}


}
