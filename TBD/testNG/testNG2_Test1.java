package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


@Test
public class testNG2_Test1 {
	static WebDriver driver; 
	
	@BeforeClass
	public void driverIntialization() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E://Project//SeleniumWorkshop//resources//chromedriver_win32_2//chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
	}
	
	
	@Parameters("browser")
	
	@Test(timeOut = 3000, priority=1, description = "Open Paytm Site and Click Login", enabled = true, groups = { "PAYTM", "LOGIN", "OPENURL"})
	//public void TestNG2_Open_ClickLogin(@Optional("firefox")  String browser ,ITestResult tr) throws Exception
	public void TestNG2_Open_ClickLogin(@Optional("chrome")  String browser) throws Exception
	{
		driver.get("https://paytm.com/");
		  //System.out.println(tr.getName()+ "--Test method Open\n");
		WebElement logbtn = driver.findElement(By.xpath("//div[text()='Log In/Sign Up']"));
		logbtn.click();
	}
	@Test(timeOut = 3000, description = "Switch Frame", enabled = true, dependsOnMethods = {
	"TestNG2_Open_ClickLogin" }, groups = { "PAYTM","SWITCH"})	
	public static void TestNG2_SwitchFrame() throws Exception
	{
		driver.switchTo().frame(2);	
	}
	
	@Test(timeOut = 3000, description = "Sign In with Credentials", enabled = true, dependsOnMethods = {
	"TestNG2_SwitchFrame" }, groups = { "PAYTM","SIGNIN"})	
	
	public void TestNG2_SignIn() throws Exception
	{
		WebElement usrInput = driver.findElement(By.id("input_0"));
		WebElement passInput = driver.findElement(By.id("input_1"));
		WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		usrInput.sendKeys("hello");
		passInput.sendKeys("helllo");
		loginbtn.click();
	}
	
	@Test(timeOut = 3000, description = "Verify Login Successfull", enabled = true, dependsOnMethods = {
	"TestNG2_SignIn" }, groups = { "PAYTM","VERIFY"})	
		public void TestNG2_VerifyLogin() throws Exception
	{
		WebElement errorText = driver.findElement(By.xpath("//span[@class='error']"));
		Assert.assertEquals(errorText.getText(), "Email incorrect.");
		Thread.sleep(3000);
	}
	
	@AfterClass
	public void TestNG2_Closedriver() throws Exception
	{
		driver.close();
	}

}