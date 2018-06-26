package BasicUtilities;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class GoogleAutoComplete {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.get("https://google.com");
		WebElement searchBox = driver.findElement(By.id("lst-ib"));

		searchBox.sendKeys("Fish");
		
		

		String textToSelect = "fish curry";
		 List<WebElement> optionsToSelect = driver.findElements(By.tagName("li"));

		    for(int i =0; i < optionsToSelect.size(); i++){
		    	WebElement autoText = driver.findElement(By.xpath("//div[@id='sbse" + i + "']/div[2]/b"));
		        System.out.println(autoText.getText());
		        if(autoText.getText().equals(textToSelect)) {
		            System.out.println("Trying to select: "+textToSelect);
		            autoText.click();
		            break;
		        }
		    }
//http://seleniumeasy.com/selenium-tutorials/working-with-ajax-or-jquery-auto-complete-text-box-using-webdriver

	}

}
