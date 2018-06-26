package BasicUtilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class MultipleSelect {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "E://Project//SeleniumProject//resources//chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		//System.setProperty("webdriver.ie.driver", "C://Users//paramjeet.singh//workspace//Trial//Resources//IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();		
		//WebDriver driver = new FirefoxDriver();
		//driver.get("http://www.ryancramer.com/journal/entries/select_multiple/");
		driver.get("http://toolsqa.wpengine.com/automation-practice-form");
		driver.manage().window().maximize();
		//Select sc = new Select(driver.findElement(By.name("selenium_commands")));
		//WebElement mp = driver.findElement(By.xpath("//select[@id='selenium_commands']"));		
		//Thread.sleep(2000);
		//Select sc = new Select(mp);
		Select sc = new Select(driver.findElement(By.name("selenium_commands")));		
		List<WebElement> option = sc.getOptions();
		
		Actions builder = new Actions(driver);
		Action ms = builder.keyDown(Keys.CONTROL).click(option.get(1)).click(option.get(3)).click(option.get(2)).build();
		ms.perform();
		Thread.sleep(4000);
		sc.deselectAll();
		driver.close();		
	}
}
