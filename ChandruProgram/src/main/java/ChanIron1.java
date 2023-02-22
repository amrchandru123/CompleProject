import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChanIron1 {

	WebDriver driver;
	@BeforeTest
	public void best1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\driverCHROME\\chromedriver.exe");
        driver = new 	ChromeDriver();
        driver.get("https://demoqa.com/buttons");
	}
	
          @AfterTest
	public void best3()
	{
		driver.quit();
	}
          @Test
	public void best2()
	{
		ChanIron pm = new ChanIron(driver);
		pm.click();
		
	}
}
