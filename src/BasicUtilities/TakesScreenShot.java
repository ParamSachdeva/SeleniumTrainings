package BasicUtilities;

import java.awt.font.OpenType;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.TakesScreenshot;


public class TakesScreenShot {




	public static void main(String[] args) throws IOException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ryancramer.com/journal/entries/select_multiple/");
		driver.manage().window().maximize();		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C://Param//CCS//Any.png"));		
		driver.close();
	}

}
