package BasicUtilities;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Paytm {

	public static void main(String[] args) throws InterruptedException{

		WebDriver driver = new FirefoxDriver();
		driver.get("https://paytm.com/");
	    Thread.sleep(2000);
	    WebElement logbtn = driver.findElement(By.xpath("//div[3]/div[3]/div"));
	    logbtn.click();	    
	    
	    //driver.switchTo().parentFrame();
	    //driver.switchTo().defaultContent();
	    //Switch to the frame by Name or ID:
	    
	    //driver.switchTo().frame("iframe1");
	    //driver.switchTo().frame("id of the element");
	    
	    //we can switch to the iframe by using index.
	    //driver.switchTo().frame(0);
	    //driver.switchTo().frame(1);
	    
	    
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/v1/api/login?isIframe=true&theme=mp-web']")));
	    driver.findElement(By.xpath(".//*[@id='input_0']")).sendKeys("email");
	    
	    driver.findElement(By.xpath(".//*[@id='input_1']")).sendKeys("passwrd");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath(".//*[@id='loginForm']/div/md-content/button[1]")).click();
	    driver.switchTo().defaultContent();		
		driver.close();
		
	}
}
