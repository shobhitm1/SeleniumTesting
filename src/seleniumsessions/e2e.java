package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\Shobhit\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com"); // URL in the browser
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("It is enabled");
			Assert.assertTrue(false);
		} else {
			System.out.println("It is not enabled");
			Assert.assertTrue(true);
		}
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		// driver.findElement(By.id("divpaxinfo")).click();
		Select s = new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']")));
		s.selectByValue("AED");
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		System.out.println("Success Search");
		Thread.sleep(5000);
		System.out.println("New title is:>>" + " " + driver.getTitle());

	}

}
