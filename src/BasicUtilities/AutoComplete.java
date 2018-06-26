package BasicUtilities;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;




public class AutoComplete {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E://Project//SeleniumWorkshop//resources//chromedriver_win32_2//chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in");		
		driver.findElement(By.id("lst-ib")).sendKeys("fish");
		/*driver.findElement(By.id("lst-ib")).sendKeys(Keys.SPACE);
		Thread.sleep(3000);*/




		List <WebElement> autoT = driver.findElements(By.xpath("(//div[@class='sbqs_c'])"));
		//List <WebElement> autoT = driver.findElements(By.cssSelector("ul.sbsb_b"));

		try{
			System.out.println(autoT.size());
			for (int i = 0; i < autoT.size();i++)
			{
				System.out.println(autoT.get(i).getText());
				if (autoT.get(i).getText().equals("fish images"))
				{
					autoT.get(i).click();	
					break;				
				}
			}
		}
		catch (Exception e)
		{
			driver.quit();
		}





		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(3000);
		//driver.close();
		//driver.quit();

	}

}
