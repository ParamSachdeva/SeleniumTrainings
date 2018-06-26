package AdhocQueries;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaytmChallenge {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://Project//SeleniumWorkshop//resources//chromedriver_win32_2//chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 120);	
		driver.get("https://www.paytm.com/");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[@class='_3HxD']//input[@type='search']")).click();
		driver.findElement(By.xpath("//div[@class='_3HxD']//input[@type='search']")).sendKeys("mobile");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class='_3HxD']//input[@type='search']")).sendKeys(Keys.SPACE);
		//Thread.sleep(2000);				
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_3HxD']//*[contains(text(),'Vivo')]")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='_3HxD']//*[contains(text(),'Vivo')]")));
		//wait.until(ExpectedConditions.presenceOfElementLocated((By) driver.findElement(By.xpath("//div[@class='_3HxD']//*[contains(text(),'Vivo')]"))));
		driver.findElement(By.xpath("//div[@class='_3HxD']//*[contains(text(),'Vivo')]")).click();
		//Thread.sleep(3000);
		//driver.close();
		/*
		List <WebElement> autoItmes = driver.findElements(By.xpath("//div[@class='_3HxD']//li"));
       
		for (int i = 1;i <= autoItmes.size(); i++)
		{
			WebElement itmelist = driver.findElement(By.xpath("//div[@class='_3HxD']//li[" + i + "]//span" ));
			String itmeName = itmelist.getText();
			System.out.println(itmeName);
			if (itmeName.contains("Vivo"))
			{
				itmelist.click();
				break;
			}
		}
		driver.close();*/
		
		/*Iterator itr = autoItmes.iterator();
		while (itr.hasNext())
		{
			
		}
		*/
		
	}

}
