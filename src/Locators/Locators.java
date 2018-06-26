package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			WebDriver se = new FirefoxDriver();
			//WebElement xyz = se.findElement(By.xpath("//div[text()='Login']"));
			se.navigate().to("https://naukri.com");
			WebElement xyz = se.findElement(By.xpath("//div[text()='Login']"));
//			se.get("https://gmail.com");
//			se.get("https://google.com");
//			se.navigate().back();
//			se.navigate().forward();
			se.navigate().refresh();
			xyz = se.findElement(By.xpath("//div[text()='Login']"));
			se.manage().window().maximize();
			xyz.click();
			se.quit();
		}
		catch(NoSuchElementException ex)
		{
			
			System.out.println("Unable to locate element, maybe locating before browser launched");
			System.out.println(ex.getStackTrace());
		}		//se.close();



		/*System.setProperty("webdriver.chrome.driver", "E:\\Project\\IIJT\\Tools\\chromedriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--start-maximized");
		WebDriver se1 = new ChromeDriver(co);
		se1.get("https://naukri.com");
		WebElement xyz = se1.findElement(By.xpath("//div[text()='Login']"));
		xyz.click();
		se1.quit();
		 */


		/*System.setProperty("webdriver.ie.driver", "E:\\Project\\IIJT\\Tools\\iedriver\\IEDriverServer.exe");
		WebDriver se2 = new InternetExplorerDriver();
		se2.get("https://naukri.com");
		WebElement xyz = se2.findElement(By.xpath("//div[text()='Login']"));
		xyz.click();
		se2.quit();*/

		/*
		se.get("http://naukri.com");
		se.findElement(By.xpath("//*")).sendKeys(Keys.CONTROL +"t");
		se.get("https://login.yahoo.com");
		se.findElement(By.xpath("//*")).sendKeys(Keys.CONTROL +"t");
		se.findElement(By.xpath("//*")).sendKeys(Keys.CONTROL +"t");
		 */



		//se.close();





		//se.navigate().to("");


	}

}
