package BasicUtilities;

//http://www.apache.org/dyn/closer.cgi/logging/log4j/1.2.17/log4j-1.2.17.zip

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class log4j {

	static final Logger logger = LogManager.getLogger(log4j.class.getName());
	
	
	public static void main(String[] args) throws InterruptedException {

		DOMConfigurator.configure("log4j.xml");
		logger.info("# # # # # # # # # # # # # # # # # # # # # # # # # # # ");
		logger.info("TEST Has Begin");

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();logger.info("Maximize Window");
		driver.get("https://paytm.com/");logger.info("Open Paytm Application");
		WebElement logbtn = driver.findElement(By.linkText("Log In / Sign Up"));

		logbtn.click();logger.info("Click Login/Signup Application");

		driver.switchTo().frame(2);	logger.info("Switch to Frame");
		WebElement usrInput = driver.findElement(By.id("input_0"));
		WebElement passInput = driver.findElement(By.id("input_1"));
		WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));

		usrInput.sendKeys("8833883388");logger.info("Enter contact number");
		passInput.sendKeys("helllo");logger.info("Enter password");
		loginbtn.click();logger.info("Click Login");

		WebElement errorText = driver.findElement(By.xpath("//span[@class='error']"));
		String Text = errorText.getText();logger.info("Get Email incorrect text");

		if (Text.equals("Email incorrect.")){
			logger.info("Email incorrect wrong message is as per the design");
		}
		else{
			logger.error("Email incorrect message doesn't match");}	

		logger.info("Test has stopped");
		driver.close();
	}}