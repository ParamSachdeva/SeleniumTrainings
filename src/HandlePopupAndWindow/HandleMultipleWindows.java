package HandlePopupAndWindow;

import javax.swing.JOptionPane;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HandleMultipleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://Project//SeleniumWorkshop//resources//chromedriver_win32_2//chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(chromeOptions);
		// It will open Naukri website with multiple windows
		driver.get("http://www.naukri.com/");

		// To get the main window handle
		String mainWindow =  driver.getWindowHandle();		
		
		for (String Child_Window : driver.getWindowHandles()){

			if(!Child_Window.equals(mainWindow)){
			System.out.println((driver.switchTo().window(Child_Window).getTitle()));
			//driver.quit();
			driver.close();
			//JOptionPane.showMessageDialog(null, "done");
			}
		}
		driver.switchTo().window(mainWindow);  
		System.out.println(driver.getTitle());
		//driver.close();
	}
}
