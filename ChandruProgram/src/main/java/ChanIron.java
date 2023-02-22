import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ChanIron {
  
	WebDriver driver;
	ChanIron(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(d,this);
	}
	@FindBy(id="doubleClickBtn")
	WebElement button;

@Test
public void  click()
{
	Actions act = new Actions(driver);
	act.doubleClick(button).perform();
	}
}