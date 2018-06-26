package AdhocQueries;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipKartSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
		try{
			System.setProperty("webdriver.chrome.driver", "E://Project//SeleniumWorkshop//resources//chromedriver_win32_2//chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--start-maximized");
			driver = new ChromeDriver(chromeOptions);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.get("https://www.flipkart.com/");

			driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();

			//driver.switchTo().frame(0);
			//driver.close();
			//driver.switchTo().defaultContent();

			//type in search box
			driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("vivo mobile");

			//click on search button
			driver.findElement(By.className("vh79eN")).click();

			//get page number text
			String pagennumberText = driver.findElement(By.xpath("//span[contains(text(),'Page 1 of')]")).getText();


			String page = pagennumberText.replaceAll("Page 1 of ", "").replaceAll(",", "");
			int page1 = Integer.parseInt(page);
			System.out.println(page1);

			for(int i = 1; i <= page1; i++)
			{
				List <WebElement> noOfItmes = driver.findElements(By.xpath("(//div[@class='MP_3W3 _31eJXZ'])"));

				System.out.println(noOfItmes.size());
				for (int j =1 ; j <= noOfItmes.size(); j++)
				{

					String productName = driver.findElement(By.xpath("(//div[@class='MP_3W3 _31eJXZ'])[" + j + "]//a[@class='_2cLu-l']")).getText();
					System.out.println(productName);
					if (productName.trim().equals("iVoltaa Premium 2.4 Amp QC 5 core 3.3 Ft USB Cable"))
					{

						driver.findElement(By.xpath("(//div[@class='MP_3W3 _31eJXZ'])[" + j + "]//a[@class='_2cLu-l']")).click();
						Thread.sleep(4000);
						driver.quit();
						System.exit(0);
						
					}	
				}
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
		}
		catch (StaleElementReferenceException e)
		{
			System.out.println(e.getStackTrace());
			driver.quit();

		}
		catch (NoSuchElementException e)
		{
			System.out.println(e.getStackTrace());
			driver.quit();

		}
		catch (Exception e)
		{
			System.out.println("Major Exception");
			driver.quit();

		}
	}

}
;