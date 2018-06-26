package pageObjectModel;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AdvancedExecution {

	 	  
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "E://Project//SeleniumWorkshop//resources//chromedriver_win32_2//chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
		

		
		/*AdvancedOR.Locator(driver,"id","email").sendKeys("qqqq");
		AdvancedOR.Locator(driver,"name","pass").sendKeys("qqqq");
		AdvancedOR.Locator(driver,"xpath","//label[@id='loginbutton']").click();
		AdvancedOR.Locator(driver,"id","email").sendKeys("qqqq");
		AdvancedOR.Locator(driver,"name","pass").sendKeys("qqqq");
		*/
		
		
		LocatorStructure.Locator(driver, OR_FBLoginPage.Username).sendKeys("qqq");;
		LocatorStructure.Locator(driver, OR_FBLoginPage.Password).sendKeys("qqq");;
		LocatorStructure.Locator(driver, OR_FBLoginPage.LoginButton).click();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("E:\\Project\\IIJT\\Session Documents DayWise\\Day9 - Selenium\\screenshot.png"));
        driver.close();
	}
}
