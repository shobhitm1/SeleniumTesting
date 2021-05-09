package seleniumsessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdown 
{
@Test
public static void star()
{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shobhit\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://spicejet.com/");
		(driver.findElement(By.xpath("//div[@id='divpaxinfo']"))).click();
		System.out.println("Adult Option is clicked");
		Select s =new Select(driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_DropDownListCurrency\']")));
		s.selectByValue("AED");
		//s.selectByIndex(6);//Three ways to grab select dropdown.
		//s.selectByVisibleText("INR");
//		s.deselectAll();//deselect option
	}


}
