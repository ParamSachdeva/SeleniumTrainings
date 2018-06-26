package DataDrivenFrameworkUsingApachePOI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn_Page {

	public static WebElement txtbx_UserName (WebDriver driver)
	{
		return driver.findElement(By.id("email"));

	}

	public static WebElement txtbx_Password (WebDriver driver)
	{
		return driver.findElement(By.id("pass"));

	}

	public static WebElement btn_LogIn (WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[@value='Log In']"));

	}

}
