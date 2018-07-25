package BasicUtilities;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LoadExtensions {
	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "E://Project//SeleniumWorkshop//resources//chromedriver_win32_2//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("/path/to/extension.crx"));
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);	
		ChromeDriver driver = new ChromeDriver(capabilities);
	}
}
