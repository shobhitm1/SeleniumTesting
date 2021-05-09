package seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestiveDropdowns {
	//*[@id="fromCity"]
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\Shobhit\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		////input[@id='fromCity']
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement a= driver.findElement(By.cssSelector(".fsw_inputBox.searchCity.inactiveWidget"));
		Actions act =new Actions(driver);
		act.moveToElement(a).click().build().perform();
		
		
		WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));

		source.sendKeys("MUM");

		Thread.sleep(2000);

		source.sendKeys(Keys.ARROW_DOWN);
		

		source.sendKeys(Keys.ENTER);

		// Enter text Bangalore to destination search

		WebElement destination = driver.findElement(By.xpath("//input[@placeholder='To']"));

		destination.sendKeys("Bengaluru");

		Thread.sleep(2000);

		destination.sendKeys(Keys.ARROW_DOWN);

		destination.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		/*
		 * Thread.sleep(3000); WebElement
		 * source=driver.findElement(By.xpath("//*[@id='fromCity']")); Actions actions =
		 * new Actions(driver);
		 * actions.moveToElement(source).click().sendKeys(source,"MUM");
		 * Thread.sleep(2000); actions.build().perform();
		 * 
		 * WebElement destination=driver.findElement(By.xpath("//input[@id='toCity']"));
		 * actions.moveToElement(destination).click().sendKeys(destination,"DEL");
		 * //driver.findElement(By.id(
		 * "webklipper-publisher-widget-container-notification-close-div")).click();
		 */			
		
		
	}

}
