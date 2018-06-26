package BasicUtilities;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AutoItWithExternalFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		try{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.freepdfconvert.com/");
		driver.manage().window().maximize();
		WebElement upload = driver.findElement(By.id("clientUpload"));
		upload.sendKeys("E:\\Project\\IIJT\\Session Documents DayWise\\Day8 - Selenium\\Selenium Topics to cover.txt");
		}
		catch (NoSuchElementException e)
		{
		System.out.println("");
		
		}
		catch (StaleElementReferenceException e)
		{
			System.out.println("");
		}
		catch (WebDriverException e)
		{
			System.out.println("");
		}
		catch (Exception e)
		{
			System.out.println("");
		}
		finally
		{
			System.out.println("");
		}
		//upload.click();

		//Process p = Runtime.getRuntime().exec("E:\\\\Project\\\\SessionsContent\\\\Santosh\\\\1.exe");
		//p.waitFor();		

		//driver.close();


	}
}