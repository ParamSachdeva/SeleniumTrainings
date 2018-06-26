package BasicUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.*;//.HtmlUnitDriver;
import org.openqa.selenium.*;

/*
HtmlUnit
Ghost
PhantomJS
ZombieJS
Watir-webdriver
 */

public class Headless1{
	public static void  main(String[] args) {

		WebDriver unitDriver = new HtmlUnitDriver();

		unitDriver.get("http://google.com");

		System.out.println("Title of the page is -> " + unitDriver.getTitle());

		WebElement searchBox = unitDriver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium");
		WebElement button = unitDriver.findElement(By.name("gbqfba"));
		button.click();
		System.out.println("Title of the page is -> " + unitDriver.getTitle());
	}

}
