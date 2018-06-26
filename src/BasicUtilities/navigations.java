package BasicUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E://Project//SeleniumProject//resources//chromedriver.exe");
		WebDriver driver = new ChromeDriver();			
		driver.get("http://www.flipkart.com/");
		driver.navigate().to("http://snapdeal.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.quit();
	}

}
