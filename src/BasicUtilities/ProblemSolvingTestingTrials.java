package BasicUtilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ProblemSolvingTestingTrials {

	public static void main(String[] args) throws InterruptedException{

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		String mainWindow =  driver.getWindowHandle();
		Thread.sleep(2000);

		WebElement logbtn = driver.findElement(By.linkText("Log In / Sign Up"));
		logbtn.click();
	//Thread.sleep(10000);	
		
		
		//String subWindowHandler = null;
		
		//Set<String> handles = driver.getWindowHandles();
	//	Iterator<String> iterator = handles.iterator();
		
		
	//	while (iterator.hasNext()){
		//    subWindowHandler = iterator.next();
		//}
	
		//driver.switchTo().window(subWindowHandler); 
//		for (String Child_Window : driver.getWindowHandles()){
//		
//			if(!Child_Window.equals(mainWindow)){
//				driver.switchTo().window(Child_Window);
		driver.switchTo().frame(2);	
		WebElement usrInput = driver.findElement(By.id("input_0"));
				WebElement passInput = driver.findElement(By.id("input_1"));
				WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
				usrInput.sendKeys("hello");
				passInput.sendKeys("helllo");
						
//		}
		
		   
	//	}
	}}
		//WebElement DynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("DynamicElement")));
  
		//	WebElement usrInput = (WebElement) (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("input_0")));
			 //WebElement usrInput = wait.until(Function<>()){}
		
		
		
		
		//WebElement usrInput = driver.findElement(By.id("input_0"));
		//WebElement passInput = driver.findElement(By.id("input_1"));
		//WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		
		//usrInput.sendKeys("hello");
		//passInput.sendKeys("helllo");
		
	/*	
		
		List xyz = driver.getWindowHandles();
		
		for (String Child_Window : driver.getWindowHandles()){

			if(!Child_Window.equals(mainWindow)){
			driver.switchTo().window(Child_Window);
			
			WebElement usrInput = driver.findElement(By.id("input_0"));
			WebElement passInput = driver.findElement(By.id("input_1"));
			WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
			
			usrInput.sendKeys("9999999999");
			passInput.sendKeys("password");
			loginbtn.click();
			
			WebElement errMsg = driver.findElement(By.xpath("//span[contains(@ng-bind,'errorMessage')]"));
			String msg = errMsg.getText();
			System.out.println("Error msg is #" + msg.equals("Please enter valid Username and Password."));
			
			//driver.close();
			}
			
			driver.switchTo().window(mainWindow);  
			driver.close();
		}
		
		*/
		

	