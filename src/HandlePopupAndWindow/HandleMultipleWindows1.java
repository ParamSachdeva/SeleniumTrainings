package HandlePopupAndWindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HandleMultipleWindows1 {

	public static void main(String[] args) {WebDriver driver=new FirefoxDriver();

	driver.manage().window().maximize();
	driver.get("http://www.naukri.com/");
	String parent=driver.getWindowHandle();
	Set<String>s1=driver.getWindowHandles();

	// Now we will iterate using Iterator
	Iterator<String> I1= s1.iterator();

	while(I1.hasNext())
	{
		String child_window=I1.next();

		if(!parent.equals(child_window))
		{
			driver.switchTo().window(child_window);

			System.out.println(driver.switchTo().window(child_window).getTitle());

			driver.close();
		}

	}
	driver.switchTo().window(parent);
	}
}
