package IDEAndRC;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook {

	public static void main(String []args) throws Exception {
Thread.sleep(13000);
		WebDriver driver;
		String baseUrl;
		StringBuffer verificationErrors = new StringBuffer();

		driver = new FirefoxDriver();
		baseUrl = "https://www.facebook.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get(baseUrl + "/");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("xyz.com");
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("xyz123");
		driver.findElement(By.xpath(".//*[@type='submit']")).click();
		try {
			assertTrue(driver.findElement(By.xpath(".//*[@id='globalContainer']/div[3]/div/div/div/a")).getText().matches("^Forgotten password[\\s\\S]$"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		System.out.println("postive test case pass");
		try {
			assertEquals(driver.findElement(By.xpath(".//*[@id='globalContainer']/div[3]/div/div/div/a")).getText(), "xyz");
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		System.out.println("Negative test fail but test steps not skipped");
		assertTrue(driver.findElement(By.xpath(".//*[@id='globalContainer']/div[3]/div/div/div/a")).getText().matches("^Forgotten password[\\s\\S]$"));
		System.out.println("postive test case pass");
		assertEquals(driver.findElement(By.xpath(".//*[@id='globalContainer']/div[3]/div/div/div/a")).getText(), "xyz");
		System.out.println("Negative test fail and test steps skipped");

		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}


}
