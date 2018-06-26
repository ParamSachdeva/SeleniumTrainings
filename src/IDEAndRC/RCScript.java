package IDEAndRC;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class RCScript {

	public static void main(String[] args) throws InterruptedException  {


		Selenium driverRCFF = new DefaultSelenium("localhost",4444,"firefox","http://www.google.com");
		driverRCFF.start();
		driverRCFF.open("http://www.fb.com");
		driverRCFF.windowMaximize();
		driverRCFF.click("id=loginbutton");
		Thread.sleep(5000);
		driverRCFF.stop();
		
		
		
		/*
		Selenium driverRCCH = new DefaultSelenium("localhost",4444,"googlechrome","http://www.google.com");
		//driverRCCH.start();
		driverRCCH.start("--disable-web-security");		
		driverRCCH.open("http://www.fb.com");
		driverRCCH.windowMaximize();
		driverRCCH.click("id=loginbutton");
		Thread.sleep(5000);
		driverRCCH.stop();
*/
/*
		Selenium driverRCIE = new DefaultSelenium("localhost",4444,"iehta","http://www.google.com");
		driverRCIE.start();
		driverRCIE.start("--disable-web-security");
		driverRCIE.open("http://www.fb.com");
		driverRCIE.windowMaximize();
		driverRCIE.click("id=loginbutton");
		Thread.sleep(5000);
		driverRCIE.stop();
	}
*/
	}
}
