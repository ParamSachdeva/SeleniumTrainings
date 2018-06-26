package BasicUtilities;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class JavaScriptExecutor {


	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement networkImg = driver.findElement(By.xpath("//img[contains(@src,'KxNjS.png')]"));
		
		//js.executeScript("document.getElementById('email').value='hello'");
		js.executeScript("arguments[0].style.border='3px solid red'", networkImg);
		
		Thread.sleep(3000);
		//driver.close();
	}
}