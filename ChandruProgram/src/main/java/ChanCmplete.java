import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ChanCmplete {

	WebDriver driver;
  public 	ChanCmplete(WebDriver d)
	{
		 driver = d ;
		 PageFactory.initElements(d,this);
	}
  @FindBy(id="userName")
      WebElement username;
  @Test
  public void name(String nm)
  {
	  username.sendKeys(nm);
  }
	
}
