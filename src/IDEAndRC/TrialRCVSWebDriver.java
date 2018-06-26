package IDEAndRC;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;



public class TrialRCVSWebDriver {

	public static void main(String[] args) throws InterruptedException  {


		Selenium driverRCFF = new DefaultSelenium("localhost",4444,"firefox","http://www.google.com");
		driverRCFF.start();
		driverRCFF.open("http://www.fb.com");
		driverRCFF.windowMaximize();
		driverRCFF.click("id=loginbutton");
		Thread.sleep(5000);
		driverRCFF.stop();

		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://fb.com/");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
		driver.close();
		
	}
}
