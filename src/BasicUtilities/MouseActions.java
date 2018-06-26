package BasicUtilities;

       import java.util.concurrent.TimeUnit;

       import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseActions{

	public static WebDriver driver;

   public static void main(String[] args) {

        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.linkeid.comm");

        WebElement element = driver.findElement(By.linkText("Product Category"));

        Actions action = new Actions(driver);
        Action act = action.moveToElement(element).build(); 
        act.perform();
        

        }

}