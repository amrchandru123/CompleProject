
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class ChanComplete2 {
   WebDriver driver;
	//private static Logger log = LogManager.getLogger(ChanComplete2.class.getName());
	@BeforeTest
	
	public void chanco1()
	{
		//log.info("driver setting code");
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\driverCHROME\\chromedriver.exe");
         driver = new 	ChromeDriver();
         driver.get("https://demoqa.com/text-box");
	}
	@Test
public void namesend()
{
		//log.info("sending name to the username");
	ChanCmplete c= new ChanCmplete(driver);
	    c.name("chandru");
	}
	@AfterTest   
	
	
	public void qu()
	{
		driver.quit();
	}
	
}