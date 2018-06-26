package DataDrivenFrameworkUsingApachePOI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCase {

		public static void main(String[] args) throws Exception {

		//This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method
		ExcelUtils.setExcelFile(Constant.TestDataSheet,"Login");
		
		System.setProperty("webdriver.chrome.driver", "E://Project//SeleniumWorkshop//resources//chromedriver_win32_2//chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(Constant.URL);
		Reusable_SignIn_Action.Login(driver);
		System.out.println("Login Successfully, now it is the time to Log Off buddy.");
		driver.quit();
		
		//This is to send the PASS value to the Excel sheet in the result column.
		ExcelUtils.setCellData("Pass", 1, 7);
		ExcelUtils.setCellData("Pass", 2, 7);
		ExcelUtils.setCellData("Fail", 3, 7);
		ExcelUtils.setCellData("Pass", 4, 7);
		ExcelUtils.setCellData("Pass", 5, 7);
		
	}

}