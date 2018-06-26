package BasicUtilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class radioBtn {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("qqqq");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("qqqq");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		WebElement a1 = driver.findElement(By.xpath("//input[@type='radio'][@value='roundtrip']"));
		WebElement a2 = driver.findElement(By.xpath("//input[@type='radio'][@value='oneway']"));		
		if (!a1.isSelected())
		{
			a1.click();
		}
		
		if(!a2.isSelected())
		{
			a2.click();
		}	
		
		
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
