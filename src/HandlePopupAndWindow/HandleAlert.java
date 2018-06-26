package HandlePopupAndWindow;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get("http://www.htmlite.com/JS018.php");
		driver.manage().window().maximize();
		WebElement clk = driver.findElement(By.xpath("//input"));
		
		clk.click();
		Thread.sleep(5000);
		Alert simpleAlert = driver.switchTo().alert();
		String alertText = simpleAlert.getText();
		System.out.println("Alert text is " + alertText);
		Thread.sleep(2000);
		simpleAlert.accept();	
		driver.close();
		
	}

}
