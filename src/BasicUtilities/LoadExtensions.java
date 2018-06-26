package BasicUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoadExtensions {
	
	ChromeOptions options = new ChromeOptions();
	System.setProperty("webdriver.chrome.driver", "E://Project//SeleniumWorkshop//resources//chromedriver_win32_2//chromedriver.exe");
	options.addExtensions(new File("/path/to/extension.crx"));
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	
	
	ChromeDriver driver = new ChromeDriver(capabilities);
}

