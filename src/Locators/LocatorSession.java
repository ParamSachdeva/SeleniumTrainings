package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorSession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Project\\IIJT\\Tools\\chromedriver\\chromedriver.exe");


		ChromeOptions co = new ChromeOptions();
		co.addArguments("--start-maximized");



		WebDriver driver = new ChromeDriver(co);
		
		//driver.get("https://linkedin.com");
		driver.get("https://www.wikipedia.org/");
		//driver.findElement(By.xpath("//strong[text()='English']")).click();
		driver.findElement(By.xpath("//strong[contains(text(),'lish')]")).click();
		driver.quit();
		//strong[text()='English']
		
		/*
		driver.findElement(By.id("login-email")).clear();
		driver.findElement(By.id("login-email")).sendKeys("XYZ.com");
		driver.findElement(By.id("login-password")).clear();
		driver.findElement(By.id("login-password")).sendKeys("XYZPassword");
		driver.findElement(By.id("login-submit")).click();
		 */		

//		WebElement email = driver.findElement(By.id("login-email"));
//		WebElement password = driver.findElement(By.id("login-password"));
		/*WebElement email = driver.findElement(By.name("session_key"));
		WebElement password = driver.findElement(By.name("session_password"));
		*/
		
		/*WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email or phone number']"));
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		WebElement signin = driver.findElement(By.xpath("//input[@value='Sign in']"));
		
		//input[@id='login-email']
		//WebElement signin = driver.findElement(By.id("login-submit"));
		//WebElement forgetPW = driver.findElement(By.linkText("Forgot password?"));
		//WebElement forgetPW = driver.findElement(By.partialLinkText("Forgot"));
	
		email.clear();
		email.sendKeys("XYZ.com");
		password.clear();
		password.sendKeys("XYZPassword");
		signin.click();

		//forgetPW.click();
		WebElement loginError = driver.findElement(By.id("session_key-login-error"));
		String ErrorText = loginError.getText().toString();
		System.out.println(ErrorText);
		
		
		driver.close();
				
		
		
		//System.out.println(loginError.getText().toString());




*/




	}

}
