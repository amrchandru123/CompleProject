import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChanIronLog {
     WebDriver driver;
    private static Logger log = LogManager.getLogger(ChanIronLog.class.getName());
	public  void main(String[] args) {
		// TODO Auto-generated method stub
     
		log.info("really");
		System.out.println("i m chandru");
		//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\driverCHROME\\chromedriver.exe");
        //driver = new 	ChromeDriver();
        //driver.get("https://demoqa.com/text-box");
	}
	
	
	public void iron1()
	{
		log.info("really");
		System.out.println("i m chandru");
	}
	public void iron2()
	{
		log.info("good");
		System.out.println("i m good person");
		
	}
	public void iron3()
	{
		log.info("greate");
		System.out.println("i m active");
	}
	public void iron4()
	{
		log.info("to good");  
		System.out.println("i m really strict");
	}

}
