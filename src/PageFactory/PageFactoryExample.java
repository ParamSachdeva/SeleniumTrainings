package PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryExample {
	
	WebDriver driver;
	
	/*Selenium Page Factory Pattern is like an extension to Page Object Model , 
	 * but Page Factory is much enhanced model. To start with, we just need to import package ‘org.openqa.selenium.support.PageFactory’
	"Factory class can be used to make using Page Objects simpler and easier".
	 */
	
	/*@FindBy(how = How.ID, using = "username") 
	private WebElement userName1;
	
	@FindBy(id="username")
	private WebElement userName2;
	
	@FindBy(className=".input.username")
	@CacheLookup
	private WebElement userName3;
	
	@FindBy(tagName = "mylist") 
	private List<WebElement> links;
	*/	
	
	@FindBy(id= "email") 
	private static WebElement userName;
	
	@FindBy(id= "pass") 
	private static WebElement password;
	
	@FindBy(xpath= "//input[@value='Log In']")    
	private static WebElement loginBtn;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E://Project//SeleniumWorkshop//resources//chromedriver_win32_2//chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//intialize all object and load
		PageFactory.initElements(driver, PageFactoryExample.class);
        //======================================
		
		driver.get("http://www.fb.com");
		userName.sendKeys("xyz");
		password.sendKeys("xyz@123");
		loginBtn.click();
		
	}
	
}
