package BasicUtilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownEx {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "C://Users//paramjeet.singh//workspace//CCS//src//javaSesion//Resources//chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get("http://www.ifsccodebank.com/");
		driver.manage().window().maximize();
		WebElement bank = driver.findElement(By.id("BC_ddlBank"));
		WebElement state = driver.findElement(By.id("BC_ddlState"));
		WebElement dist = driver.findElement(By.id("BC_ddlDistrict"));

		Select dd1 = new Select(bank);
		dd1.selectByVisibleText("Axis Bank");

		WebElement bank1 = driver.findElement(By.id("BC_ddlBank"));
		Select dd2 = new Select(bank1);
		dd2.selectByIndex(3);

		WebElement bank2 = driver.findElement(By.id("BC_ddlBank"));
		Select dd3 = new Select(bank2);
		dd3.selectByValue("9");
		
		
		/*
		WebElement bank1 = driver.findElement(By.id("BC_ddlBank"));
		Select dd2 = new Select(bank);		
		dd2.selectByIndex(3);
		
		
		WebElement bank2 = driver.findElement(By.id("BC_ddlBank"));
		Select dd3 = new Select(bank);		
		dd2.selectByValue("9");
		
		
		//WebElement state = driver.findElement(By.id("BC_ddlState"));
		//Thread.sleep(7000);
		//dd1.selectByIndex(2);
		

		/*
		dd2.selectByVisibleText("Assam");
		//Thread.sleep(7000);
		//WebElement dist = driver.findElement(By.id("BC_ddlDistrict"));
		//dd1.selectByValue("kamrup");
		Select dd3 = new Select(dist);

		dd3.selectByVisibleText("Jorhat");
		Thread.sleep(2000);
		 */
		driver.close();



	}

}
