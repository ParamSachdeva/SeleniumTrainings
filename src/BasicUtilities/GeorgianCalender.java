package BasicUtilities;

import java.util.Calendar;
import java.util.GregorianCalendar;



public class GeorgianCalender{

	public static void main(String[] args) throws InterruptedException {
		int day, month, year;
		GregorianCalendar date = new GregorianCalendar();
		
		day = date.get(Calendar.DAY_OF_MONTH)-29;
		month = date.get(Calendar.MONTH)+2;
		year = date.get(Calendar.YEAR);
		
		
		
		
		
		String today = "a_"+year+"_"+month+"_"+day;
		
		System.out.println( "//a[@id='" +  today + "']" );
		
		
		/*
		System.out.println(today);
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.yatra.com/");
		
		driver.findElement(By.id("BE_flight_depart_date")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='" + today + "']")).click();
	*/
	}

}
