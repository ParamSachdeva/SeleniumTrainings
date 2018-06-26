package BasicUtilities;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E://Project//SeleniumWorkshop//resources//chromedriver_win32_2//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://demos.telerik.com/kendo-ui/treeview/dragdrop");
		Thread.sleep(3000);
		driver.manage().window().maximize();

		WebElement sf = driver.findElement(By.xpath("//span[text()='Sofas']"));
		WebElement of = driver.findElement(By.xpath("//span[text()='Occasional Furniture']"));
		WebElement of1 = driver.findElement(By.xpath("//span[text()='Decor']"));


		Actions dragNDrop = new Actions(driver);

		/*
		dragNDrop.clickAndHold(sf).moveToElement(of1).release().build().perform();
		 */
		Action act1 = dragNDrop.clickAndHold(sf).moveToElement(of1).release().build();
		act1.perform();


		/*//WebElement tc = driver.findElement(By.xpath("//span[text()='Tables & Chairs']"));

		Thread.sleep(4000);
		Actions dropdown = new Actions(driver);
		dropdown.dragAndDrop(sf,of).build().perform();
		Thread.sleep(4000);
		Action builder = dropdown.clickAndHold(sf).moveToElement(of1).release(of1).build();
		builder.perform();
		Thread.sleep(3000);
		//WebElement sf1 = driver.findElement(By.xpath("//span[text()='Sofas']"));
		//WebElement tc = driver.findElement(By.xpath("//span[text()='Tables & Chairs']"));
		//Action builder2 = dropdown.clickAndHold(sf1).moveToElement(tc).release(tc).build();
		//builder2.perform();
		//Thread.sleep(3000);
		//dropdown.dragAndDrop(of,sf).build().perform();
		 */		

		//driver.close();		

	}

}
