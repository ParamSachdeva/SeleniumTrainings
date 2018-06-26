package AdhocQueries;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class NewTabOpen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		try{
			System.setProperty("webdriver.chrome.driver", "E:\\Project\\IIJT\\Tools\\chromedriver\\chromedriver.exe");
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--start-maximized");
			WebDriver driver = new ChromeDriver(co);
			driver.get("https://business.twitter.com/start-advertising");
			driver.findElement(By.linkText("Advertise")).click();
			Thread.sleep(3000);
			//driver.close();
			driver.quit();

		}
		catch(NoSuchElementException ex)
		{

			System.out.println("Unable to locate element, maybe locating before browser launched");
			System.out.println(ex.getStackTrace());
		}	




	}

}
