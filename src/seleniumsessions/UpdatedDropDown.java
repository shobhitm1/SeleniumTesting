package seleniumsessions;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
public class UpdatedDropDown {
public static void main(String[] args) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
//System.setProperty("webdriver.chrome.driver","C:\\Users\\Shobhit\\Downloads\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://spicejet.com"); //URL in the browser
	driver.manage().window().maximize();
//  //a[@value='MAA']  - Xpath for chennai
//  //a[@value='BLR']
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
driver.findElement(By.xpath("//a[@value='BLR']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
System.out.println("It is enabled");
Assert.assertTrue(true);
}
else {
	Assert.assertTrue(false);
}

}

}

