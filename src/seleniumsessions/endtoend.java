package seleniumsessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class endtoend {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shobhit\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0"));	
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

	//	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

		{

		System.out.println("its disabled");

		Assert.assertTrue(true);

		}

		else

		{

		Assert.assertTrue(false);

		}
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		   Thread.sleep(2000L);
		  
		   //driver.findElement(By.id("btnclosepaxoption")).click();
		   
		 Select sel1= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		   sel1.selectByVisibleText("5");
		   
		  // Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		   
		   driver.findElement(By.id("divpaxinfo")).click();
		// driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

		   driver.findElement(By.cssSelector("input[value='Search']")).click();

		   // driver.findElement(By.xpath("//input[@value='Search']")).click();

		   // driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		   System.out.println("Success Search");
		   
		   Thread.sleep(5000);
		   System.out.println("New title is:>>"+" "+driver.getTitle());
		   
		   driver.close();

	}

}
